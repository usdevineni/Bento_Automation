package uimap;
import org.openqa.selenium.By;

public class CustomFront {
	
	public static final By featureLogo = By.xpath(".//div[contains(@class,'panel-group_header')]//h1");
	public static final By sponsoredBy = By.xpath("//div[contains(@class,'panel-group_header')]//div[@class='ad-label ad-label-logo']");
	public static final By sponsoredLink = By.xpath("//div[contains(@class,'panel-group_header')]//div[@class='ad-content ad-sm ad-md ad-lg logoa']");
	public static final By coverStory = By.xpath("//div[@class='row latest-features']//div[@class='panel panel_lead panel_lg']");
	public static final By coverStoryIMG = By
			.xpath("//div[@class='row latest-features']//div[@class='panel panel_lead panel_lg']//div[@class='img-container img-container_lead img-container_panel']//img[1]");
	public static final By coverStoryBranding = By.xpath("//div[@class='row latest-features']//div[@class='panel panel_lead panel_lg']//div[contains(@class,'flag flag_default flag_')]/a");
	// Updated Xpath on 29Dec
//By.xpath("//div[@class='row latest-features']//div[@class='panel panel_lead panel_lg']//div[@class='flag flag_default flag_section-name']/a");

	public static final By iFrameFbID = By.xpath("//iframe[@title='fb:page Facebook Social Plugin']");
	public static final By twitterBlock = By.xpath("//div[@class='panel-section row_panel']//h2");
	public static final By followFeature = By.xpath("//div[@class='panel-section row_panel']//h2//a");
	public static final By twitterCards = By.xpath("//ol/li");
	public static final By twitterBlockLinks = By.xpath("//ol/li//p/a");
	
	public static final By embedLink = By.xpath("//a[@class='u-floatLeft']");
	public static final By viewLink = By.xpath("//a[@class='u-floatRight']");
	
	public static final By iFrameID = By.id("twitter-widget-0");

	
	public static final By topStoryRow1IMG = By.xpath("//div[@class='row latest-features']//div[@class='col-sm-12']/div[1]//img");
	public static final By topStoryRow1Text = By.xpath("//div[@class='row latest-features']//div[@class='col-sm-12']/div[1]//h3");
	public static final By topStoryRow2IMG = By.xpath("//div[@class='row latest-features']//div[@class='col-sm-12']/div[2]//img");
	public static final By topStoryRow2Text = By.xpath("//div[@class='row latest-features']//div[@class='col-sm-12']/div[2]//h3");
	
	
	public static final By storyNoImgSection = By
			.xpath("//div[@class='row latest-features']//div[@class='col-sm-12']/div[@class='row'][2]/div[@class='col-md-6 col-lg-4'][2]//h3");
	public static final By sponsoredStoryIMG = By.xpath(".//div[contains(@id,'internal_trc_')]/div[1]//a[@class=' item-thumbnail-href ']");
	public static final By sponsoredStoryText = By.xpath(".//div[contains(@id,'internal_trc_')]/div[1]");
	
	public static final By panelSectionHeader = By
			.xpath("//div[@class='fluid-wrapper']//div[@class='panel-section']//div[@class='panel-group_header']/h2");
	
	public static final By sectionNoImage = By
			.xpath("//div[@class='fluid-wrapper']//div[@class='panel-section']//div[@class='col-sm-12']//div[@class='col-md-6 col-lg-4'][2]");
	
	public static final By otherSectionArticle1 = By
			.xpath("//div[@class='fluid-wrapper']//div[@class='panel-section']//div[@class='col-sm-12']//div[@class='col-md-6 col-lg-4'][1]//a");
	public static final By otherSectionArticle2 = By
			.xpath("//div[@class='fluid-wrapper']//div[@class='panel-section']//div[@class='col-sm-12']//div[@class='col-lg-4 visible-lg-block']//a");
	
	public static final By noImageText = By
			.xpath("//div[@class='fluid-wrapper']//div[@class='panel-section']//div[@class='col-sm-12']//div[@class='col-md-6 col-lg-4'][2]//div[@class='story-link story-link_sm']//h3");
	public static final By noImageBranding = By
			.xpath("//div[@class='fluid-wrapper']//div[@class='panel-section']//div[@class='col-sm-12']//div[@class='col-md-6 col-lg-4'][2]//div[@class='story-link story-link_sm']//div[@class='flag flag_default flag_section-name']/a");
	public static final By noImageVideoTag = By
			.xpath("//div[@class='fluid-wrapper']//div[@class='panel-section']//div[@class='col-sm-12']//div[@class='col-md-6 col-lg-4'][2]//div[@class='story-link story-link_sm']/a");
	
	public static final By videoTag = By.xpath("//div[@class='fluid-wrapper']//div[@class='panel-section']//div[@class='col-sm-12']//div[@class='col-md-6 col-lg-4'][2]//div[@class='story-link story-link_sm']/a//div/..");
}
