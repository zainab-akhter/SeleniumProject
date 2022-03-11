/*Name:Zainab Akhter
Class:Selenium 
Home Work: All_LOcator_Concept*/

package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class All_Locator_Practice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");//launch Browser
		ChromeDriver driver = new ChromeDriver();//create object for class*****************************************************
		driver.get("http://leaftaps.com/opentaps");//LOAD URL *****************************************************************
		driver.manage().window().maximize();//Maximize the Browser Window *****************************************************
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);// USE ImplicitlyWait time*****************************
		
		driver.findElementById("username").sendKeys("DemoSalesManager");//Enter username by direct Locator*********************
		
		//driver.findElementByXPath("//input[@type='text']").sendKeys("DemoSalesManager");//By attribute base XPath************
		//driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");//By attribute base XPath**********
		
		driver.findElementById("password").sendKeys("crmsfa");//Enter password by direct Locator*******************************
		
		//driver.findElementByXPath("//input[@type='password']").sendKeys("crmsfa");//enter attribute base Xpath***************
		//driver.findElementByXPath("//input[@name='PASSWORD']").sendKeys("crmsfa");//enter attribute base Xpath***************
		
		 driver.findElementByClassName("decorativeSubmit").click();//Click Login By Direct Locator*****************************
         
		// driver.findElementBy attribute base XPath("//input[@type='submit']").click();//Click Login By Direct Locator********
		// driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
	
		
		 driver.findElementByLinkText("CRM/SFA").click();	 //click crm/sfa link by using Direct Locator**********************
		
		//driver.findElementByXPath("//a[contains(text(),'CRM/S')]").click();//use Partial Text base Xpath*********************
		
		 driver.findElementByPartialLinkText("Create Lead").click();//Click Create Lead link by using direct Locator***********
		
		//driver.findElementByXPath("//a[text()='Create Lead']").click();//use Text Base Xpath*********************************
		
		
		 driver.findElementById("createLeadForm_companyName").sendKeys("TCS"); //Enter Company Name by usingDirect Locator*****
		
		 //driver.findElementByXPath("//input[@id='createLeadForm_companyName']").sendKeys("TCS"); //use attribute base XPath**
		 
		
		 driver.findElementById("createLeadForm_firstName").sendKeys("Hema");//Enter Fisst Name by using Direct Locator********
		 
		 //driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys("Hema");//use attribute base XPath****
		 
		 driver.findElementById("createLeadForm_lastName").sendKeys("Mali");//Enter Last Name use Direct Locator***************
		
		//driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys("Mali");//use attribute base XPath******
		 driver.findElementById("createLeadForm_dataSourceId").click();

			//select source(Employee) using -(Drop Down)***********************************************************************
			
			WebElement src = driver.findElementById("createLeadForm_dataSourceId");//******************************************
			
			Select dd =new Select(src);//**************************************************************************************
			
			dd.selectByVisibleText("Employee");//******************************************************************************
		
			driver.findElementById("createLeadForm_generalProfTitle").sendKeys("MS");	//Enter TItle**************************
			//choose industry Computer Hardware
			
			WebElement ind = driver.findElementById("createLeadForm_industryEnumId");
			
			Select dd2 = new Select (ind);
			dd2.selectByVisibleText("Computer Hardware");
			
			WebElement owner = driver.findElementById("createLeadForm_ownershipEnumId");//choose Ownership*********************
			Select dd3 = new Select (owner);
			dd3.selectByVisibleText("Partnership");
			//driver.findElementById("createLeadForm_description").sendKeys("TCS");//Enter Description by useing  Direct Locator
		
			driver.findElementByXPath("//textarea[@id='createLeadForm_description']").sendKeys("TCS");	//use attribute base XPath
		
			driver.findElementByXPath("//input[@value='1']").clear();	//Enter Country Code**************************************
			Thread.sleep(3000);
			driver.findElementByXPath("//input[@value='1']").sendKeys("1");
		
			driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneAreaCode']").sendKeys("88552");//Enter Area Code by Using Xpath
		
			driver.findElementByXPath("//input[@name='primaryPhoneExtension']").sendKeys("32");	//Entr Extension by using XPath*******
			
			driver.findElementByXPath("//input[@name='departmentName']").sendKeys("MKT");//enter Department By Using XPath************
			
			driver.findElementByXPath("//input[@name='numberEmployees']").sendKeys("100");//Enter Number of Employee by Using XPath***
			Thread.sleep(3000);
		
			driver.findElementByXPath("//input[@id='createLeadForm_primaryWebUrl']").sendKeys("https://www.google.com/");//Enter Web URL
			driver.findElementByXPath("//input[@name='generalCity']").sendKeys("PHOENIX");	//Enter City By Using XPath***************
		
			WebElement state = driver.findElementByXPath("//select[@name='generalStateProvinceGeoId']");//Choose State/Province*******
			Select dd4 = new Select(state);//*****************************************************************************************
			dd4.selectByVisibleText("Arizona");//*************************************************************************************
		
			WebElement country = driver.findElementByXPath("//select[@name='generalCountryGeoId']");//Choose Country by Using XPath***
			Select dd5 = new Select(country);//***************************************************************************************
			dd5.selectByVisibleText("United States");//*******************************************************************************
		
			driver.findElementByXPath("//input[@name='generalPostalCode']").sendKeys("75061");	//Enter Zip/Postal Code***************
		
			WebElement campaign = driver.findElementByXPath("//select[@name='marketingCampaignId']");//Choose Marketing Campaign******
			Select dd6 = new Select(campaign);//**************************************************************************************
			dd6.selectByVisibleText("Automobile");//**********************************************************************************
			
			driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneNumber']").sendKeys("123456");//Enter Phone Number By Using XPath
			
			driver.findElementByXPath("//input[@id='createLeadForm_primaryEmail']").sendKeys("abc@gmail.com");//Enter E-Mail Address Using Xpath
			Thread.sleep(3000);//******************************************************************************************************
		
			driver.findElementByXPath("//input[@type='submit']").click();	//Click Creat Lead By Using Attribute XPath****************
			
			//driver.findElementByXPath("//input[starts-with(@id,'ext-gen601')]").click();//*********************************************
			
			//driver.close();//********************************************************************************************************
			
			
			
	}
			
			
}		
			
			
			
		
		
		
		
		
		
		
		
	


