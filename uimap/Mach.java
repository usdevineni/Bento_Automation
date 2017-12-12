package uimap;
import org.openqa.selenium.By;

public class Mach {
	public static final By topAdBanner 		= By.xpath("//div[@data-placement='topbannerfront']//div[contains(@id,'google_ads_iframe_')]");
	public static final By AdvMachText		= By.xpath("//div[contains(@class,'ad-container-boxfront1')]//a[text()='advertisement']");
	public static final By machAdvertisement = By.xpath("//div[@data-placement='boxfront1']//div[contains(@id,'google_ads_iframe_')]");
	public static final By nbcNews 			= By.xpath("//*[contains(@class,'nbcnews')]/a");
	public static final By today 			= By.xpath("//*[contains(@class,'today')]/a");
	public static final By copyRight 		= By.xpath(".//*[@id='top']/footer//li[@class='legal']");
	
	//Header Links
	public static final By nbcLogo			= By.xpath("//a[@class='nbcnews-logo']");
	public static final By machLogo			= By.xpath(".//*[@class='branding']//img[@alt='Mach']");
	public static final By sponsoredLogo	= By.xpath("//div[contains(@class,'ad-container ad_logo')]/div[contains(@class,'ad-label-logo')]");
	public static final By boeingAdv		= By.xpath("//div[contains(@class,'ad-container ad_logo')]//div[contains(@id,'google_ads_iframe_')]");
	public static final By mpfb				= By.xpath("//div[@class='hidden-xs share-icons']//a[@title='Share on Facebook']");
	public static final By mptweet			= By.xpath("//div[@class='hidden-xs share-icons']//a[@title='Tweet']");
	public static final By mpEmail			= By.xpath("//div[@class='hidden-xs share-icons']//a[@title='Email']");
	public static final By taglineMach		= By.xpath("//h2[contains(@class,'announcement ')]");
	
	//Email Subscribe
	public static final By subscribetext		= By.xpath("//p[@class='newsletter--prompt']");
	public static final By checkboxUpdates		= By.name("addlSub");
	public static final By emailupdatesLabel	= By.xpath(".//*[contains(@class,'j-additional-subscribe')]//label");
	public static final By btnSubscribe			= By.xpath(".//*[@value='Subscribe']");
	public static final By msgSubscribe			= By.xpath("//span[@class='howl-content']");
	
	//Video Article
	public static final By headingVideo			= By.xpath("(//div[contains(@class,'label_video')]/span)[1]");
	public static final By linkVideo			= By.xpath("//div[contains(@class,'panel panel_default pinned ')]//h3");
	
	//Gallery Photos
	public static final By headingGallery		= By.xpath("(//div[@class='label label_alt']//span)[1]");
	public static final By headingPhotos		= By.xpath("(//div[@class='label label_alt']//strong)[1]");
	public static final By linkGallery			= By.xpath("(//div[@class='label label_alt']//span)[1]/../../../..//div[@class='panel-txt panel-txt_default']/h3");
	public static final By imageColorLink		= By.xpath("(//div[@class='panel-txt panel-txt_default'])[2]");
	
	
	
	
	
	
	
	
	
}
