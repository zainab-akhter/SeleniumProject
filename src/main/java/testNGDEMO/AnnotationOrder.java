package testNGDEMO;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AnnotationOrder {
	@BeforeClass
	public void beforeTest() {
System.out.println("before Test");
	}
	@BeforeSuite
	public void beforeSuit() {
		System.out.println("before Suite");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("before Class");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before Method");
	} 
	@Test
	public void Test1() {
		System.out.println("Execute Test 1");
	}
	@Test
	public void Test2() {
		System.out.println("Execute Test 2");
	}
	@Test
	public void Test3() {
		System.out.println("Execute Test 3");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}
	@AfterSuite
	public void afterSuit() {
		System.out.println("After suite");
	}
	
}