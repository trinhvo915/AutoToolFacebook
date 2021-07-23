package action.social.medial.action.impl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import action.social.medial.action.LikeAction;
import action.social.medial.string.key.PageLikePostKeys;
import action.social.medial.string.key.TimeSleep;
import action.social.medial.utils.HoverLikePost;

public class LikeActionImpl implements LikeAction {
	private static Logger logger = LogManager.getLogger(LikeActionImpl.class);
	
	public Boolean LikePostFacebook(String urlPostLike, WebDriver webDriver) {
		try {
			webDriver.get(urlPostLike);
			Thread.sleep(TimeSleep.time1000);
			
			Boolean checkHoverLikePost = HoverLikePost.HoverLikePostFacebookAction(webDriver);
			
			if(checkHoverLikePost == true) {
				Thread.sleep(TimeSleep.time2000);
				WebElement  btnLikeAction = webDriver.findElement(By.xpath(PageLikePostKeys.htmlSubmitLikeFacebook));
				btnLikeAction.click();
				logger.info("Like action post success ...");
				return true;
			}else {
				return false;
			}
		} catch (Exception e) {
			logger.error("Like action post fail ... "+ e.getMessage());
			return false;
		}	
	}

	public Boolean LikePanPageFacebook() {
		// TODO Auto-generated method stub
		return null;
	}

}
