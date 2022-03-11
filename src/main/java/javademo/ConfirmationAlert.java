package javademo;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {

	public static void main(String[] args)throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElementByXPath("(//button[text()='Click for JS Confirm'])").click();
		String ConfirmationAlert = driver.switchTo().alert().getText();
		System.out.println(ConfirmationAlert);
		
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		driver.close();
		
		
		
		
		
	}

}
