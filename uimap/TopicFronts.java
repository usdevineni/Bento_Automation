package uimap;
import org.openqa.selenium.By;

public class TopicFronts {
	
	
	
	public static final By advNews						= By.xpath(".//*[@id='top-stories-section']//div[contains(@class,'ad-container-topmulti')]");
	public static final By advInvestigations			= By.xpath(".//*[@id='news-section']//div[contains(@class,'ad-container-boxfront2')]");
	public static final By advWeirdNews					= By.xpath(".//*[@id='news-section']//div[@data-placement='boxfront3']");
	public static final By advAsianAmerica				= By.xpath(".//*[@id='news-section']//div[@data-placement='boxfront4']");
	public static final By advUSNews					= By.xpath(".//*[@id='news-section']//div[contains(@class,'ad-container-boxfront1')]");
	public static final By sectionUSNewsTopStoriesLink 		= By.xpath("//h1[contains(text(),'U.S. news')]");
	public static final By sectionHealthLink 			= By.xpath("//a[contains(text(),'Health')]");
	//public static final By sectionBusinessLink			= By.xpath("//h1[contains(text(),'Business')]");
	
}
