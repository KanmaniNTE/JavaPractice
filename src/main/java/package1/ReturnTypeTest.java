package package1;

public class ReturnTypeTest {
	static String a;
	public static void main(String[] args) {
		System.out.println(a);
		ReturnTypeTest test = new ReturnTypeTest();
		a=test.methodWithReturnType();
		System.out.println("Main Method String ="+a);
		test.test1();
		test.test3(10);
	}
	public String methodWithReturnType() {
		String test = "Maki";
		System.out.println("Method with return type= "+test);
		return test;
		//	return "Kanmani";
	}
	public void test1() {
		String b = methodWithReturnType();
		System.out.println("Test Method String = "+a);
		System.out.println(b);

	}
	public void test2() {
		
	}
	public Object methodWithReturnTypeAsObject() {
		ReturnTypeTest test = new ReturnTypeTest();
		return test;
		
	}
	public int test3(int a) {
		return 25;
		
	}
	public int test4(int aa) {
		return aa;
		
	}
	public int test5(int abc) {
		int test =abc;
		return abc;
		
	}
	int test;
	public int test6(int aa) {
		
		test = aa;
		return test;
	}
	public String test7(int ab) {
		String testName = "Kanmani";
		return testName;
		
	}
	

}
