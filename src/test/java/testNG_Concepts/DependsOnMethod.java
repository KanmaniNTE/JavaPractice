package testNG_Concepts;

import org.testng.annotations.Test;

public class DependsOnMethod {
	
	@Test 
	public void method1() {
		System.out.println(1/0);
//		System.out.println("I am method1");
	}
	
	@Test (dependsOnMethods = "method1")
	public void method2() {
		System.out.println("I am belongs to method2");
	}
	
	@Test
	public void method3() {
		System.out.println("I am method3 ");
	}
	
	//No need of testNG.xml, we can even run it from here.
}
