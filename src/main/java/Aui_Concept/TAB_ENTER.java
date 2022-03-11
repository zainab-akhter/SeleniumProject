package Aui_Concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TAB_ENTER {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementByXPath("//input[@id='email']").sendKeys("abc@yahoo.com");
		Actions action = new Actions(driver);
		Thread.sleep(3000);
		action.sendKeys(Keys.TAB).sendKeys("Arin").build().perform();
		driver.findElementByXPath("//button[@type='submit']").click();
		Thread.sleep(3000);
		//driver.close();
		
		
		

	}

}
