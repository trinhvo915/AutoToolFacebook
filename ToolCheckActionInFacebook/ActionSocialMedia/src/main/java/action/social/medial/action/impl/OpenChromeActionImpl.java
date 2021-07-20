package action.social.medial.action.impl;

import org.openqa.selenium.WebDriver;

import action.social.medial.Connections.WebDriverChromeConnection;
import action.social.medial.action.OpenChromeAction;

public class OpenChromeActionImpl implements OpenChromeAction {

	private WebDriverChromeConnection webDriverChromeConnection;
	
	public  OpenChromeActionImpl() {
		webDriverChromeConnection = new WebDriverChromeConnection();
	}
	
	public WebDriver OpenChrome() {
		return webDriverChromeConnection.setUpChromeAndOpenChrome();
	}

}
