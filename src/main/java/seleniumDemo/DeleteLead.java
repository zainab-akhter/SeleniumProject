package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");//launch Browser
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();//create object for class*****************************************************
		driver.manage().window().maximize();//Maximize the Browser Window *****************************************************
		driver.get("http://leaftaps.com/opentaps");//LOAD URL *****************************************************************
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);// USE ImplicitlyWait time*****************************
		Thread.sleep(3000);
        //Enter User Name
		driver.findElementById("username").sendKeys("DemoSalesManager");
		//driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");//By attribute base XPath************
		//Enter Password
		driver.findElementById("password").sendKeys("crmsfa");
		//driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");//enter attribute base Xpath***************
		//Click Login Button
		driver.findElementByClassName("decorativeSubmit").click();
		//driver.findElementByXPath("//input[@type='submit']").click();//Click Login By Direct Locator********
		
		//Click CRM/SFA link
		 driver.findElementByLinkText("CRM/SFA").click();
		 //Click Leads
		 //driver.findElementByXPath("//a[text()='Leads']").click();
		 driver.findElementByLinkText("Leads").click();
		 //click find lead link
		// driver.findElementByXPath("//a[text()='Find Leads']").click();
		 driver.findElementByLinkText("Find Leads").click();
		 //Click on phone
		 driver.findElementByXPath("//span[text()='phone']").click();
		 //Click on Email
		 driver.findElementByXPath("//span[text()='Email']").click();
		// WebDriver Findby = driver.switchTo().frame("Findby");
		// WebElement Email = driver.switchTo().activeElement();
		//System.out.println(Email);
	//WebElement Find by = driver.findElementByXPath("//div[@class='x-panel-header x-panel-header-noborder x-unselectable']");
		
		 
		
		 
		 
	}

}
