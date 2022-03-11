package wrapper;

import org.testng.annotations.Test;

public class DeleteLead03 extends SupperClass{
	@Test
	public void deleteLead03() throws InterruptedException {
		driver.findElementByXPath("//a[text()='Leads']").click();
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		driver.findElementByXPath("(//span[@class='x-tab-strip-text '])[2]").click();
		driver.findElementByXPath("//input[@name='phoneAreaCode']").sendKeys("682");
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("2084048");		
//Click find leads button
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);	
		
//Capture lead ID of First Resulting lead
		String leadId = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").getText();
		System.out.println(leadId);	 
//Click First Resulting lead
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();		
//Click Delete
		//driver.findElementByXPath("//a[text()='Delete']").click();
	
//Click Find leads
		driver.findElementByXPath("//a[text()='Find Leads']").click();
//Enter captured lead ID
		driver.findElementByXPath("//input[@name='id']").sendKeys("10056");
//Click find leads button
		driver.findElementByXPath("//button[text()='Find Leads']").click();
        
	}



	}





