package TestCase_HomeWork;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class MergeLead_05 {

	public static void main(String[] args) throws InterruptedException {
		//Launch the Browser
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		//Object Create of ChromeBrowser
		ChromeDriver driver = new ChromeDriver();
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
		//Click Leads Link
		driver.findElementByLinkText("Leads").click();
		//Click Merge leads
		driver.findElementByPartialLinkText("Merge Leads").click();
		//Click on icon near from lead
		Thread.sleep(3000);
		driver.findElementByXPath("(//img[@alt='Lookup'])[1]").click();
		//Get the reference of FirstWindow
	
		String firstwindow = driver.getWindowHandle();
		System.out.println(driver.getTitle());
		//Move to new window
		Set<String> allwin = driver.getWindowHandles();
		System.out.println(allwin);
		
		for (String eachwin : allwin) {
			driver.switchTo().window(eachwin);
			System.out.println(driver.getTitle());
		}
		 Thread.sleep(3000);	
		 //Enter lead ID
		driver.findElementByXPath("//input[@type='text']").sendKeys("10070");
		/*//Click Find Leads button
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		//Click First Resulting lead
		String FirstL = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").getText();
		System.out.println(FirstL);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
		//Switch back to primary window
		driver.switchTo().window(firstwindow);
		Thread.sleep(3000);

		//Click on Icon near To Lead 
		driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'])[2]").click();
		//Move to new window
				Set <String> allwin1 =driver.getWindowHandles();
				System.out.println(allwin1);		
			for (String eachwin1 : allwin1) {
				driver.switchTo().window(eachwin1);
				System.out.println(driver.getTitle());
				
	}
			Thread.sleep(3000);
			//Enter Lead ID
			driver.findElementByXPath("//input[@type='text']").sendKeys("10057");
	//Click Find Leads button
			Thread.sleep(3000);	
			driver.findElementByXPath("//button[text()='Find Leads']").click();
			Thread.sleep(3000);
			

     
	//Click First Resulting lead
			String FirstL1 = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").getText();
			System.out.println(FirstL1);
			driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
			//Switch back to primary window-
			driver.switchTo().window(firstwindow);
			//Click on Icon near To Lead 
			driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'])[2]").click();
			//Move to new window
			Set <String> allwin2 =driver.getWindowHandles();
			System.out.println(allwin2);		
		for (String eachwin2 : allwin2) {
			driver.switchTo().window(eachwin2);
			System.out.println(driver.getTitle());
		}
		Thread.sleep(3000);
		//Enter Lead ID 
				driver.findElementByXPath("(//input[@type='text'])[1]").sendKeys("10072");
		//Click Find Leads button
				driver.findElementByXPath("//button[text()='Find Leads']").click();
		//Click First Resulting lead
				Thread.sleep(3000);
				String FirstL2 = driver.findElementByXPath("(//div[@unselectable='on']/a)[24]").getText();
				System.out.println(FirstL2);
				driver.findElementByXPath("(//div[@unselectable='on']/a)[24]").click();
				Thread.sleep(3000);
				//Switch back to primary window
				driver.switchTo().window(firstwindow);
				Thread.sleep(3000);
				//Click  on Merge
				driver.findElementByLinkText("Merge").click();	
			//Accept Alert
				String simpleAlert = driver.switchTo().alert().getText();
				System.out.println(simpleAlert);
				Thread.sleep(3000);
				driver.switchTo().alert().accept();	
			//Click Find Leads
				driver.findElementByXPath("//a[text()='Find Leads']").click();	
			//Enter From Lead ID
				Thread.sleep(3000);
				driver.findElementByXPath("//input[@name='id']").sendKeys("10006");
			//Click Find Leads
				Thread.sleep(3000);
				driver.findElementByXPath("//button[text()='Find Leads']").click();
			//Verify error message 
				
				String errMsg = driver.findElementByXPath("//div[text()='No records to display']").getText();
				System.out.println(errMsg);  
				if(errMsg.contains("No records")) {
					System.out.println("ErrMsg is matched");	
				}else {
					System.out.println("ErrMsg not matched");  
				}
			//Close the browser (Do not log out)
				driver.close();*/
				}

			
	
}


