package ifPracticeKanmani;

public class PraciceIfCondition {

	public static void main(String[] args) {
		int a =18;
		//		if (a % 2 == 0) {
		//			System.out.println(a + " is even number");
		//			System.out.println("hello");
		//			System.out.println(a);
		//
		//			System.out.println("Hello");
		//			System.out.println("Hi");
		//			System.out.println("Hello Hi");
		//			System.out.println("Hello" + "Hi");
		//
		////			My name is "Sathya"
		//
		//			System.out.println("My name is \"Sathya\"");
		//		}

		//		if(a % 2 == 0) {
		//			System.out.println(a+" is Even Number");
		//		}
		//		else {
		//			System.out.println(a+" is Odd Number");
		//		}
		//given number id divisible by 2 and then 3
		//		if(a % 2 == 0) {
		//			System.out.println(a+" is divisible by 2");
		//		}
		//		if(a % 3 == 0) {
		//			System.out.println(a+" is divisible by 3");
		//		}
		if (a % 2 == 0) {
			System.out.println(a + " is divisible by 2");
		}

		else if (a % 3 == 0) {
			System.out.println(a + " is divisible by 3");
		} else
			System.out.println(a + " is neither divisible by 2 or 3");

		// verify a number is divisible by 2 and 3
		if (a % 2 == 0 && a % 3 == 0) {
			System.out.println(a + " is divisible by 2 and 3");
		}
		if (a % 2 == 0) {
			System.out.println(a + " is divisible by 2");

			if (a % 3 == 0) {
				System.out.println(a + " is divisible by 3");
				// content
			}
		}

		if (a % 2 == 0 && a % 3 == 0) {
			System.out.println(a + " is divisible by 2 and 3");
		}

		if (a % 2 == 0 || a % 3 == 0) {
			System.out.println(a + " is either divisible by 2 or 3");
		}

		if (method1() % 2 == 0) {
			System.out.println("***");
		}

//		if(a % 2 == 0) {
//			int k = a % 2;
//			System.out.println("its odd");
//		}


		if(method2()) { 

		}

	}

	public static int method1() {
		int a = 10;
		return a;
	}

	public static boolean method2() {
		return true;
	}
}


