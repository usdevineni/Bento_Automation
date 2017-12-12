package uimap;
import org.openqa.selenium.By;

public class ElectionMaps {
	public static final By hdrNbcBattleGroundMaps = By.xpath("//div[@id='battlegrounds-map']");
	public static final By MapBattleGround = By.xpath("//div[@class='battlegrounds-container']");
	public static final By countscontainer = By.xpath("//div[@class='counts-container']");
	
	public static final By Mapcontainer = By.xpath("//div[@class='map-container']");
	public static final By battletable = By.xpath("//div[@class='right-table']//div[@class='battle-table']");
	public static final By hdrbattletable = By.xpath("//div[@class='right-table']//div[@class='battle-table']//h5");
	public static final By subhdrbattletable = By.xpath("//div[@class='right-table']//div[@class='battle-table']//div[@class='head']");
	public static final By Mapfooter = By.xpath("//div[@class='footer']");
	
	
	public static final By clintoncount = By.xpath("//div[@class='counts-container']//div[@class='bars']//div[@class='d-bar-m']");
	public static final By tossupcount = By.xpath("//div[@class='counts-container']//div[@class='bars']//div[@class='tossup-bar-m']");
	public static final By Trumpcount = By.xpath("//div[@class='counts-container']//div[@class='bars']//div[@class='r-bar-m']");
	public static final By clintonName = By.xpath("//div[@class='d-name']//h4[contains(text(),'Clinton')]");
	public static final By tossupName = By.xpath("//div[@class='tossup-name']//h4[contains(text(),'Tossup')]");
	public static final By Trumpname = By.xpath("//div[@class='r-name']//h4[contains(text(),'Trump')]");
	public static final By Latestres = By.xpath("//div[@class='latest']");
	public static final By clintonbarcolor = By.xpath("//div[@class='d-bar']");
	public static final By tossupbarcolor = By.xpath("//div[@class='tossup-bar']");
	public static final By trumpbarcolor = By.xpath("//div[@class='r-bar']");
	
	public static final By mapcontent =By.cssSelector("svg.svg-content");
	
//	background-color: #295899
	
	
	
	
	
}