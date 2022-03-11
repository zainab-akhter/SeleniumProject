package assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assertions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
				
		//Maximize Window
		driver.manage().window().maximize();
		//Load URL
		//driver.get("https://opensource-demo.orangehrmlive.com/");
				
		driver.get("https://secure.bankofamerica.com/login/sign-in/signOnV2Screen.go");

		//driver.get("http://secure.bankofamerica.com/login/sign-in/signOnV2Screen.go");
		//get title of the page
		String title = driver.getTitle();
		System.out.println(title);
		
		//Assert.assertEqals(Actual result,"Expected result","Assert Message")
       Assert.assertEquals(title, "Bank of America|Online Banking|Log in|Online ID","Asserting page title");
       
       //isDisplayed();-"Bank of America"logo is displayed(true/false)
      
      // boolean logo = driver.findElement(By.xpath("//img[@alt='Bank of America']")).isDisplayed();
       boolean logo = driver.findElementByXPath("//img[@alt='Bank of America']").isDisplayed();
       //Assertion
       Assert.assertTrue(logo, "logo is displayed");
       System.out.println(logo);
       //Validation
       if(logo==true) {
    	   System.out.println("logo is displayed");
       }else {
    	   System.out.println("logo is not displayed");
       }
       //isEnable();-Get the App link is Enable(true/False)
       boolean getTheAppLink = driver.findElementByXPath("//a[@id='choose-device-get-the-app']/span[1]").isEnabled();
       
      // boolean getTheAppLink = driver.findElement(By.xpath("//a[@id='choose-device-get-the-app']/span[1]")).isEnabled();
       
		if(getTheAppLink==true) {
			System.out.println("The Get the App link is Enabled");
		}else {
			System.out.println("The Get the App link is not Enabled");
		}
		        //isSelected();-to do this validation we can use only-RadioButton,a CheckBox & Drop-down (true/false)  
		
				//1st click on the "Save this online Id CheckBox"(select) then verify isSelected() otherwise else part will be work
		
		        //driver.findElement(By.xpath("//div[@class='remember-info']/input ")).click();
		
		        driver.findElementByXPath("//div[@class='remember-info']/input").click();
		        boolean SaveThisOnlineIdCheckbox1 = driver.findElementByXPath("//div[@class='remember-info']/input").isSelected();
		        
				//boolean SaveThisOnlineIdCheckbox1 = driver.findElement(By.xpath("//div[@class='remember-info']/input ")).isSelected();
				System.out.println(SaveThisOnlineIdCheckbox1);

				//Assertion
				Assert.assertTrue(SaveThisOnlineIdCheckbox1, "SaveThisOnlineId CheckBox is selected");

				//Validation
				if(SaveThisOnlineIdCheckbox1==true) {
					System.out.println("The checkbox is Selected");
				}else {
					System.out.println("The checkbox is not Selected");
				}

				//driver.quit();
       
       

	}

}
