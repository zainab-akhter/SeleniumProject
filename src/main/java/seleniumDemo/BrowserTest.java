package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
        driver.findElementById("username").sendKeys("DemoSalesMamager");
        
        driver.findElementById("password").sendKeys("crmsfa");
        		
        driver.findElementByClassName("decorativeSubmit").click();
         
        driver.findElementByLinkText("CRM/SFA").click();
         
        driver.findElementByPartialLinkText("Create Account");
        
       
        
       
        		       
        		               
	}

}
