package uimap;
import org.openqa.selenium.By;

public class Specials {
	
	public static final By nbcNewsLogo = By.xpath("//div[@class='site-logo set--left']");
	public static final By nbcFaceBookTop = By.xpath("//div[@class='set--right']//a[@title='Share on Facebook']");
	public static final By nbcTweetTop = By.xpath("//div[@class='set--right']//a[@title='Tweet']");
	public static final By nbcMailTop = By.xpath("//div[@class='set--right']//a[@title='Email']");
	public static final By nbcFaceBookBottom = By.xpath("//div[@class='column--1x set--center align--center']//a[@title='Share on Facebook']");
	public static final By nbcTweetBottom = By.xpath("//div[@class='column--1x set--center align--center']//a[@title='Tweet']");
	public static final By nbcMailBottom = By.xpath("//div[@class='column--1x set--center align--center']//a[@title='Email']");
	public static final By shareBottom = By.xpath("//div[@class='column--1x set--center align--center']/h2[@class='h5']");
	
	public static final By creditSection = By.xpath("//footer[@class='credits__content']");
	public static final By creditSectionHeader = By.xpath("//h2[@class='credits__heading']");
	public static final By creditSectionContents = By.xpath("//footer[@class='credits__content']//span");
	public static final By creditSectionValue = By.xpath("//footer[@class='credits__content']//strong");
	
	public static final By privacyPolicy = By.xpath("//a[contains(text(), 'Privacy Policy')]");
	//Changed from 2016 to 2017 as on 16 Jan 2016
	public static final By copyRights = By.xpath("//div[contains(text(), '2017')]");
	public static final By footerLink = By.xpath("//div[contains(text(), '2017')]//a[@href='http://nbcnews.com']");
	
	public static final By youMayLikeSection = By.xpath("//h2[contains(text(), 'You May Also Like')]");
	public static final By youMayLikeContainer = By.xpath("//div[@class='entry__container']");
}