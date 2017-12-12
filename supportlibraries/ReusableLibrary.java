package supportlibraries;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cognizant.framework.CraftDataTable;
import com.cognizant.framework.FrameworkParameters;
import com.cognizant.framework.Settings;
import com.cognizant.framework.selenium.SeleniumReport;

import uimap.coverPage;


/**
 * Abstract base class for reusable libraries created by the user
 * @author Cognizant
 */
public abstract class ReusableLibrary
{
	/**
	 * The {@link CraftDataTable} object (passed from the test script)
	 */
	protected CraftDataTable dataTable;
	/**
	 * The {@link SeleniumReport} object (passed from the test script)
	 */
	protected SeleniumReport report;
	/**
	 * The {@link WebDriver} object
	 */
	protected WebDriver driver;
	/**
	 * The {@link ScriptHelper} object (required for calling one reusable library from another)
	 */
	protected ScriptHelper scriptHelper;
	
	/**
	 * The {@link Properties} object with settings loaded from the framework properties file
	 */
	protected Properties properties;
	/**
	 * The {@link FrameworkParameters} object
	 */
	protected FrameworkParameters frameworkParameters;
	
	
	/**
	 * Constructor to initialize the {@link ScriptHelper} object and in turn the objects wrapped by it
	 * @param scriptHelper The {@link ScriptHelper} object
	 */
	public ReusableLibrary(ScriptHelper scriptHelper)
	{
		this.scriptHelper = scriptHelper;
		
		this.dataTable = scriptHelper.getDataTable();
		this.report = scriptHelper.getReport();
		this.driver = scriptHelper.getDriver();
		
		properties = Settings.getInstance();
		frameworkParameters = FrameworkParameters.getInstance();
	}
	
	public List<WebElement> findElements(By property) {
		List<WebElement> elements = null;
		elements = driver.findElements(property);
		return elements;
	}
	
	public WebElement findElement(By property) {
		WebElement element = null;
		element = driver.findElement(property);
		return element;
	}
	
	public void wait(int mSec) {
		try {
			Thread.sleep(mSec);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public boolean verifyElementVisible(By property, String cssProperty) {
		if (findElement(property).getCssValue(cssProperty).equalsIgnoreCase(
				"none")) {
			return false;
		} else {
			return true;
		}
	}
	
	
	
}