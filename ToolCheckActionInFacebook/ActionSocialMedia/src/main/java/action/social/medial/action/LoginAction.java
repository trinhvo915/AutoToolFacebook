package action.social.medial.action;

import org.openqa.selenium.WebDriver;

import action.social.medial.entitis.AccountLoginFacebook;

public interface LoginAction {
	Boolean LoginFacebookChrome(String urlFacebook, AccountLoginFacebook accountLoginFacebook, WebDriver webDriver);
}
