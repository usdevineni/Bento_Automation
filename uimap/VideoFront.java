package uimap;
import org.openqa.selenium.By;

public class VideoFront {

	public static final By videoHeadline = By.xpath(".//*[@id='js_main_video_info']//*[contains(@itemprop, 'headline')]");
	public static final By usNewsSection = By.xpath("//main//div[@class='row row_panel']/div[@class='col-md-6'][1]//h2");
	public static final By worldNewsSection = By.xpath("//main//div[@class='row row_panel']/div[@class='col-md-6'][2]//h2");
	
	public static final By usNewsSectionLinks = By.xpath("//main//div[@class='row row_panel']/div[@class='col-md-6'][1]//h3");
	public static final By usNewsflagSection = By
			.xpath("//main//div[@class='row row_panel']/div[@class='col-md-6'][1]//div[contains(@class,'flag flag_default flag')]/a");
	public static final By usNewsSectionLinks1 = By
			.xpath("//main//div[@class='row row_panel']/div[@class='col-md-6'][1]//div[@class='story-link story-link_sm']/a");
	
	
	public static final By worldNewsSectionLinks = By.xpath("//main//div[@class='row row_panel']/div[@class='col-md-6'][2]//h3");
	public static final By worldNewsflagSection = By
			.xpath("//main//div[@class='row row_panel']/div[@class='col-md-6'][2]//div[contains(@class,'flag flag_default flag')]/a");
	public static final By worldNewsSectionLinks1 = By.xpath("//main//div[@class='row row_panel']/div[@class='col-md-6'][2]//div[@class='story-link story-link_sm']/a");
	
	public static final By showsSection = By.xpath(".//main//div[@class='grid_panel']//div[@class='panel-group_header']//h2");
	public static final By showsImg = By
			.xpath("//main//div[@class='grid_panel']/div[@class='panel-section'][1]//div[@class='panel_show-tease col-md-4']/a/img");
	public static final By showsLink = By
			.xpath("//main//div[@class='grid_panel']/div[@class='panel-section'][1]//div[@class='panel_show-tease col-md-4']/a");
	
	public static final By loadingInd = By.xpath("//*[@id='js-player-loading']");
	
}
