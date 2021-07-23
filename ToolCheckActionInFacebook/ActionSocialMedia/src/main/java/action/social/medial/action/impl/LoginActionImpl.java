package action.social.medial.action.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import action.social.medial.action.LoginAction;
import action.social.medial.entitis.AccountLoginFacebook;
import action.social.medial.string.key.PageLoginKeys;
import action.social.medial.string.key.TimeSleep;

public class LoginActionImpl implements LoginAction{

	private static final Logger logger = LogManager.getLogger(LoginActionImpl.class);
			
	public Boolean LoginFacebookChrome(String urlFacebook, AccountLoginFacebook accountLoginFacebook, WebDriver webDriver) {
		try {						
			webDriver.get(urlFacebook);
			logger.info("Open facebook success...");
			
			webDriver.findElement(By.id(PageLoginKeys.emailById))
				.sendKeys(accountLoginFacebook.getUserName());
			logger.info("Input email success...");
			Thread.sleep(TimeSleep.time300);
			
			webDriver.findElement(By.id(PageLoginKeys.passWordById))
				.sendKeys(accountLoginFacebook.getPassWord());
			logger.info("Input password success...");
			Thread.sleep(TimeSleep.time300);
			
			webDriver.findElement(By.name(PageLoginKeys.loginByIdButton)).click();
			logger.info("Submit login success...");
			Thread.sleep(TimeSleep.time1000);
			
			return true;
		} catch (Exception e) {
			logger.error("Login fail ... "+ e.getMessage());
			return false;
		}
	}

}
