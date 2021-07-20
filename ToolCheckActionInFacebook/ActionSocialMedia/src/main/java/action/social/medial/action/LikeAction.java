package action.social.medial.action;

import org.openqa.selenium.WebDriver;

public interface LikeAction {
	Boolean LikePostFacebook(String urlPostLike, WebDriver webDriver);
	
	Boolean LikePanPageFacebook();
}
