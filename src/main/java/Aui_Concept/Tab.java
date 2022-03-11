package Aui_Concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tab {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElementByXPath("//input[@id='twotabsearchtextbox']").sendKeys("iphone");
			driver.findElementByXPath("//input[@id='twotabsearchtextbox']").sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			driver.close();
			
			
			
			
			
			
			
	}

}
