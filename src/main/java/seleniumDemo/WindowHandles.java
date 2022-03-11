package seleniumDemo;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/met_win_open.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementByLinkText("Try it Yourself »").click();
		String currentwindow = driver.getWindowHandle();
		System.out.println(currentwindow );
		
		String FirstWindow = driver.getWindowHandle();
		System.out.println(FirstWindow );
		Set<String> allWin = driver.getWindowHandles();
		System.out.println(allWin);
		for (String eachWin : allWin) {
			System.out.println(eachWin);
			
			driver.switchTo().window(eachWin);
			
			System.out.println(driver.getTitle());
		}
		driver.switchTo().frame("iframeResult");
		
		
		driver.findElementByXPath("//button[text()='Try it']").click();
		driver.quit();
		
	
		
	}

}
