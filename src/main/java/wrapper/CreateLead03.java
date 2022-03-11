package wrapper;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateLead03 extends SupperClass {
	@Test
	public void createLead() throws InterruptedException, IOException {
		
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
		//Enter Number of Employee by Using XPath
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
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		//File dest = new File("C:\\Users\\ahmed\\Desktop\\Snaps\\image.png");
		File dest = new File("./Snap1/CreateLeadimage.png");
		
		FileUtils.copyFile(src, dest);
				
	}
		
	}


