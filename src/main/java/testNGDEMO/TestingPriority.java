package testNGDEMO;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestingPriority {
	public ChromeDriver driver;
	

	@BeforeMethod
	public void login() throws InterruptedException{
		//Launch the Browser
				System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
				//Object Create of ChromeBrowser
				//ChromeDriver driver = new ChromeDriver();
				driver= new ChromeDriver();
				//Maximize Window
				driver.manage().window().maximize();
				//Load URL of Leaftaps
				driver.get("http://leaftaps.com/opentaps");
				//Put ImplicitelyWait
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				//Get THe Title

				System.out.println(driver.getTitle());
				
				//Enter Username
				driver.findElementById("username").sendKeys("DemoSalesManager");
				//Enter PassWord
				driver.findElementById("password").sendKeys("crmsfa");
				//Click Login
				driver.findElementByClassName("decorativeSubmit").click();
				//Click CRM/SFA
				driver.findElementByPartialLinkText("CRM/SFA").click();
				Thread.sleep(3000);
	}

	@Test(priority=1)
	public void editLead() throws InterruptedException {
		//Click Leads Link
		driver.findElementByXPath("//a[text()='Leads']").click();
//Click Find leads
		driver.findElementByXPath("//a[text()='Find Leads']").click();
//Enter first name-----as Hema	
		driver.findElementByXPath("(//div[@class='x-form-element']/input)[14]").sendKeys("Hema");	
//Click Find leads button
		driver.findElementByXPath("//button[text()='Find Leads']").click();     
		Thread.sleep(2000);
	}
		
		@Test(priority=2)
		public void mergeLead() throws InterruptedException {
			//Click Leads Link
			driver.findElementByLinkText("Leads").click();
			//Click Merge leads
			driver.findElementByPartialLinkText("Merge Leads").click();
			//Click on icon near from lead
			Thread.sleep(3000);
			driver.findElementByXPath("(//img[@alt='Lookup'])[1]").click();
		}
		@Test(priority=0)
		public void creatLead() throws InterruptedException {
			driver.findElementByXPath("//a[text()='Create Lead']").click();
			
			
			driver.findElementByXPath("//input[@id='createLeadForm_companyName']").sendKeys("TCS");
					
			driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys("Hema");
					
			driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys("Ma");

			driver.findElementById("createLeadForm_generalProfTitle").sendKeys("MS");	
			driver.findElementByXPath("//textarea[@id='createLeadForm_description']").sendKeys("TCS");
			driver.findElementByXPath("//input[@value='1']").clear();	
			Thread.sleep(3000);
			driver.findElementByXPath("//input[@value='1']").sendKeys("1");
			driver.findElementByXPath("//input[@name='departmentName']").sendKeys("MKT");
			//Enter Number of Employee by Using XPath***
			Thread.sleep(3000);
		
			driver.findElementByXPath("//input[@id='createLeadForm_primaryWebUrl']").sendKeys("https://www.google.com/");
			driver.findElementByXPath("//input[@name='generalCity']").sendKeys("PHOENIX");	
		
			WebElement state = driver.findElementByXPath("//select[@name='generalStateProvinceGeoId']");
			Select dd4 = new Select(state);//*****************************************************************************************
			dd4.selectByVisibleText("Arizona");//*************************************************************************************
		
			WebElement country = driver.findElementByXPath("//select[@name='generalCountryGeoId']");
			Select dd5 = new Select(country);//***************************************************************************************
			dd5.selectByVisibleText("United States");//*******************************************************************************
		
			driver.findElementByXPath("//input[@name='generalPostalCode']").sendKeys("75061");	
		
			WebElement campaign = driver.findElementByXPath("//select[@name='marketingCampaignId']");
			Select dd6 = new Select(campaign);//**************************************************************************************
			dd6.selectByVisibleText("Automobile");//**********************************************************************************
			
			driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneNumber']").sendKeys("123456");
			driver.findElementByXPath("//input[@id='createLeadForm_primaryEmail']").sendKeys("abc@gmail.com");
			Thread.sleep(3000);//******************************************************************************************************
			driver.findElementByXPath("//input[@type='submit']").click();	//Click Creat Lead 
		}
		@AfterMethod
		public void closeBrowser() {
			driver.close();
		}
}
	