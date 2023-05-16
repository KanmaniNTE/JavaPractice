package interfacePractice;

public interface TestInterface {
	int a =5;
	
	public int b=6;
	
	static int c=7;
	
	static public int d =8;
	
	public void test1();
	
	public void test2 (int e);
	
//	public void test3() {
//		
//	}
	
	public static void test4() {
		System.out.println(a);
		System.out.println(b);
		//test1();
	
		
		
	}
	
	default void test5() {
		test1();
		test2(15);
		
	}

}
