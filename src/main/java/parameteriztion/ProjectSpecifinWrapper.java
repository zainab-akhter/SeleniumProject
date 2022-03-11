package parameteriztion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class ProjectSpecifinWrapper {
	public ChromeDriver driver;
	
	@org.testng.annotations.Parameters({"url","uname","pwd"})
		
		@BeforeMethod
		public void login(String url,String uname, String pwd) { 

			System.setProperty("webdriver.chrome.driver","C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();

			//maximize
			driver.manage().window().maximize();

			//load URL
			driver.get(url); 

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			//Enter Username - (Element level)
			driver.findElementById("username").sendKeys(uname);

			//Enter Password - (Element level)
			driver.findElementById("password").sendKeys(pwd);

			// Click Login Button - (Element level)
			driver.findElementByClassName("decorativeSubmit").click();

			// click crm.sfa link
			driver.findElementByLinkText("CRM/SFA").click();

		}

		@AfterMethod
		public void closeBrowser() { 
			driver.close();
		}
		@DataProvider
		public String[][] getData() {
			String[] [] data = new String [3][3];
			
			data [0][0] = "CTS";
			data [0][1] = "Mahmood";
			data [0][2] = "kabir";
			
			data[1][0] = "TCS";
			data[1][1] = "Ahsan";
			data[1][2] = "Ahmed";
			
			data[2][0] = "ABC";
			data[2][1] = "Alif";
			data[2][2] = "Hasan";
			
			return data;
					
		
		}
	}


