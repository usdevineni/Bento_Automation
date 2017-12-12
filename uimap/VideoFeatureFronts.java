package uimap;
import org.openqa.selenium.By;

public class VideoFeatureFronts {

	public static final By TitleFollowNBCNewsVideoLink		= By.xpath("//a[contains(text(),'Follow NBC News Videos')]");
	public static final By NBCNewsText						= By.xpath(".//*[@id='u_0_2']//a[contains(text(),'NBC News')]");
	public static final By NBCNewsLogo						= By.xpath("//div[@class='_1dro _2ph- clearfix']//img");
	public static final By NewsThumbnailImg					= By.xpath("(.//*[contains(@id,'u_1_')]//div[contains(@class,'uiScaledImageContainer')])[1]");
	public static final By NewsArticleLink					= By.xpath("(.//*[contains(@id,'js_')])[4]");
	public static final By sectionMoreDigitalExclusivesLink = By.xpath("//h2[contains(text(),'More Digital Exclusives')]");
	
	public static final By titleNBCVideosTwitterLink		= By.xpath("//a[contains(text(),'NBCNewsVideo')]");
	public static final By twitterNBCNewsText				= By.xpath("(//div[@class='timeline-Tweet-author']//span[@title='NBC News Videos'])[1]");
	public static final By twitterNBCNewsLogo				= By.xpath("(//div[contains(@class,'TweetAuthor')]//span[1]/img[@class='Avatar'])[1]");
	//(//div[@class='TweetAuthor']//span[1]/img)[1]
	public static final By twitterNewsArticleLink			= By.xpath("(//div[contains(@class,'timeline-Tweet')]//p)[1]");
	public static final By twitterNewsThumbnailImg			= By.xpath("(//div[contains(@class,'SummaryCard-image')]//img[@class='u-block'])[1]");
			//By.cssSelector(".TwitterCardsGrid.TwitterCard .SummaryCard-image img");
			//By.xpath("(//div[@class='TwitterCardsGrid TwitterCard']//img)[1]");
			//("(//div[@class='timeline-Tweet-media']//img)[1]");
	
	
	//(//div[contains(@class,'panel_feature-txt-tease')]/a)[9]
//(//div[contains(@class,'panel_feature-txt-tease')]//h3)[9]
	
	//public static  By sectionMoreDigitalAllLinks;
	public static  By sectionMoreDigitalAllImgLinks;
			
			
	public static final By sectionMoreDigitalAllLinks	= By.xpath("//div[contains(@class,'panel_feature-txt-tease')]//h3");
			
			
	public static void sectionImgLinksMoreDigitalExcl(int i){
		sectionMoreDigitalAllImgLinks	= By.xpath("(.//*[@id='news-section']//div[@class='panel-section'])["+i+"]//img");
				}
			
	//Changes done by Akhila
	public static final By videoTopBannerAd =By.xpath("//div[@class='ad-content ad-sm ad-md ad-lg topbannerfront ad-content_row']");
	public static final By AdbannerVideoPage =By.xpath("//div[@class='ad-content ad-sm ad-md ad-lg topmulti']");
	public static final By HdrvideoArticle =By.xpath(".//*[@id='js_main_video_info']//*[contains(@itemprop, 'headline')]");
	public static final By timeVideoArticle =By.xpath(".//*[@id='js_main_video_info']/p[1]");
	public static final By videoArticlecontent =By.xpath(".//*[@id='js_main_video_info']/p[2]");
	
	
	
}
