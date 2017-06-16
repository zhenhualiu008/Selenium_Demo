package scripts.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import scripts.common.WebElementActions;

public class SelectTaskMenu {
	
	WebElementActions webAction = new WebElementActions();
	/*channel list in VSO01*/
	private final String demoChannelCSS = ".fdsecondary > ul > li:nth-child(1) > a";
	private final String nbnOffersChannelCSS = ".fdsecondary > ul > li:nth-child(2) > a";
	private final String optus4GCRChannelCSS = ".fdsecondary > ul > li:nth-child(3) > a";
	private final String ullFullServiceChannelCSS = ".fdsecondary > ul > li:nth-child(4) > a";
	private final String iiGateChannelCSS = ".fdsecondary > ul > li:nth-child(5) > a";
	
	public void selectDemoChannel(WebDriver driver) throws InterruptedException {
		webAction.clickButton(By.cssSelector(demoChannelCSS), driver);
	}
	
	public void selectNBNOffersChannel(WebDriver driver) {
		webAction.clickButton(By.cssSelector(nbnOffersChannelCSS), driver);
	}
	
	public void selectOptus4GCRChannel(WebDriver driver) {
		webAction.clickButton(By.cssSelector(optus4GCRChannelCSS), driver);
	}
	
	public void selectUllFullServiceChannel(WebDriver driver) {
		webAction.clickButton(By.cssSelector(ullFullServiceChannelCSS), driver);
	}
	
	public void selectIIGateChannel(WebDriver driver) {
		webAction.clickButton(By.cssSelector(iiGateChannelCSS), driver);
	}
	
}
