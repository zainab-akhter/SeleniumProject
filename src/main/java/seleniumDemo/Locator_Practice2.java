package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Practice2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");//launch Browser
		ChromeDriver driver = new ChromeDriver();//create object for class*****************************************************
		driver.get("http://leaftaps.com/opentaps");//LOAD URL *****************************************************************
		driver.manage().window().maximize();//Maximize the Browser Window *****************************************************
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);// USE ImplicitlyWait time*****************************
		Thread.sleep(3000);
		driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");//By attribute base XPath************
		
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");//enter attribute base Xpath***************
		
		driver.findElementByXPath("//input[@type='submit']").click();//Click Login By Direct Locator********
		
		
		 driver.findElementByLinkText("CRM/SFA").click();	 //click crm/sfa link by using Direct Locator**********************
		 driver.findElementByXPath("//a[text()='Leads']").click();
		 driver.findElementByXPath("//a[text()='Find Leads']").click();
		 Thread.sleep(3000);
		// driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys("Hema");
		 driver.findElementByXPath("//a[text()='Find Leads']").click();
		 driver.findElementByXPath("(//div[@class='x-form-element']/input)[1]").sendKeys("Hema");
		 driver.findElementByXPath("//button[text()='Find Leads']").click();
		 driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();

		
		 
	}
}