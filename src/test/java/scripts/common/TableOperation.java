package scripts.common;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TableOperation {

	protected static final Logger logger = Logger.getLogger(SeleniumDrivers.class);
	public void clickByTableColValue(WebDriver driver) throws InterruptedException {
		//Get all table tr elements
		 List<WebElement> rows = driver.findElements(By.cssSelector("#lc_searchresult > table > tbody > tr"));
		 if (rows.size() > 0) {
			 logger.info("rowSize ====="+rows.size());
			 outer: 
			 for (WebElement row : rows) {
				 //Get all td elements
		        List<WebElement> cols =  row.findElements(By.cssSelector("td"));
		        logger.info("cols size =====" + cols.size());
		        if (cols.size() > 0) {
		        	for(int i = 0; i < cols.size(); i++) {
		           	 if (cols.get(i).getText().trim().equalsIgnoreCase("Liu01 Terry")) {
		           		 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		           		 if (cols.get(i + 1) != null) {
		           			cols.get(i + 1).click();
			           		break outer;
		           		 }
		           	 }
		           	 logger.info("====" + cols.get(i).getText());
		            }
		        } else {
					 logger.info("No td elments");
		        	 break;
		        }
		     }  
		 } else {
			 logger.info("No elments found");
		 }
    }






}
