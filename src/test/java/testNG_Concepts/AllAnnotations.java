package testNG_Concepts;

import org.testng.annotations.*;

public class AllAnnotations {
	
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("I am @BeforeSuite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("I am @AfterSuite");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("I am @BeforeTest");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("I am @AfterTest");
	}

	
	@BeforeGroups
	public void beforeGroups() {
		System.out.println("I am @BeforeGroups");
	}
	
	@AfterGroups
	public void afterGroups() {
		System.out.println("I am @AfterGroups");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("I am @BeforeClass");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("I am @AfterClass");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I am @BeforeMethod");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("I am @AfterMethod");
	}
	
	@Test (alwaysRun = true)
	public void TestAnnotationWithAlwaysRunTrue( ) {
		System.out.println("I am Test Annotation with Always Run = True");
	}
	
	@Test (alwaysRun = false)
	public void TestAnnotationWithAlwaysRunFalse() {
		System.out.println("I am Test Annotation with Always Run = False");
	}
	
	
	@Test
	public void SimpleTestAnnotation() {
		System.out.println("I am simple test method");
	}
	
	@Test (enabled=true) 
	public void TestAnnotationWithEnabledTrue() {
		System.out.println("I am Enabled True method");
	}
	
	@Test (enabled=false) 
	public void TestAnnotationWithEnabledFalse() {
		System.out.println("I am Enabled False method");
	}
	
	@Test (invocationCount = 2, priority = -2)
	public void TestAnnotationWithInvocationCount2() {
		System.out.println("I am invocation count2 method");
	}
	
	@Test (priority=1)
	public void TestAnnotationWithPriority1() {
		System.out.println(" I am priority1 method");
	}
	
	@Test (priority=2)
	public void TestAnnotationWithPriority2() {
		System.out.println(" I am priority2 method");
	}
	
	@Test (priority=0)
	public void TestAnnotationWithPriority0() {
		System.out.println(" I am priority0 method");
	}
	
	@Test (priority=-1)
	public void TestAnnotationWithPriority_1() {
		System.out.println(" I am priority-1 method");
	}
	
	public void NoAnnotationMethod() {
		System.out.println("I am No Annotation Method");
	}
		
	
}
