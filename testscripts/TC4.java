package testscripts.AllLinkValidator;
import org.testng.annotations.Test;

import com.cognizant.framework.IterationOptions;

import supportlibraries.DriverScript;
import supportlibraries.TestCase;


/**
 * @author Cognizant
 */
public class TC4 extends TestCase
{
	@Test
	public void runTC4()
	{
		testParameters.setCurrentTestDescription("Test for verifying the links");
		testParameters.setIterationMode(IterationOptions.RunOneIterationOnly);
		//testParameters.setBrowser(Browser.HtmlUnit);
		
		driverScript = new DriverScript(testParameters);
		driverScript.driveTestExecution();
	}
}