package testNG_Concepts;

import org.testng.annotations.Test;

public class Grouping {

	@Test(groups= {"testing1"})
	public void method1() {
		System.out.println("This method belongs to testing1 group");
	}

	@Test(groups= {"testing2"})
	public void method2() {
		System.out.println("This method belongs to testing2 group");
	}

	@Test(groups= {"testing3"})
	public void method3() {
		System.out.println("This method belongs to testing3 group");
	}

	@Test(groups= {"testing1", "testing2"})
	public void method4() {
		System.out.println("This method belongs to testing1 and testing2 group");
	}

	@Test(groups= {"testing1", "testing2", "testing3"})
	public void method5() {
		System.out.println("This method belongs to testing1, testing2 and testing3 group");
	}

	@Test(groups= {"testing1", "testing3"})
	public void method6() {
		System.out.println("This method belongs to testing1 and testing3 group");
	}

}
