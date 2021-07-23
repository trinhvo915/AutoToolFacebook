package action.social.medial.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CloseAddAccountLoginPage {

	private static Logger logger = LogManager.getLogger(HoverLikePost.class);
	
	public static Boolean CloseAddAccount(WebDriver webDriver) {
		try {
            WebElement  closeAccount = webDriver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[1]/div[4]/div[1]/div/div[1]/a[2]"));
            logger.info("Find element to hover like action for post success ...");           
            closeAccount.click();
			return true;
		} catch (Exception e) {
			logger.error("Hover like action post fail ... "+ e.getMessage());
			return false;
		}	
	}
}
