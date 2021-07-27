package action.social.medial;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import action.social.medial.action.LikeAction;
import action.social.medial.action.LoginAction;
import action.social.medial.action.LogoutAction;
import action.social.medial.action.OpenChromeAction;
import action.social.medial.action.impl.LikeActionImpl;
import action.social.medial.action.impl.LoginActionImpl;
import action.social.medial.action.impl.LogoutActionImpl;
import action.social.medial.action.impl.OpenChromeActionImpl;
import action.social.medial.entitis.AccountLoginFacebook;
import action.social.medial.string.key.TimeSleep;
import action.social.medial.string.key.UrlFacebook;
import action.social.medial.utils.CloseAddAccountLoginPage;

public class RunApp {

	public static void main(String[] args) throws InterruptedException {
		
		OpenChromeAction  openChrome = new OpenChromeActionImpl();
		WebDriver webDriverChrome =  openChrome.OpenChrome();
		
		LoginAction login = new LoginActionImpl();
		AccountLoginFacebook accountLoginFacebook = new AccountLoginFacebook("vovantrinhdhbkdn@gmail.com", "trinhvo1997");
		AccountLoginFacebook accountdanghieu = new AccountLoginFacebook("zcq89028@zwoho.com", "trinhvo1997");
        ArrayList<AccountLoginFacebook> accountLoginFacebooks = new ArrayList<AccountLoginFacebook>();
        accountLoginFacebooks.add(accountdanghieu);
        accountLoginFacebooks.add(accountLoginFacebook);
        
        for (AccountLoginFacebook item : accountLoginFacebooks) {
        	CloseAddAccountLoginPage.CloseAddAccount(webDriverChrome);
        	Thread.sleep(TimeSleep.time500);
        	
        	Boolean checkLogin = login.LoginFacebookChrome(UrlFacebook.urlFacebook, item, webDriverChrome);

    		if(checkLogin == true) {
    			System.out.println("Handle Login Success.");
    			
    			String urlPostLike = "https://www.facebook.com/trinhvo200297/posts/2936221430027953";
    			LikeAction likeAction = new LikeActionImpl();
    			likeAction.LikePostFacebook(urlPostLike, webDriverChrome);
    			
    			LogoutAction logoutAction = new LogoutActionImpl();
    			Boolean checkLogout = logoutAction.LogoutFacebook(webDriverChrome);
    			
    			if(checkLogout == true) {
    				System.out.println("Handle Logout Success.");
    			}else {
    				System.out.println("Handle Logout Fail.");
    			}
    		}else {
    			System.out.println("Handle Login Fail.");
    		}
    		
		}

	}

}
