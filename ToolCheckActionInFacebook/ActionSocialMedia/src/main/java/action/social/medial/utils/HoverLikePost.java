package action.social.medial.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import action.social.medial.string.key.PageLikePostKeys;
public class HoverLikePost {
	private static Logger logger = LogManager.getLogger(HoverLikePost.class);
	
	public static Boolean HoverLikePostFacebookAction(WebDriver webDriver) {
		try {
            WebElement  hoverLikePost = webDriver.findElement(By.xpath(PageLikePostKeys.htmlHoverLikeFacebook));
            logger.info("Find element to hover like action for post success ...");
            
            Actions action = new Actions(webDriver);
			action.moveToElement(hoverLikePost).perform();
			logger.info("Hover like action for post success ...");
			return true;
		} catch (Exception e) {
			logger.error("Hover like action post fail ... "+ e.getMessage());
			return false;
		}	
	}
}
