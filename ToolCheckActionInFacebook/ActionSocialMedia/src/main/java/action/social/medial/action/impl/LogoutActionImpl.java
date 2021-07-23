package action.social.medial.action.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import action.social.medial.action.LogoutAction;
import action.social.medial.string.key.PageLogoutKeys;
import action.social.medial.string.key.TimeSleep;

public class LogoutActionImpl implements LogoutAction{

	private Logger logger = LogManager.getLogger(LogoutActionImpl.class);
	
	public Boolean LogoutFacebook(WebDriver webDriver) {
		try {
			Thread.sleep(TimeSleep.time1000);
			WebElement  btnIconLogout = webDriver.findElement(By.xpath(PageLogoutKeys.htmlIconLogoutHeader));
			btnIconLogout.click();
			logger.info("Find html element icon logout header success");
			
			Thread.sleep(TimeSleep.time2000);
			WebElement  btnIconLogoutSubmit = webDriver.findElement(By.xpath(PageLogoutKeys.htmlIconSubmitLogout));
			btnIconLogoutSubmit.click();
			logger.info("Find html element icon logout success");
			Thread.sleep(TimeSleep.time3000);
			return true;
		} catch (Exception e) {
			logger.error("Logout fail ... "+ e.getMessage());
			return false;
		}
		
	}

}
