package action.social.medial;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
		
    public static void main( String[] args ) throws InterruptedException
    {
    	// Step 1 : Disable notifications in url
    	// https://testersdock.com/facebook-automation/?fbclid=IwAR1NBbg0hLaGjJvdSUUfJU0_30tFhIshtdOn_XN1j4FIQS37iNvuQkhA7PQ
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("disable-notifications");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Music\\chromedriver.exe");  
		webDriver=new ChromeDriver(chromeOptions);
		webDriver.get(urlFacebook);  
		webDriver.manage().window().maximize();
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
//        // Follow account cá nhân
//        webDriver.get("https://www.facebook.com/VoHoaiLinh");
//        Thread.sleep(1000);
//        WebElement  btnFollow =  webDriver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div/div/div[3]/div/div/div/div[2]/div/div/div/div[1]/div/div"));
//        btnFollow.click();
//        Thread.sleep(1000);   
//       
//        // Like post
//        //webDriver.get("https://m.facebook.com/story.php?story_fbid=335456101279201&id=100044444409096&m_entstream_source=video_home&player_suborigin=entry_point&player_format=permalink");
//        webDriver.get("https://m.facebook.com/story.php?story_fbid=2915952458619791&id=1635412586673791&m_entstream_source=video_home&player_suborigin=entry_point&player_format=permalink");
//        WebElement  btnLike =  webDriver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div/div[1]/div/div/div/footer/div/div/div[1]/a"));
//        btnLike.click();
//        Thread.sleep(1000); 
//        
//        // Share post
//        WebElement  btnShare =  webDriver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div/div[1]/div/div/div/footer/div/div[2]/div[3]/a"));
//        btnShare.click();
//        Thread.sleep(2000); 
//        WebElement  btnShareSubmit =  webDriver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div/div[3]/div/div/div[2]/div/a[1]"));
//        btnShareSubmit.click();
//        
//        Thread.sleep(2000); 
//        WebElement  btnComment = webDriver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div/div[1]/div/div/div/div[2]/div/div/div[4]/div[2]/form/div[1]/div[2]/div[1]/div/textarea"));
//        btnComment.sendKeys("Gía bao nhiêu vậy shop");
//        Thread.sleep(1000); 
//        WebElement  btnCommentSubmit = webDriver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div/div[1]/div/div/div/div[2]/div/div/div[4]/div[2]/form/div[1]/div[3]/button"));
//        btnCommentSubmit.click();
		
		
		webDriver.get("https://www.facebook.com/trinhvo200297/posts/2936221430027953");
		WebElement  btnLikeReal = webDriver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[4]/div/div/div[1]/div/div[2]/div/div[1]/div[1]/div[1]"));
		Actions action = new Actions(webDriver);
		
		action.moveToElement(btnLikeReal).perform();
		
		WebElement  btnLikeRealClick = webDriver.findElement(By.cssSelector("#mount_0_0_rf > div > div:nth-child(1) > div > div.rq0escxv.l9j0dhe7.du4w35lb > div > div > div:nth-child(2) > div > div > div.j34wkznp.qp9yad78.pmk7jnqg.kr520xx4 > div.iqfcb0g7.tojvnm2t.a6sixzi8.k5wvi7nf.q3lfd5jv.pk4s997a.bipmatt0.cebpdrjk.qowsmv63.owwhemhu.dp1hu0rb.dhp61c6y.l9j0dhe7.iyyx5f41.a8s20v7p > div > div.tojvnm2t.a6sixzi8.k5wvi7nf.q3lfd5jv.pk4s997a.bipmatt0.cebpdrjk.qowsmv63.owwhemhu.dp1hu0rb.dhp61c6y.l9j0dhe7.iyyx5f41.a8s20v7p > div > div:nth-child(2) > div:nth-child(1) > div > div > canvas"));///div/canvas
		System.out.println("error ------------");
		action.moveToElement(btnLikeRealClick).click().perform();
		Thread.sleep(100000);
		//webDriver.close();  
    	 
    }
    
    
}