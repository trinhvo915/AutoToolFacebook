package action.social.medial.Connections;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import action.social.medial.action.impl.LoginActionImpl;
import action.social.medial.string.key.SystemPropertyKeys;

public class WebDriverChromeConnection {
	private static WebDriver webDriver;
	
	private static ChromeOptions chromeOptions ;  
	
	private static final Logger logger = LogManager.getLogger(LoginActionImpl.class);
	
	public WebDriver setUpChromeAndOpenChrome() {
		// Disable notification in url when has protocol SSL
		chromeOptions = new ChromeOptions();
		chromeOptions.addArguments(SystemPropertyKeys.disableNotificationChrome);	
		
		System.setProperty(SystemPropertyKeys.webdriverChrome,"chromedriver.exe");
		webDriver = new ChromeDriver(chromeOptions);
		logger.info("Setup set property...");
		
		// Display max Chrome in window
		webDriver.manage().window().maximize();
		logger.info("Setup web driver...");
		
		return webDriver;
	}
}
