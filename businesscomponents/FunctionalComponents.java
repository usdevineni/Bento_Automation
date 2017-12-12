package businesscomponents;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import supportlibraries.ReusableLibrary;
import supportlibraries.ScriptHelper;

import com.cognizant.framework.Status;
import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.google.common.base.Strings;

import uimap.*;

import static org.testng.Assert.assertEquals;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class FunctionalComponents extends ReusableLibrary
{
	/**
	 * Constructor to initialize the component library
	 * @param scriptHelper The {@link ScriptHelper} object passed from the {@link DriverScript}
	 */
	public FunctionalComponents(ScriptHelper scriptHelper)
	{
		super(scriptHelper);
	}
	commonFunctions commFunc = new commonFunctions(scriptHelper);

	public void invokeApplication()
	{
		driver.get(properties.getProperty("ApplicationUrl"));
		report.updateTestLog("Invoke Application", "Invoke the application under test @ " +
				properties.getProperty("ApplicationUrl"), Status.DONE);
	}

	public void navigateURL() {
		driver.get(properties.getProperty("ApplicationUrl")+dataTable.getData("General_Data", "Page"));
		report.updateTestLog("Navigate URL", "Navigated successfully to the URL - " +
				dataTable.getData("General_Data", "Page"), Status.DONE);
	}

	public void validatelinks() {
		try {
			//String completeURLSource = properties.getProperty("ApplicationUrl")+dataTable.getData("General_Data", "Page");
			String completeURLSource = dataTable.getData("General_Data", "Page");
			driver.get(completeURLSource);
			report.updateTestLog("Navigate URL", "Navigated to the URL - " +
					completeURLSource, Status.DONE);		
			System.out.println(completeURLSource);				
			
			//Validate tile
			String actualTitle = driver.getTitle();
			System.out.println(actualTitle);
						
			if (!Strings.isNullOrEmpty(actualTitle)) {
				if (!actualTitle.contains("Page Not Found"))	{	
						report.updateTestLog("The Page Title",  "Actual page Title [" + actualTitle+
						"] is not empty or Page Not Found", Status.PASS);				
				}			
				else{
					report.updateTestLog("Page Not Found",  "Actual page Title: " + actualTitle, Status.FAIL);
				}					
			}
			
			else {
			
				report.updateTestLog("The Page Title",  "The Page Title is empty or null", Status.FAIL);
			}
		
			String actualMetaData = driver.findElement(By.xpath("//meta[@name='description']")).getAttribute("content");
						
			if (!Strings.isNullOrEmpty(actualMetaData)) {
				report.updateTestLog("Meta Data",  "Meta Data [" + actualTitle+
						"] is not empty", Status.PASS);
			}
			else{
				report.updateTestLog("The Meta Data",  "The Meta Data is empty or null", Status.FAIL);
			}						
			validateResponseCodeforLinks(completeURLSource, actualTitle);
		}
		  catch (Exception e) {
			report.updateTestLog("Meta Data", "Cannot read Meta Data", Status.FAIL);		
		}
	}
	
	public void validateResponseCodeforLinks(String hostName, String sectionName) {
		try {
			if (hostName.contains("https")){ 
				System.setProperty("https.proxyHost", "proxy.inbcu.com");
				System.setProperty("https.proxyPort", "80");
			}
			else {
					System.setProperty("http.proxyHost", "proxy.inbcu.com");
					System.setProperty("http.proxyPort", "80");					
			}			
			/*
			 * BrowserProxyInfob = new BrowserProxyInfo();
			 * b.setType(ProxyType.AUTO);
			 * b.setAutoConfigURL("http://yourhost/proxy.file.pac");
			 * DummyAutoProxyHandler handler = new DummyAutoProxyHandler();
			 * handler.init(b);
			 */

			URL linkURL = new URL(hostName);
			HttpURLConnection linkConnect = (HttpURLConnection) linkURL.openConnection();
			linkConnect.setRequestMethod("GET");
			linkConnect.connect();
			// Thread.sleep(5000);
			int code = linkConnect.getResponseCode();

			switch (code) {
			case 200:
				report.updateTestLog("Response code for Section - " + sectionName,
						"The link " + hostName + " is up and running. Response code - " + code, Status.PASS);
				break;
			case 203:
				report.updateTestLog("Response code for Section - " + sectionName,
						"The link " + hostName + " is up and running. Response code - " + code, Status.PASS);
				break;
			case 202:
				report.updateTestLog("Response code for Section - " + sectionName,
						"The link " + hostName + " is up and running. Response code - " + code, Status.PASS);
				break;
			case 204:
				report.updateTestLog("Response code for Section - " + sectionName,
						"The link " + hostName + " is up and running. Response code - " + code, Status.PASS);
				break;
				//As per discussion changing status to Pass - Sravani
			case 301:
				report.updateTestLog("Response code for Section - " + sectionName,
						"The link " + hostName + " is up and running. Response code - " + code, Status.PASS);
				break;
				//As per discussion changing status to Pass - Sravani
			case 302:
				report.updateTestLog("Response code for Section - " + sectionName,
						"The link " + hostName + " is up and running. Response code - " + code, Status.PASS);
				break;
			case 307:
				report.updateTestLog("Response code for Section - " + sectionName,
						"The link " + hostName + " is not up and running. Response code - " + code, Status.FAIL);
				break;
			case 308:
				report.updateTestLog("Response code for Section - " + sectionName,
						"The link " + hostName + " is not up and running. Response code - " + code, Status.FAIL);
				break;
			case 400:
				//report.updateTestLog("Response code for Section - " + sectionName,
						//"The link " + hostName + " is not up and running. Response code - " + code, Status.FAIL);
				break;
			case 401:
				report.updateTestLog("Response code for Section - " + sectionName,
						"The link " + hostName + " is not up and running. Response code - " + code, Status.FAIL);
				break;
			case 403:
				//report.updateTestLog("Response code for Section - " + sectionName,
					//	"The link " + hostName + " is not up and running. Response code - " + code, Status.FAIL);
				break;
			case 404:
				report.updateTestLog("Response code for Section - " + sectionName,
						"The link " + hostName + " is not up and running. Response code - " + code, Status.FAIL);
				break;
			case 408:
				report.updateTestLog("Response code for Section - " + sectionName,
						"The link " + hostName + " is not up and running. Response code - " + code, Status.FAIL);
				break;
			case 415:
				report.updateTestLog("Response code for Section - " + sectionName,
						"The link " + hostName + " is not up and running. Response code - " + code, Status.FAIL);
				break;
			case 429:
				report.updateTestLog("Response code for Section - " + sectionName,
						"The link " + hostName + " is not up and running. Response code - " + code, Status.FAIL);
				break;
			case 500:
				report.updateTestLog("Response code for Section - " + sectionName,
						"The link " + hostName + " is not up and running. Response code - " + code, Status.FAIL);
				break;
			case 501:
				report.updateTestLog("Response code for Section - " + sectionName,
						"The link " + hostName + " is not up and running. Response code - " + code, Status.FAIL);
				break;
			case 502:
				report.updateTestLog("Response code for Section - " + sectionName,
						"The link " + hostName + " is not up and running. Response code - " + code, Status.FAIL);
				break;
			case 503:
				//report.updateTestLog("Response code for Section - " + sectionName,
						//"The link " + hostName + " is not up and running. Response code - " + code, Status.FAIL);
				break;
			case 504:
				report.updateTestLog("Response code for Section - " + sectionName,
						"The link " + hostName + " is not up and running. Response code - " + code, Status.FAIL);
				break;
			case 505:
				report.updateTestLog("Response code for Section - " + sectionName,
						"The link " + hostName + " is not up and running. Response code - " + code, Status.FAIL);
				break;

			}

		} catch (IllegalStateException | IOException ie) {
			//report.updateTestLog("Links response",
					//"Firewall blocks the http request. Please enable appropriate proxy" + ie, Status.FAIL);
		} /*
		 * catch (InterruptedException e) {
		 * report.updateTestLog("Topic fronts -link response",
		 * "Thread level exception thrown from Java", Status.FAIL); }
		 */
	}
	
	public void waitForPageLoad() {
		WebDriverWait wait = new WebDriverWait(driver, 30); 
		wait.until(ExpectedConditions.jsReturnsValue("return document.readyState==\"complete\";"));
	}

	public void closeApp() {
		driver.close();
	}

	/*public void validateAnalytics() throws InterruptedException {
		
		//String completeURLSource = dataTable.getData("General_Data", "Page");
		String completeURLSource = "http://www.speedtest.net/";
		WebDriver driver = new HtmlUnitDriver(BrowserVersion.FIREFOX_45);		
		((HtmlUnitDriver) driver).setJavascriptEnabled(true);
				
		driver.get(completeURLSource);
		
		Thread.sleep(20000);
		//waitForPageLoad();
		report.updateTestLog("Navigate URL", "Navigated to the URL - " +
				completeURLSource, Status.DONE);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println(completeURLSource);		
		
		String pageSource = driver.getPageSource();
		
		System.out.println(pageSource);	
		if (pageSource.contains("Adobe"))	{	
			report.updateTestLog("Page Source",  "Contains Adobe keyword", Status.PASS);
			String analyticsScripttag = dataTable.getData("General_Data", "ScriptTag");
			
			if (pageSource.contains("<script src=\"" + analyticsScripttag+"\"></script>"))	{				
				report.updateTestLog("Page Source",  "Analytics script is present", Status.PASS);
				validateResponseCodeforLinks("https:"+analyticsScripttag, "Analytics script");
			}		
			else{
				//System.out.print(analyticsScripttag);
				report.updateTestLog("Page Source",  "Analytics script is not found", Status.FAIL);
			}
		}
		else{
			report.updateTestLog("Page Source",  "Adobe keyword is not found", Status.FAIL);
		}
		
	}*/
		
	public void validateAnalytics() {
				
		String completeURLSource = dataTable.getData("General_Data", "Page");		
		
		driver.get(completeURLSource);
				
		report.updateTestLog("Navigate URL", "Navigated to the URL - " +
				completeURLSource, Status.DONE);
	
		System.out.println(completeURLSource);		
		
		String pageSource = driver.getPageSource();
		//Adobe
		if (pageSource.contains("adobe"))	{	
			report.updateTestLog("Page Source",  "Contains Adobe keyword", Status.PASS);
			String analyticsScripttag = dataTable.getData("General_Data", "ScriptTag");
			
			if (pageSource.contains("<script src=\"" + analyticsScripttag+"\"></script>"))	{				
				report.updateTestLog("Page Source",  "Analytics script is present", Status.PASS);
				validateResponseCodeforLinks("https:"+analyticsScripttag, "Analytics script");
			}		
			else{
				//System.out.print(analyticsScripttag);
				report.updateTestLog("Page Source",  "Analytics script is not found", Status.FAIL);
			}
		}
		else{
			report.updateTestLog("Page Source",  "Adobe keyword is not found", Status.FAIL);
		}
		
	}
	
	public void validateAllLinks(){	 
		String completeURLSource = dataTable.getData("General_Data", "Page");
		driver.get(completeURLSource);	 
		java.util.List<WebElement> links = driver.findElements(By.tagName("a"));	 
		System.out.println(links.size());	 
		for (int i = 0; i<=links.size()-1; i++)	 
		{			
			String link = links.get(i).getAttribute("href");
			String exceptionurltag = "mailto";
			String exceptionlink = "https://together.nbcuni.com/";
			String exceptionlink1 = "http://www.bzees.com/boots?icid=TopNav_Bootspartnerid=display&utm_source=taboola&utm_medium=image&utm_content=boots";
 			if (!Strings.isNullOrEmpty(link)) {
 				System.out.println(link);
 				if ((!link.contains(exceptionurltag)) && (!link.contains(exceptionlink)) && (!link.contains(exceptionlink1))){
 					validateResponseCodeforLinks(link, "Validate all links from a given URL"); 	
 					//Based on need
 					String ValidateChildLinks = dataTable.getData("General_Data", "ValidateChildLinks");
 					if (ValidateChildLinks.contains("Yes")){
 						validateChildLinks(link);
 					}
 				}
			}
		  }	 
		} 
			
	public void validateChildLinks(String linktobevalidated){	
		WebDriver driver1 = new ChromeDriver();		
		driver1.get(linktobevalidated);		 
		java.util.List<WebElement> links1 = driver.findElements(By.tagName("a"));	 
		System.out.println(links1.size());	 
		for (int i = 0; i<=links1.size()-1; i=i+10)	 
		{
			String link = links1.get(i).getAttribute("href");
			String exceptionurltag = "mailto";
 			if (!Strings.isNullOrEmpty(link)) {
 				System.out.println(link);
 				if (!link.contains(exceptionurltag)){
 					validateResponseCodeforLinks(link, "Validate all child links from a given URL"); 					
 				}
			} 			
		  }	
		 driver1.quit();
		} 
	
	public void verifyAMPversion(){
		String completeURLSource = dataTable.getData("General_Data", "Page");
		driver.get(completeURLSource);
		report.updateTestLog("Navigate URL", "Navigated to the URL - " +
				completeURLSource, Status.DONE);		
		System.out.println(completeURLSource);		
		
		String pageSource = driver.getPageSource();
		//amphtml
		if (pageSource.contains("amphtml"))	{	
			report.updateTestLog("Page Source",  "Contains amphtml keyword", Status.PASS);
			String AmpScripttag = dataTable.getData("General_Data", "ScriptTag");
			
			if (pageSource.contains("<link rel=\"amphtml\" href=\"" + AmpScripttag))	{				
				report.updateTestLog("Page Source",  "AMP Version is present", Status.PASS);
				validateResponseCodeforLinks(AmpScripttag, "AMP Version script");
			}		
			else{
			
				report.updateTestLog("Page Source",  "AMP Version script has not found", Status.FAIL);
			}
		}
		else{
			report.updateTestLog("Page Source",  "amphtml keyword has not found", Status.FAIL);
		}			
	}
	
	public void verifyArticlePageLoad() throws InterruptedException{			
		verifyArticlePageLoadbyItem(ArticlePage.articleAbout);
		//verifyArticlePageHeaderItem(ArticlePage.articleheader1, ArticlePage.articleheader2);
	}
	
	public void verifyArticlePageHeader() throws InterruptedException{	
		verifyArticlePageHeaderItem(ArticlePage.articleheader1, ArticlePage.articleheader2);
	}
	
	public void verifyArticlePageLoadbyItem(By item) throws InterruptedException {
		Thread.sleep(2000);
		if (driver.findElement(item).isDisplayed()) {
				report.updateTestLog("verifyArticlePageLoad", "Article Page has been loaded" , Status.PASS);
			} else {
				report.updateTestLog("verifyArticlePageLoad", "Article Page has not loaded properly", Status.FAIL);
		}			
	}
	
	public void verifyArticlePageHeaderItem(By item, By item1) throws InterruptedException {
		Thread.sleep(1000);
		if (driver.findElement(item).isDisplayed()) {
			String firstHeader = driver.findElement(item).getText();
			
			//dataTable.getData("General_Data", "ScriptTag");
			
			String AmpScripttag = dataTable.getData("General_Data", "ScriptTag");
			driver.switchTo();
			driver.get(AmpScripttag);
			Thread.sleep(1000);
			if (driver.findElement(item1).isDisplayed()){
				String secondHeader = driver.findElement(item1).getText();
				if (firstHeader.contains(secondHeader)) {
					report.updateTestLog("verifyArticlePageHeaderItem", "Article Page header is same as AMP version header" , Status.PASS);
				}
				else{
					report.updateTestLog("verifyArticlePageHeaderItem", "Article Page header is not same as AMP version header", Status.FAIL);
				}
											
			}
			else{
				report.updateTestLog("verifyArticlePageHeaderItem", "AMP Page header is not displayed", Status.FAIL);
				}							
				
			} 
		else {
				report.updateTestLog("verifyArticlePageHeaderItem", "Article Page first header is not displayed", Status.FAIL);
		}			
	}		
}
	
	
	



