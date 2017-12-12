package uimap;
import org.openqa.selenium.By;

public class StoryLine {
	
	public static final By faceBookLogo = By.xpath(".//main//div[@class='visible-lg-block col-lg-2']//a[@title='Share on Facebook']");
	public static final By twitterLogo = By.xpath(".//main//div[@class='visible-lg-block col-lg-2']//a[@title='Tweet']");
	public static final By googleLogo = By.xpath(".//main//div[@class='visible-lg-block col-lg-2']//a[@title='Share on Google+']");
	public static final By mailLogo = By.xpath(".//main//div[@class='visible-lg-block col-lg-2']//a[@title='Email']");
	
	public static final By nbcNewsLogo = By.xpath(".//main//a[@class='slim-white-site-header__site-logo inline-block']");
	public static final By decisionLogo = By.xpath(".//main//a[@class='decision2016-logo']");
	public static final By msnbcLogo = By.xpath(".//main//a[@href='http://www.msnbc.com']");
	
	public static final By nbcNewsLogo_conventions = By.xpath(".//*[@id='js-site-header']//a[@href='/']");
	public static final By decisionLogo_conventions = By.xpath(".//*[@id='js-site-header']//a[@href='/politics/2016-election']");
	
	public static final By storyLinesLink = By.
			xpath(".//div[@class='site-header-item js-scroll-navbar dyother dyMonitor']//a[starts-with(@href, '/storyline/')]");
	
	public static final By storyLinesHeader = By.xpath("//main//div[@class='storylines__header ']//h1");
	
	public static final By richTextSupport =  By.xpath("//main//a//div/h3");
			//By.xpath(".//*[@id='top-stories']//a//div//h3");
	//
	public static final By keyStoriesSection = By.xpath(".//*[@id='key-stories']");
	public static final By keyStoriesList = By.xpath("//main//div[@class='panel-section panel-section_key-stories']//div[@class='hidden-xs']/div");
	public static final By keyStoriesDIV =  By.xpath("//main//div[@class='col-sm-4 col-md-3 left-rail']");
			//By.xpath("//main//div[contains(@class,'col-md-4 right-rail')]");
	
	public static final By storyLineAd1 = By.xpath("//div[@class='ad-content ad-sm ad-md ad-lg topmulti']");
	public static final By storyLineAd = By.xpath("//div[@class='ad-content ad-sm ad-md ad-lg boxfront1']");
			//Previous xpath By.xpath("//div[@class='ad-container ad-container_default ad-container-boxfront1']");
}
