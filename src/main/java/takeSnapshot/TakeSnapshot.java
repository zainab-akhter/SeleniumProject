package takeSnapshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeSnapshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
        driver.get("http://leaftaps.com/opentaps");
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		driver.findElementById("password").sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		
		driver.findElementByPartialLinkText("Create Lead").click();
		
		driver.findElementById("createLeadForm_firstName").sendKeys("Hema");
		
		driver.findElementById("createLeadForm_lastName").sendKeys("Mali");
		
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		//File dest = new File("C:\\Users\\ahmed\\Desktop\\Snaps\\image.png");
		File dest = new File("./Snap1/SnapShotimage.png");
		
		FileUtils.copyFile(src, dest);
				

	}

}
