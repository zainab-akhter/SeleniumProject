package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class FrameConcept {

	public static void main(String[] args)  throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		driver.findElementByLinkText("Selectable").click();
		driver.switchTo().frame(0);
		System.out.println("Successfully enter into the frame");
		driver.findElementByXPath("//ol[@id='selectable']/li[3]").click();
		driver.findElementByXPath("//ol[@id='selectable']/li[4]").click();
		driver.findElementByXPath("//ol[@id='selectable']/li[5]").click();
		driver.findElementByXPath("//ol[@id='selectable']/li[7]").click();
		
		driver.switchTo().parentFrame();
		Thread.sleep(3000);
		driver.findElementByPartialLinkText("Demos").click();
		Thread.sleep(3000);
		//driver.close();
		
		

	}

}
