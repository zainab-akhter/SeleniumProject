package testNGDEMO;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class EditLead {
	@Test
	public void editLead() throws InterruptedException, IOException {
System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		

		
		//System.setProperty("webdriver.chrome.driver","C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		
		driver.findElementByXPath("//input[@ id='username']").sendKeys("DemoSalesManager");
	
		driver.findElementByXPath("(//input[@class='inputLogin'])[2]").sendKeys("crmsfa");
		//driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		driver.findElementByXPath("//a[contains(text(),'CRM/S')]").click();
		//Click Leads Link
				driver.findElementByXPath("//a[text()='Leads']").click();
		//Click Find leads
				driver.findElementByXPath("//a[text()='Find Leads']").click();
		//Enter first name-----as Hema	
				driver.findElementByXPath("(//div[@class='x-form-element']/input)[14]").sendKeys("Hema");	
		//Click Find leads button
				driver.findElementByXPath("//button[text()='Find Leads']").click();     
				Thread.sleep(2000);
				System.out.println("***********************************");
		//Click on first resulting lead	
				Thread.sleep(2000);
				WebDriverWait wait = new WebDriverWait(driver, 10);
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")));
				
				String LeadId = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").getText();
				System.out.println(LeadId);
				
				driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();	
				Thread.sleep(3000);
		//Verify title of the page
				String title = driver.getTitle();
				System.out.println(title);
				if(title.contains("View")) {
					System.out.println("View Lead----Title  is matched");
				} else {
					System.out.println("View Lead----Title  is Not Matches");
				}
		//Click Edit
				driver.findElementByXPath("//a[text()='Edit']").click();
				Thread.sleep(2000);
		//Change the company name ---------CTS
				driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").clear();
				Thread.sleep(2000);
				driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").sendKeys("CTS");
				Thread.sleep(2000);
		//Click Update
				driver.findElementByXPath("(//input[@name='submitButton'])[1]").click();
		//Confirm the changed name appears
				String compName = driver.findElementById("viewLead_companyName_sp").getText();
				System.out.println(compName);	 
				  if(compName.contains("CTS")) {
				  System.out.println("Company Name is matched"); 	  
				  }
                  else {
				 System.out.println("Company Name is Not matched");
				 }	
				 // driver.close();
				  File src = driver.getScreenshotAs(OutputType.FILE);
					//File dest = new File("C:\\Users\\ahmed\\Desktop\\Snaps\\image.png");
					File dest = new File("./Snap1/EditLeadimage.png");
					
					FileUtils.copyFile(src, dest);
							


		

	}

}
		
		
	


