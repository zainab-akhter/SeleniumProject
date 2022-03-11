package startingPointOffFramework;

import org.testng.annotations.Test;

public class TC_001CreatLead extends GenericWrapper{
	
	@Test
	
	public void creatLead() throws InterruptedException {
		
	launchBrowser("http://leaftaps.com/opentaps/control/login");
	
	enterById("username", "DemoSalesManager");
	enterByName("PASSWORD", "crmsfa");
    clickByClassName("decorativeSubmit");
	clickByLinkText("CRM/SFA");
	clickByLinkText("Create Lead");
	enterByXpath("//input[@id='createLeadForm_companyName']", "IT INDUSTRY");
	enterByXpath("//input[@id='createLeadForm_firstName']", "ZAINAB");
	enterByXpath("//input[@id='createLeadForm_lastName']", "AKHTER");
	enterByXpath("//input[@id='createLeadForm_generalProfTitle']", "Mrs");
	clickByXpath("//select[@id='createLeadForm_dataSourceId']");
	enterByXpath("//input[@id='createLeadForm_firstNameLocal']", "Lipee");
	enterByXpath("//input[@id='createLeadForm_lastNameLocal']", "Rafique");
	enterByXpath("//input[@id='createLeadForm_annualRevenue']", "30000");
	enterByXpath("//textarea[@id='createLeadForm_description']", "I am a QA Student");
	enterByXpath("//input[@id='createLeadForm_numberEmployees']", "1200");
	enterByXpath("//textarea[@id='createLeadForm_importantNote']", "Always be careful about the colon");
	enterByXpath("//input[@id='createLeadForm_primaryPhoneAreaCode']", "602");
	enterByXpath("//input[@id='createLeadForm_primaryPhoneNumber']", "567-0033");
	enterByXpath("//input[@id='createLeadForm_primaryPhoneExtension']", "7788");
	enterByXpath("//input[@id='createLeadForm_primaryPhoneAskForName']", "KABIR");
	enterByXpath("//input[@id='createLeadForm_primaryEmail']", "Sam@123Yahoo.com");
	enterByXpath("//input[@id='createLeadForm_primaryWebUrl']", "http://leaftaps.com/opentaps/control/login");
	selectVisibleTextById("createLeadForm_marketingCampaignId", "Car and Driver");
	selectVisibleTextById("createLeadForm_dataSourceId", "Employee");
	selectVisibleTextById("createLeadForm_industryEnumId", "Finance");
    selectIndexByName("ownershipEnumId", "Public Corporation");
    enterByXpath("//input[@id='createLeadForm_generalCity']", "PHOENIX");
    enterByXpath("//input[@id='createLeadForm_generalPostalCode']", "54321");
    enterByXpath("//input[@id='createLeadForm_generalPostalCodeExt']", "1212");
    selectVisibleTextById("createLeadForm_generalStateProvinceGeoId", "Arizona");
    selectVisibleTextById("createLeadForm_generalCountryGeoId", "United States");
    //selectVisibleTextById("createLeadForm_currencyUomId", "BDT-Bangladesh Taka");
	//selectIndexByName("currencyUomId", "BDT-Bangladesh Taka");
	//enterByXpath("(//input[@name='primaryPhoneCountryCode'])[4]", "clear");
		
    Thread.sleep(2000);
	clickByXpath("//input[@name='submitButton']");
	Thread.sleep(2000);
	closeBrowser();
	
	
	}

}
