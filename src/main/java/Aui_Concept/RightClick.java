package Aui_Concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	WebElement RightClick = driver.findElementByXPath("//span[text()='right click me']");
	Actions action = new Actions(driver);
	action.contextClick( RightClick ).perform();
	//driver.findElementByXPath("//li[@class='context-menu-item context-menu-icon context-menu-icon-paste']").click();
	
	driver.findElementByXPath("//li[@class='context-menu-item context-menu-icon context-menu-icon-copy']").click();
	Thread.sleep(3000);
	Alert copy = driver.switchTo().alert();
	System.out.println(copy.getText());
	driver.switchTo().alert().accept();
	System.out.println(driver.getTitle());
	
	
	Thread.sleep(3000);
	//driver.close();
	
	

	}

}
