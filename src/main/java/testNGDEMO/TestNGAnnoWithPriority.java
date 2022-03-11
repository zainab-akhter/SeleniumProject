package testNGDEMO;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnoWithPriority {
	@BeforeSuite
	public void  befpresuite(){
		System.out.println("BeforeSuite");
		
	}
	
@BeforeTest
public void beforeTest() {
	System.out.println("BeforeTest");
}
@BeforeClass
public void beforeClass(){
	System.out.println("BeforeClass");
}
@BeforeMethod
public void beforemethod() {
System.out.println("BeforeMethod");	
}
@Test(priority=1)
public void test1() {
	System.out.println("Execute test1");
}
@Test
public void test2() {
	System.out.println("Execute test 2");
}
@Test(priority=0)
public void test3() {
	System.out.println("Execute test 3");
}
@AfterMethod
public void afterMethod() {
	System.out.println("AfterMethod");
}
@AfterClass
public void afterClass() {
System.out.println("AfterClass");	
}
@AfterTest
public void afterTest() {
	System.out.println("AfterTest");
}
@AfterSuite
public void afterSuite() {
	System.out.println("AfterSuit");
}

}
