'#######################################################################################################################
'Script Description		: Script to invoke the corresponding test script in the local machine
'Test Tool/Version		: VAPI-XP
'Test Tool Settings		: N.A.
'Application Automated	: Mercury Tours
'Author					: Cognizant
'Date Created			: 26/12/2012
'#######################################################################################################################
Option Explicit	'Forcing Variable declarations

'#######################################################################################################################
'Class Description   	: DriverScript class
'Author					: Cognizant
'Date Created			: 09/11/2012
'#######################################################################################################################
Class DriverScript
	
	Private m_strRelativePath
	Private m_blnDebug, m_objCurrentTestSet, m_objCurrentTSTest, m_objCurrentRun
	Private m_strReportPath
	Private m_strCurrentTestParentFolder, m_strCurrentTestName
	Private m_strTestStatus
	
	'###################################################################################################################
	Public Property Let RelativePath(strRelativePath)
		m_strRelativePath = strRelativePath
	End Property
	'###################################################################################################################
	
	'###################################################################################################################
	Public Property Let Debug(blnDebug)
		m_blnDebug = blnDebug
	End Property
	'###################################################################################################################
	
	'###################################################################################################################
	Public Property Set CurrentTestSet(objCurrentTestSet)
		Set m_objCurrentTestSet = objCurrentTestSet
	End Property
	'###################################################################################################################
	
	'###################################################################################################################
	Public Property Set CurrentTSTest(objCurrentTSTest)
		Set m_objCurrentTSTest = objCurrentTSTest
	End Property
	'###################################################################################################################
	
	'###################################################################################################################
	Public Property Set CurrentRun(objCurrentRun)
		Set m_objCurrentRun = objCurrentRun
	End Property
	'###################################################################################################################
	
	
	'###################################################################################################################
	'Function Description   : Function to drive the test execution
	'Input Parameters 		: None
	'Return Value    		: None
	'Author					: Cognizant
	'Date Created			: 11/10/2012
	'###################################################################################################################
   	Public Function DriveTestExecution()
		InvokeBatchFile()
		UploadResultsToQc()
		
		If m_strTestStatus = 0 Then
			DriveTestExecution = "Passed"
		Else
			DriveTestExecution = "Failed"
		End If
	End Function
	'###################################################################################################################
	
	'###################################################################################################################
	Private Sub InvokeBatchFile()
		Dim strScriptPath
		strScriptPath = m_strRelativePath & "\allocator\RunTest.bat"
		
		Dim objTestFactory: Set objTestFactory = TDConnection.TestFactory
		Dim objCurrentTest: Set objCurrentTest = objTestFactory.Item(m_objCurrentTSTest.Field("TC_TEST_ID"))
		
		m_strCurrentTestParentFolder = objCurrentTest.Field("TS_SUBJECT").Name
		m_strCurrentTestName = objCurrentTest.Name
		
		Dim strCurrentTestDescription
		TDConnection.IgnoreHTMLFormat = True
		strCurrentTestDescription = objCurrentTest.Field("TS_DESCRIPTION")
		If strCurrentTestDescription = "" Then
			strCurrentTestDescription = "SKIP"
		End If
		
		m_strReportPath = SetUpTempResultFolder()
		
		Dim strCommandLineArguments
		strCommandLineArguments = """" & m_strReportPath & """ """ &_
									m_strCurrentTestParentFolder & """ """ & m_strCurrentTestName & """ """ &_
									strCurrentTestDescription & """ " & GetTestParameters()
		
		m_strTestStatus = XTools.run(strScriptPath, strCommandLineArguments, -1, True)
	End Sub
	'###################################################################################################################
	
	'###################################################################################################################
	Private Function GetTestParameters()
		Dim objParamValueFactory: Set objParamValueFactory = m_objCurrentTSTest.ParameterValueFactory
		Dim lstParams: Set lstParams = objParamValueFactory.NewList("")
		Dim objParam
		Dim strIterationMode, intStartIteration, intEndIteration
		Dim strBrowser, strBrowserVersion, strPlatform
		
		For Each objParam in lstParams
			Select Case objParam.Name
				Case "IterationMode":
					strIterationMode = GetValue(objParam)
				Case "StartIteration":
					intStartIteration = GetValue(objParam)
				Case "EndIteration":
					intEndIteration = GetValue(objParam)
				Case "Browser":
					strBrowser = GetValue(objParam)
				Case "BrowserVersion":
					strBrowserVersion = GetValue(objParam)
				Case "Platform":
					strPlatform = GetValue(objParam)
			End Select
		Next
		
		GetTestParameters = strIterationMode & " " & intStartIteration & " " & intEndIteration & " " &_
														strBrowser & " " & strBrowserVersion & " " & strPlatform
		
		Set objParam = Nothing
		Set lstParams = Nothing
		Set objParamValueFactory = Nothing
	End Function
	'###################################################################################################################
	
	'###################################################################################################################
	Private Function GetValue(objParam)
		Dim strValue
		strValue = objParam.ActualValue
		If strValue = "" Then
			strValue = "SKIP"
		End If
		
		GetValue = strValue
	End Function
	'###################################################################################################################
	
	'###################################################################################################################
	Private Function SetUpTempResultFolder()
		Dim objFso: Set objFso = CreateObject("Scripting.FileSystemObject")
		
		Dim strTempResultPath	'Using the Windows temp folder to store the results before uploading to QC
		strTempResultPath = objFso.GetSpecialFolder(2) & "\Run_mm-dd-yyyy_hh-mm-ss_XX"
		
		'Create Temp results folder if it does not exist
		If Not objFso.FolderExists (strTempResultPath) Then
			objFso.CreateFolder(strTempResultPath)
		End If
		
		strTempResultPath = strTempResultPath & "\" & m_strCurrentTestName
		
		'Delete test case level result folder if it already exists
		If objFso.FolderExists(strTempResultPath) Then
			objFso.DeleteFolder(strTempResultPath)
			
			'Wait until the folder is successfully deleted
			Do While(1)
				If Not objFso.FolderExists(strTempResultPath) Then
					Exit Do
				End If
			Loop
		End If
		
		'Create separate folder with the test case name
		objFso.CreateFolder(strTempResultPath)
		
		SetUpTempResultFolder = strTempResultPath
		
		'Release all objects
		Set objFso = Nothing
	End Function
	'###################################################################################################################
	
	'###################################################################################################################
	Private Sub UploadResultsToQc()
		TDOutput.Print "Uploading result files..."
		
		Dim strReportName
		strReportName = m_strCurrentTestParentFolder & "_" & m_strCurrentTestName
		
		Dim objFso: Set objFso = CreateObject("Scripting.FileSystemObject")
		
		If objFso.FolderExists(m_strReportPath & "\Excel Results") Then
			AttachFileToTestRun m_strReportPath & "\Excel Results\" & strReportName & ".xls"
		End If
		
		If objFso.FolderExists(m_strReportPath & "\HTML Results") Then
			AttachFileToTestRun m_strReportPath & "\HTML Results\" & strReportName & ".html"
		End If
		
		AttachFolderToTestRun m_strReportPath & "\Screenshots"
		
		If objFso.FolderExists(m_strReportPath & "\Datatables") Then
			AttachFileToTestRun m_strReportPath & "\Datatables\" & m_strCurrentTestParentFolder & ".xls"
			AttachFileToTestRun m_strReportPath & "\Datatables\Common Testdata.xls"
		End If
		
		If Err.Number = 0 Then
			TDOutput.Print "Result files uploaded successfully!"
		Else
			TDOutput.Print "Error occurred while uploading the result files! Please verify the test result files..."
		End If
		
		Set objFso = Nothing
	End Sub
	'###################################################################################################################
	
	'###################################################################################################################
	Private Sub AttachFileToTestRun(strFilePath)
		Dim objFso: Set objFso = CreateObject("Scripting.FileSystemObject")
		If Not objFso.FileExists(strFilePath) Then
			TDOutput.Print "The file to be attached (" & strFilePath & ") is not found!"
			m_strTestStatus = "Failed"
			Exit Sub
		End If
		Set objFso = Nothing
		
		Dim objFoldAttachments: Set objFoldAttachments = m_objCurrentRun.Attachments
		Dim objFoldAttachment: Set objFoldAttachment = objFoldAttachments.AddItem(Null)
		objFoldAttachment.FileName = strFilePath
		objFoldAttachment.Type = 1
		objFoldAttachment.Post
		
		Set objFoldAttachment = Nothing
		Set objFoldAttachments = Nothing
	End Sub
	'###################################################################################################################
	
	'###################################################################################################################
	Private Sub AttachFolderToTestRun(strFolderPath)
		Dim objFso: Set objFso = CreateObject("Scripting.FileSystemObject")
		Dim objFolder: Set objFolder = objFso.GetFolder(strFolderPath)
		Dim objFileList: Set objFileList = objFolder.Files
		Dim objFile
		For each objFile in objFileList
			AttachFileToTestRun objFile.Path
		Next
		
		'Release all objects
		Set objFile = Nothing
		Set objFileList = Nothing
		Set objFolder = Nothing
		Set objFso = Nothing
	End Sub
	'###################################################################################################################
	
End Class
'#######################################################################################################################
