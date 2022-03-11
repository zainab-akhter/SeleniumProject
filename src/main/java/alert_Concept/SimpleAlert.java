
package alert_Concept;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://ksrtc.in/oprs-web/ticket/waitlist.do");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
	
	driver.findElementByXPath("(//input[@id='searchBtn'])[1]").click(); 
	
	String SimpleAlert  = driver.switchTo().alert().getText();
	System.out.println(SimpleAlert);
	
	Thread.sleep(3000);
	
	driver.switchTo().alert().accept();
	 driver.close();

	

	
		

	}

}
