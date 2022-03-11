package Aui_Concept;

import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		WebElement src = driver.findElementById("draggable");
		WebElement dest = driver.findElementByXPath("//div[@id='droppable']");
		
		Thread.sleep(3000);
		Actions action =new Actions(driver);
		action.dragAndDrop(src,dest).perform();
		driver.switchTo().parentFrame();
		driver.findElementByXPath("//a[text()='Sortable']").click();
		Thread.sleep(2000);
		//driver.close();
	}

}
