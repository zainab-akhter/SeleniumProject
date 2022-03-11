package TestCase_HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
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
		driver.findElementByXPath("//a[text()='Leads']").click();
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		//driver.findElementByXPath("(//span[@class='x-tab-strip-text '])[2]").click();
		driver.findElementByXPath("//span[text()='Email']").click();
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("abc@gmail.com");
		Thread.sleep(3000);	
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		System.out.println("*****************************");
		Thread.sleep(3000);	
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")));		
		String FirstResultingLead = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").getText();
		System.out.println("First Resulting Lead ID");
		System.out.println(FirstResultingLead);
//Click First Resulting lead
		Thread.sleep(2000);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
		Thread.sleep(2000);
//Click Duplicate Lead
		driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
//Verify the title as 'Duplicate Lead' ---------------
		System.out.println(driver.getTitle());
		String Title = driver.getTitle();
		if (Title.contains("Duplicate Lead")){
			System.out.println("Title---Duplicate Lead---- Matched");

		} else {
			System.out.println("Title---Duplicate Lead---- not matched");
		}
//Click Create Lead
		driver.findElementByXPath("//input[@value='Create Lead']").click();
		driver.close();





		
	}

}
