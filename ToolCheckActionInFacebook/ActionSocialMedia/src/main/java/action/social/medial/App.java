package action.social.medial;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class App 
{
	private static WebDriver webDriver;
	private static String username = "vovantrinhdhbkdn@gmail.com";
	private static String password = "trinhvo19972002";
	private static String urlFacebook = "https://www.facebook.com/";
	//private static final Logger logger = LogManager.getLogger(App.class);
	
    public static void main( String[] args ) throws InterruptedException
    {
    	// Step 1 : Disable notifications in url
    	// https://testersdock.com/facebook-automation/?fbclid=IwAR1NBbg0hLaGjJvdSUUfJU0_30tFhIshtdOn_XN1j4FIQS37iNvuQkhA7PQ
    	System.setProperty("webdriver.chrome.driver","chromedriver.exe");  
    	ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("disable-notifications");
		
		System.out.println("***********************");
		webDriver=new ChromeDriver(chromeOptions);
		webDriver.manage().window().maximize();
		webDriver.get(urlFacebook);  
		
		Thread.sleep(1000);
		 
		webDriver.findElement(By.id("email")).sendKeys(username);
		webDriver.findElement(By.id("pass")).sendKeys(password);
		webDriver.findElement(By.name("login")).click();
		Thread.sleep(1000);
//		// Vào trang cá nhân     
//        WebElement  btnIconFacebook =  webDriver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[4]/div[1]/div[4]/a"));
//        btnIconFacebook.click();
//        Thread.sleep(1000);
//        
//        // ***********  Follow account cá nhân // ***********
//        webDriver.get("https://www.facebook.com/VoHoaiLinh");
//        Thread.sleep(1000);
//        WebElement  btnFollow =  webDriver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div/div/div[3]/div/div/div/div[2]/div/div/div/div[1]/div/div"));
//        btnFollow.click();
//        Thread.sleep(1000);   
//       
//        // *********** Like post // ***********
//        //webDriver.get("https://m.facebook.com/story.php?story_fbid=335456101279201&id=100044444409096&m_entstream_source=video_home&player_suborigin=entry_point&player_format=permalink");
//        webDriver.get("https://m.facebook.com/story.php?story_fbid=2915952458619791&id=1635412586673791&m_entstream_source=video_home&player_suborigin=entry_point&player_format=permalink");
//        WebElement  btnLike =  webDriver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div/div[1]/div/div/div/footer/div/div/div[1]/a"));
//        btnLike.click();
//        Thread.sleep(1000); 
//        
//        // *********** Share post // ***********
//        WebElement  btnShare =  webDriver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div/div[1]/div/div/div/footer/div/div[2]/div[3]/a"));
//        btnShare.click();
//        Thread.sleep(2000); 
//        WebElement  btnShareSubmit =  webDriver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div/div[3]/div/div/div[2]/div/a[1]"));
//        btnShareSubmit.click();
		
//        // *********** hack Comment // *********** 
//        Thread.sleep(2000); 
//        WebElement  btnComment = webDriver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div/div[1]/div/div/div/div[2]/div/div/div[4]/div[2]/form/div[1]/div[2]/div[1]/div/textarea"));
//        btnComment.sendKeys("Gía bao nhiêu vậy shop");
//        Thread.sleep(1000); 
//        WebElement  btnCommentSubmit = webDriver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div/div[1]/div/div/div/div[2]/div/div/div[4]/div[2]/form/div[1]/div[3]/button"));
//        btnCommentSubmit.click();
		
		// *********** hack like, tim, haha // *********** 
		webDriver.get("https://www.facebook.com/trinhvo200297/posts/2936221430027953");
		WebElement  btnLikeReal = webDriver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[4]/div/div/div[1]/div/div[2]/div/div[1]/div[1]/div[1]"));
		//btnLikeReal.click();
		Actions action = new Actions(webDriver);
		action.moveToElement(btnLikeReal).perform();
		
		Thread.sleep(3000);
		WebElement  btnLikeAction = webDriver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/div/div[2]/div/div/div[1]/div[1]/div/div[1]/div/div[1]"));
		btnLikeAction.click();

//		Thread.sleep(2000);
//		WebElement  btnTimAction = webDriver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/div/div[2]/div/div/div[1]/div[1]/div/div[1]/div/div[2]"));
//		btnTimAction.click();
//		
//		Thread.sleep(2000);
//		WebElement  btnThuongThuongAction = webDriver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/div/div[2]/div/div/div[1]/div[1]/div/div[1]/div/div[3]"));
//		btnThuongThuongAction.click();
//		
//		Thread.sleep(2000);
//		WebElement  btnHahaAction = webDriver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/div/div[2]/div/div/div[1]/div[1]/div/div[1]/div/div[4]"));
//		btnHahaAction.click();
		// *********** hack like, tim, haha // *********** 
//		webDriver.get("https://www.facebook.com/chotot.vn/posts/4187089068045298");
//		Thread.sleep(3000);
//		WebElement  btnFollowPanpage = webDriver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div[3]/div/div/div/div[2]/div/div/div[1]/div/div[1]/div[2]"));
//		btnFollowPanpage.click();
//		
//		Thread.sleep(3000);
//		WebElement  btnLikeHover = webDriver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[4]/div/div/div[1]/div/div[2]/div/div[1]/div[1]/div[1]"));
//		action.moveToElement(btnLikeHover).perform();
//		
//		Thread.sleep(3000);
//		WebElement  btnLikeActionPost = webDriver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/div/div[2]/div/div/div[1]/div[1]/div/div[1]/div/div[1]"));
//		btnLikeActionPost.click();
//		// Logout //
		Thread.sleep(3000);
		WebElement  btnLogout = webDriver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[4]/div[1]/span/div"));
		btnLogout.click();
		
		Thread.sleep(3000);
		//html/body/div[1]/div/div[1]/div/div[2]/div[4]/div[2]/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[3]/div/div[4]/div/div[1]/div[2]/div
		//html/body/div[1]/div/div[1]/div/div[2]/div[4]/div[2]/div/div[2]/div[1]/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[3]/div/div[5]/div/div[1]/div[2]/div/div/div/div/span
		WebElement  btnLogoutSubmit = webDriver.findElement(By.xpath("html/body/div[1]/div/div[1]/div/div[2]/div[4]/div[2]/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[3]/div/div[4]/div/div[1]/div[2]/div"));
		btnLogoutSubmit.click();
		webDriver.close();  
    	 
    }
    
    
}
