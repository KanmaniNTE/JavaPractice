package testNG_Concepts;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SimpleParameter {
	
	@Parameters({"name"})
	@Test
	public void nameTest(String name) {
		System.out.println(name);
	}
	
	@Parameters({"parameter"})
	@Test
	public void parametersTest(String para) {
		System.out.println(para);
	}
	
	@Parameters({"anyName"})
	@Test
	public void intMethod(int a) {
		System.out.println(a+20);
		System.out.println(a+ " int method");
	}
	
	@Parameters({"str"})
	@Test
	public void testOptional(@Optional() String str) {
		System.out.println("This is Optional annotation testing");
	}

}
