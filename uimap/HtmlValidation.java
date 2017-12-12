package uimap;
import org.openqa.selenium.By;

public class HtmlValidation {

	public static final By txtboxAddressUrl = By.id("doc");
	public static final By btnValidate		= By.id("submit");
	public static final By linksError 		= By.xpath("//li[@class='error']");
	public static final By linksWarning		= By.xpath("//li[@class='info warning']");
	public static final By headings			= By.xpath("//ol/li/p/strong");
	
}
