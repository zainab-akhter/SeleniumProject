package seleniumDemo;

import org.openqa.selenium.chrome.ChromeDriver;

public class Selectable {

	public static void main(String[] args)  throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.findElementByXPath("//h1[text()='Selectable']");
		//use Parent to child navigation/travel
		driver.findElementByXPath("//ol[@id='selectable']/li[1]").click();
		driver.findElementByXPath("//ol[@id='selectable']/li[7]").click();
		
		Thread.sleep(2000);
		//driver.close();
	}

}
