package javademo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.findElementByXPath("(//button[text()='Click for JS Alert'])").click();
		String SimpleAlert = driver.switchTo().alert().getText();
		System.out.println(SimpleAlert);
		
		Thread.sleep(2000);
	
		driver.switchTo().alert().accept();
		driver.close();

	}

}
