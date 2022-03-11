package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_selenium {

	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		//way-1-Enter into the Frame
		driver.switchTo().frame("iframeResult");
		System.out.println("successfully enter into the frame");
		//way -2
				//driver.switchTo().frame(0);
				//way-3
				//driver.switchTo().frame(driver.findElementByXPath("//iframe[@id='iframeResult']"));
				//other way
				//WebElement iframe = driver.findElementByXPath("//iframe[@id='iframeResult']");
		//Clear the existing name

		driver.findElementByXPath("//input[@value='John']").clear();
		//enter New FirstName
		driver.findElementByXPath("//input[@value='John']").sendKeys("Ayesha");
		//Clear the existing last name
		driver.findElementByXPath("//input[@value='Doe']").clear();
		//Enter new Last Name
		driver.findElementByXPath("//input[@value='Doe']").sendKeys("begum");
		//Click Submit
		driver.findElementByXPath("//input[@value='Submit']").click();
		driver.switchTo().parentFrame();
		Thread.sleep(3000);
		//driver.close();


		
		
		
	}

}
