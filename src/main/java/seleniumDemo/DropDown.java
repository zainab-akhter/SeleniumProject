package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args)throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		
		driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
		
	
		//select source-(Drop Down)
		
		WebElement src = driver.findElementById("createLeadForm_dataSourceId");
		
		Select dd =new Select(src);
		
		dd.selectByVisibleText("Partner");
		
		//choose Marketing Campaign
		
		WebElement mktCam = driver.findElementById("createLeadForm_marketingCampaignId");
		
		Select dd1 = new Select(mktCam);
		dd1.selectByVisibleText("Car and Driver");
		//dd1.selectByValue("CATRQ_CAMPAIGNS");
		
		//choose industry
		
		WebElement ind = driver.findElementById("createLeadForm_industryEnumId");
		
		Select dd2 = new Select (ind);
		dd2.selectByIndex(2);
	
		
		
		
		
		
		
		
		
		
		
	}

}
