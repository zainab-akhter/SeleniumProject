package seleniumDemo;

import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps");
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		driver.findElementById("password").sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		
		driver.findElementByPartialLinkText("Create Lead").click();
		
		driver.findElementById("createLeadForm_firstName").sendKeys("Hema");
		
		driver.findElementById("createLeadForm_lastName").sendKeys("Mali");
		
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Mrs");
		
		driver.findElementById("createLeadForm_description").sendKeys("It is an IT company");
		
		//driver.findElementByClassName("smallSubmit").click();
		
		Thread.sleep(3000);
		driver.close();
		
		
			
		
		
		
				

	}

}
