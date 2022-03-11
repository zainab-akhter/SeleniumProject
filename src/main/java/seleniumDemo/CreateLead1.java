/*Name:Zainab Akhter
Class:XPath base Homework*/
package seleniumDemo;

import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead1 {

	public static void main(String[] args) throws InterruptedException{
		
		//use Partial Text base Xpath
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		//use attribute base xpath
		driver.findElementByXPath("//input[@ id='username']").sendKeys("DemoSalesManager");
		//use Collections XPath
		driver.findElementByXPath("(//input[@class='inputLogin'])[2]").sendKeys("crmsfa");
		//driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		driver.findElementByXPath("//a[contains(text(),'CRM/S')]").click();
		//use Text Base Xpath
		driver.findElementByXPath("//a[text()='Create Lead']").click();
		//use Attribute base Xpath
		driver.findElementByXPath("//input[@id='createLeadForm_companyName']").sendKeys("IT industry");
		driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys("Hema");
		driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys("Mali");
		driver.findElementByXPath("//input[@id='createLeadForm_generalProfTitle']").sendKeys("Mrs");
		//parent to child navigation
		driver.findElementByXPath("//select[@id='createLeadForm_dataSourceId']/option[2]").click();
		//Attribute base Xpath
		driver.findElementByXPath("//textarea[@id='createLeadForm_description']").sendKeys("I am a Java student");
		driver.findElementByXPath("//select[@id='createLeadForm_industryEnumId']").sendKeys("It is a IT Company");
		
		Thread.sleep(3000);
		//driver.close();
		
		
		
	}

}
