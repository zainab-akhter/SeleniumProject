package testNGDEMO;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MergeLead {
	@Test
	public void mergeLead() throws InterruptedException, IOException {
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
				//driver.close();
				File src = driver.getScreenshotAs(OutputType.FILE);
				//File dest = new File("C:\\Users\\ahmed\\Desktop\\Snaps\\image.png");
				File dest = new File("./Snap1/MergeLeadimage.png");
				
				FileUtils.copyFile(src, dest);
						
		
	}

}
