package Aui_Concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://mrbool.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(3000);
		WebElement content = driver.findElementByClassName("menulink");
		Actions action= new Actions(driver);
		action.moveToElement(content).perform();
		driver.findElementByXPath("//a[text() ='Articles']").click();
		//driver.findElementByXPath("//a[text() ='Courses']").click();
		//driver.findElementByLinkText("Courses").click();
		Thread.sleep(3000);
		//driver.close();
		
		
		

}
}