package interfacePractice;

public class InterfacePractice implements TestInterface {
	public static void main(String[] args) {
		InterfacePractice obj =new InterfacePractice();
		obj.test1();
		obj.test2(d);
		obj.test5();
		//obj.e;
		System.out.println("Value of a is " +a);
		System.out.println("Value of b is " +b);
		System.out.println("Value of c is " +c);
		System.out.println("Value of d is " +d);
//		System.out.println(e);
	}

	@Override
	public void test1() {
		
		System.out.println("Object Value of a is " + a);
		System.out.println("Object Value of b is " +b);
		System.out.println("Object Value of c is " +c);
		System.out.println("Object Value of d is " +d);
		System.out.println("***************************");
		
	}

	@Override
	public void test2(int e) {
		System.out.println("Value of e is "+e);
		
		
	}

}
