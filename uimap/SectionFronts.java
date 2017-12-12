package uimap;
import org.openqa.selenium.By;

public class SectionFronts {
	public static final By sectionUSLink = By.linkText("U.S.");
	public static final By sectionWorldLink = By.xpath("//a[contains(text(),'World')]");
	public static final By sectionLocalLink = By.xpath("//a[contains(text(),'Local')]");
	//public static final By sectionPoliticsLink = By.xpath("//a[contains(text(),'Politics')]");
	//Added by Anand to fix code issue
	public static final By sectionPoliticsLink = By.xpath("//main//a[text() = 'Politics']");
	public static final By sectionHealthLink = By.xpath("//main//a[text() = 'Health']");
	//public static final By sectionTechLink = By.xpath("//a[contains(text(),'Tech')]");
	//Code added by Anand
	public static final By sectionTechLink = By.xpath("//main//a[text() = 'Tech']");	
	public static final By sectionScienceLink = By.xpath("//main//a[text() = 'Science']");
	public static final By sectionPopLink = By.xpath("//main//a[text() = 'Pop Culture']");
	public static final By sectionBusinessLink = By.xpath("//main//a[text() ='Business']");
	public static final By sectionInvestigationsLink = By.xpath("//main//a[text() ='Investigations']");
	//public static final By sectionSportsLink 			= By.xpath("//a[contains(text(),'Sports')]");
	//Addd by Anand
	public static final By sectionSportsLink 			= By.xpath("//main//a[text() = 'Sports']");
	
	public static final By sectionTopStoriesLink 		= By.xpath(".//h2[contains(text(),'Top Stories')]");
	public static final By sectionLocalNewsLink			= By.xpath(".//h2[text()='Local News']");
	public static final By sectionTopVideosLink			= By.xpath(".//a[contains(text(),'Top Videos')]");
	public static final By sectionUSNewsLink			= By.xpath(".//*[contains(text(),'U.S. News')]");
	public static final By sectionWorldNewsLink			= By.xpath(".//*[contains(text(),'World News')]");
	public static final By sectionLifeStyleLink			= By.xpath(".//*[@id='lifestyle-section']//a[text()='Lifestyle']");
	public static final By sectionNBCOUTLink			= By.xpath(".//*[@id='nbcout-section']//a[text()='NBC OUT']");
	public static final By sectionLatinoLink			= By.xpath(".//*[@id='latino-section']//h2/a[text()='Latino']");
	
	public static final By sectionPopCultureSponsor		= By.xpath(".//*[@id='pop-culture-section']//span[contains(@class,' trc-smart-ellipsis')]");
	public static final By sectionAsianAmericaLink		= By.xpath(".//*[@id='asian-america-section']//h2/a[text()='Asian America']");
	public static final By sectionNBCBLKLink			= By.xpath(".//*[@id='nbcblk-section']//a[text()='NBCBLK']");
	public static final By sectionShowsLink				= By.xpath(".//*[@id='shows-section']//h2[text()='Shows']");
	public static final By sectionAleppoLink			= By.xpath("(.//*[@id='top']//section[@class='panel-section'])[5]//a[contains(text(),'Children')]");
	public static final By sectionAleppoAllLinks		= By.xpath("(.//*[@id='top']//section[@class='panel-section'])[5]//h3");
	public static final By sectionAleppoImgLinks		= By.xpath("(.//*[@id='top']//section[@class='panel-section'])[5]//img");
	public static final By sectionNYNJBombingsLinks		= By.xpath("(.//*[@id='top']//section[@class='panel-section'])[4]//a[text()='NY/NJ Bombings']");
	public static final By sectionNYNJBombingsWebLinks		= By.xpath("(.//*[@id='top']//section[@class='panel-section'])[4]//h3");
	public static final By sectionNYNJBombingsImgLinks		= By.xpath("(.//*[@id='top']//section[@class='panel-section'])[4]//img");
	public static final By sectionTopStoriesWebLinks		= By.xpath(".//*[@id='top-stories-section']//h3");
	public static final By sectionTopStoriesImageLinks		= By.xpath(".//*[@id='top-stories-section']//img");
	public static final By sectionCrimeCourtsLinks			= By.xpath("//a[contains(text(),'Crime & Courts')]");
	public static final By sectionWeirdNewsLinks			= By.xpath(".//a[contains(text(),'Weird News')]");
	public static final By sectionNewsLink					= By.xpath(".//*[@id='news-section']//h1[contains(text(),'News')]");
	public static final By sectionTopNewsVideosLink			= By.xpath(".//*[@id='news-section']//h2[contains(text(),'Top News Videos')]");
	public static final By sectionPhotoLink					= By.xpath("//a[contains(text(),'Photo')]");
	public static final By sectionReligionLink				= By.xpath("//a[contains(text(),'Religion')]");
	public static final By sectionPopeFrancisLink			= By.xpath("//a[contains(text(),'Pope Francis')]");
	public static final By sectionLatinAmericaLink			= By.xpath("//a[contains(text(),'Latin America')]");
	public static final By sectionMexicoLink				= By.xpath("//a[contains(text(),'Mexico')]");
	public static final By sectionAfricaLink				= By.xpath("//a[contains(text(),'Africa')]");
	public static final By sectionMideastLink				= By.xpath("//a[contains(text(),'Mideast')]");
	public static final By sectionAsiaLink					= By.xpath("//a[(text()='Asia')]");
	public static final By sectionIndiaLink					= By.xpath("//a[contains(text(),'India')]");
	public static final By sectionNorthKoreaLink			= By.xpath("//a[contains(text(),'North Korea')]");
	public static final By sectionChinaLink					= By.xpath("//a[contains(text(),'China')]");
	public static final By sectionEuropeLink				= By.xpath("//a[contains(text(),'Europe')]");
	public static final By sectionTopBannerAd				= By.xpath("//div[@class='ad-content ad-sm ad-md ad-lg topbannerfront ad-content_row']");
	public static final By sectionNewsPageLink				= By.xpath("//a[contains(text(),'News')]");
	
	//Heath Section
	public static final By sectionTopHealthVideosLink		= By.xpath("//h2[contains(text(),'Top Health Videos')]");
	public static final By sectionHealthCareLink			= By.xpath(".//a[contains(text(),'Health Care')]");
	public static final By sectionDietFitnessLink			= By.xpath("//a[contains(text(),'Diet & Fitness')]");
	public static final By sectionMentalHealthLink			= By.xpath("//a[contains(text(),'Mental Health')]");
	public static final By sectionKidsHealthLink			= By.xpath("//a[contains(text(),'Kids Health')]");
	public static final By sectionParentingLink				= By.xpath("//a[contains(text(),'Parenting')]");
	public static final By sectionColdFluLink				= By.xpath("//a[contains(text(),'Cold & Flu')]");
	public static final By sectionBodyOddLink				= By.xpath("//a[contains(text(),'Body Odd')]");
	public static final By sectionAgingLink					= By.xpath("//a[contains(text(),'Aging')]");
	public static final By sectionAllergiesLink				= By.xpath("//a[contains(text(),'Allergies')]");
	public static final By sectionCancerLink				= By.xpath("//a[contains(text(),'Cancer')]");
	public static final By sectionDiabetesLink				= By.xpath("//a[contains(text(),'Diabetes')]");
	public static final By sectionObamacareLink				= By.xpath("//a[contains(text(),'Obamacare')]");
	
	//Science
	public static final By sectionSciencePageLink			= By.xpath("//a[contains(text(),'Science')]");
	public static final By sectionTopScienceVideosLink		= By.xpath("//h2[contains(text(),'Top Science Videos')]");
	public static final By sectionSpaceLink					= By.xpath("//a[contains(text(),'Space')]");
	public static final By sectionEnvironmentLink			= By.xpath("//a[contains(text(),'Environment')]");
	public static final By sectionWeirdScienceLink			= By.xpath("//a[contains(text(),'Weird Science')]");
	
	//Tech
	public static final By sectionTechPageLink 				= By.xpath("//h1[contains(text(),'Tech')]");
	public static final By sectionTopicTechPageLink 		= By.xpath("//a[contains(text(),'Tech')]");
	public static final By sectionTopTechVideosLink			= By.xpath("//h2[contains(text(),'Top Tech Videos')]");
	public static final By sectionGadgetsLink				= By.xpath("//a[contains(text(),'Gadgets')]");
	public static final By sectionInternetLink				= By.xpath("//a[contains(text(),'Internet')]");
	public static final By sectionSecurityLink				= By.xpath("//a[contains(text(),'Security')]");
	public static final By sectionInnovationLink			= By.xpath("//a[contains(text(),'Innovation')]");
	public static final By sectionMobileLink				= By.xpath("//a[contains(text(),'Mobile')]");
	public static final By sectionAppleLink					= By.xpath("//a[contains(text(),'Apple')]");
	public static final By sectionSocialMediaLink			= By.xpath("//a[contains(text(),'Social Media')]");
	public static final By sectionGiftGuideLink				= By.xpath("//a[contains(text(),'Gift Guide')]");
	public static final By sectionVideoGamesLink			= By.xpath("//a[contains(text(),'Video Games')]");
	
	//Pop Culture
	public static final By sectionPopCultureLink			= By.xpath("//a[contains(text(),'Pop Culture')]");
	public static final By sectionTopPopCultureVideos		= By.xpath("//h2[contains(text(),'Top Pop Culture Videos')]");
	public static final By sectionCelebrityLink				= By.xpath("//a[contains(text(),'Celebrity')]");
	public static final By sectionTVLink					= By.xpath("//a[contains(text(),'TV')]");
	public static final By sectionMoviesLink				= By.xpath("//a[contains(text(),'Movies')]");
	public static final By sectionViralLink					= By.xpath("//a[contains(text(),'Viral')]");
	public static final By sectionMusicLink					= By.xpath("//a[contains(text(),'Music')]");
	public static final By sectionBooksLink					= By.xpath("//a[contains(text(),'Books')]");
	public static final By sectionPopLifeStyleLink			= By.xpath("//a[contains(text(),'Lifestyle')]");
	public static final By sectionAwardsLink				= By.xpath("//a[contains(text(),'Awards')]");
	
	//Business
	public static final By sectionTopStoriesBusinessLink	= By.xpath("//a[contains(text(),'Business')]");
	public static final By sectionTopBusinessVideosLink		= By.xpath("//h2[contains(text(),'Top Business Videos')]");
	public static final By sectionConsumerLink				= By.xpath("//a[contains(text(),'Consumer')]");
	public static final By sectionMSNBCYourBusinessLink		= By.xpath("//a[contains(text(),'Your Business')]");
	public static final By sectionTravelLink				= By.xpath("//a[contains(text(),'Travel')]");
	public static final By sectionEconomyLink				= By.xpath("//a[contains(text(),'Economy')]");
	public static final By sectionPersonalFinanceLink		= By.xpath("//a[contains(text(),'Personal Finance')]");
	public static final By sectionMarketsLink				= By.xpath("//a[contains(text(),'Markets')]");
	public static final By sectionAutosLink					= By.xpath("//a[contains(text(),'Autos')]");
	public static final By sectionEnergyLink				= By.xpath("//a[contains(text(),'Energy')]");
	public static final By sectionRealEstateLink			= By.xpath("//a[contains(text(),'Real Estate')]");
	public static final By sectionRetirementLink			= By.xpath("//a[contains(text(),'Retirement')]");
	public static final By sectionTaxesLink					= By.xpath("//a[contains(text(),'Taxes')]");
	public static final By sectionCareersLink				= By.xpath("//a[contains(text(),'Careers')]");
	
	//Politics
	public static final By sectionCongressLink				= By.xpath("//a[contains(text(),'Congress')]");
	public static final By sectionTopPoliticsVideosLink		= By.xpath("//h2[contains(text(),'Top Politics Videos')]");
	public static final By sectionWhiteHouseLink			= By.xpath("//a[contains(text(),'White House')]");
	public static final By sectionJusticeDepartmentLink		= By.xpath("//a[contains(text(),'Justice Department')]");
	public static final By sectionNationalSecurityLink		= By.xpath("//a[contains(text(),'National Security')]");
	public static final By sectionElectionsLink				= By.xpath("//a[contains(text(),'Elections')]");
	public static final By sectionMeettheVotersLink			= By.xpath("//a[contains(text(),'Meet the Voters')]");
	public static final By sectionFirstReadLink				= By.xpath("//a[contains(text(),'First Read')]");
	public static final By sectionSupremeCourtLink			= By.xpath("//a[contains(text(),'Supreme Court')]");
	public static final By sectionImmigrationLink			= By.xpath("//a[contains(text(),'Immigration')]");
	public static final By sectionBarackObamaLink			= By.xpath("//a[contains(text(),'Barack Obama')]");
	public static final By sectionHillaryClintonLink		= By.xpath("//a[contains(text(),'Hillary Clinton')]");
	public static final By sectionJohnBoehnerLink			= By.xpath("//a[contains(text(),'John Boehner')]");
	public static final By sectionPoliticsHeaderLink		= By.xpath("//a[contains(text(),'Politics')]");
	
	
	
	public static final By nightlyNews = By.xpath("//a[contains(text(),'Nightly News')]");
	public static final By dateLine = By.xpath("//a[contains(text(),'Dateline')]");
	public static final By meetPress = By.xpath("//a[contains(text(),'Meet the Press')]");
	public static final By today = By.xpath("//a[contains(text(),'Today')]");
	
	public static final By atwLink 				 = By.xpath("//span[contains(text(), 'AROUND THE WEB')]");
	public static final By atwContainer			= By.cssSelector(".video-label.video-title:not(.trc-smart-ellipsis)");
	//= By.xpath("//span[@class='video-label video-title']");
	public static final By atwImgContainer 		 = By.xpath("//*[@class='thumbBlock'][contains(@style,'background-image')]");
	
	
	public static By sectionLink;
	public static By sectionImg;
	public static By sectionText;
	
	public static void sectionLinks(String sectionName) {
		sectionLink = By.xpath(".//*[@id='"+sectionName+"']//h3");
	}
	
	public static void sectionTextLinks(String sectionName) {
		sectionText = By.xpath("(.//*[@id='"+sectionName+"']//h3/../../..)[1]");
	}
	
	public static void sectionImages(String sectionName) {
		sectionImg = By.xpath(".//*[@id='"+sectionName+"']//img");
	}
	
	public static  By sectionNewsAllLinks;
	public static  By sectionNewsAllImgLinks;
	
	
	public static void sectionLinksNews(int i){
	 sectionNewsAllLinks	= By.xpath("(.//*[@id='news-section']//div[@class='panel-section'])["+i+"]//h3");
	}
	
	public static void sectionImgLinksNews(int i){
		sectionNewsAllImgLinks	= By.xpath("(.//*[@id='news-section']//div[@class='panel-section'])["+i+"]//img");
		}
	
	public static  By sectionPageAllLinks;
	public static  By sectionPageAllImgLinks;
	
	
	public static void sectionLinksPage(int i){
		sectionPageAllLinks	= By.xpath("(//div[@class='panel-section'])["+i+"]//h3");
	}
	
	public static void sectionImgLinksPage(int i){
		sectionPageAllImgLinks	= By.xpath("(//div[@class='panel-section'])["+i+"]//img");
		}
	public static  By atwContainer1;
	public static void atwLinksPage(int i){
		atwContainer1 = By.xpath("(//span[@class='video-label video-title'])["+i+"]");
	}
	//changes done by anand
	public static final By sectionBreakingNews = By.xpath("//a[contains(text(),'Breaking News')]");
	public static final By sectionFeatured = By.xpath("//h2[contains(text(),'Featured')]");
	
	public static final By allLinks = By.xpath("//main//div[@class='grid_panel']//a[contains(@href,'')]");
	public static final By panelSection = By.xpath("//main//div[@class='grid_panel']//div[@class='panel-section']");
	public static final By sponsorLinks = By.xpath("//div[@class='flag flag_default flag_section-name']/a[contains(@href,'')]");
	public static final By imgLinks = By.xpath("//div[contains(@class,'panel')]/a[contains(@href,'')]");
	public static final By noImgLinks = By.xpath("//div[contains(@class,'story-link')]/a");
	public static final By panelSectionText = By.xpath(".//*[contains(@class,'item-heading item-heading_group')]");
	public static final By panelSectionImg = By.xpath("//img");
	public static final By atwImgContainerCover = By
            .xpath("//div[@class='container-gutter']/div[@class='container'][2]//span[@class='thumbBlock'][contains(@style,'background-image')]");
	
	//changes done by sravani
	public static final By sectionReportedBy = By.xpath(".//*[@id='top-stories-section']//h3/../../../a");
	public static final By sectionimgReportedBy = By.xpath(".//*[@id='top-stories-section']//img/../..");
	//Added new section Mach
	public static final By sectionMachLink = By.xpath(".//*[@id='mach-section']//a[text()='Mach']");
}