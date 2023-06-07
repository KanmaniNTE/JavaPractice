package forPracticeKanmani;

public class PracticeForLoop {
	public static void main(String[] args) {

		// for (int a = 1; a <= 10; a++) {
		// System.out.println(a);
		// }

		// for (int a = 1; a <= 10; a++) {
		// if(a % 2 != 0)
		// System.out.println(a);
		// }

		// for (int a = 1; a <= 10; ) {
		// System.out.println(a);
		// a = a+2;
		// }

		// for (int a = 1; a <= 10; a++) {
		// System.out.println(a);
		// }
		//
		// for (int a = 100; a < 150;) {
		// System.out.println(a);
		// a++;
		//
		// }

		// int i;
		// for (i = 1; i <= 5; i++) {
		// System.out.println(i);
		// // i++;
		// // break;
		// if(i==3) {
		// System.out.println(i);
		// break;
		// }
		// System.out.println("Hello");
		// }
		// System.out.println(i);

		// for (int i = 1; i <= 5; i++) {
		// System.out.println(i);
		// for (int j = 1; j <= 5; j++) {
		// System.out.println("***********"+j);
		// }
		// }

		// for (int i = 1; i <= 5; i++) {
		// System.out.println("i value is "+ i);
		// for (int j = 1; j <= 5; j++) {
		// System.out.println("j value is "+j);
		// break;
		// }
		// }

		// for (int i = 1; i <= 5; i++) {
		// System.out.println(i);
		// for (int j = 1; j <= 5; j++) {
		// System.out.println("*******"+j);
		// continue;
		//// System.out.println("Hello");
		// }
		// }

//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= 5; j++) {
//				System.out.println("***********" + j);
//			}
//			System.out.println(i);
//		}

//		for (int i = 1; i <= 5; i++) {
//		for (int j = i; j <= 5; j++) {
//			System.out.println("***********" + j);
//		}
//		System.out.println(i);
//	}
//		for (int i = 1; i <= 5; i++) {
//		for (int j = 1; j <= i; j++) {
//			System.out.println("***********" + j);
//		}
//		System.out.println(i);
//	}
//		for (int i = 1; i <= 5; i++) {
//		for (int j = 1; j <= 5; j++) {
//			System.out.print("1");
//		}
//		System.out.println();
//	}

//		for (int i = 1; i <= 5; i++) {
//		for (int j = 1; j <= i; j++) {
//			System.out.print("1");
//			System.out.print(i);
//			System.out.print(j);
//		}
//		System.out.println();
//	}
//		for (int i = 1; i <= 5; i++) {
//		for (int j = i; j <= 5; j++) {
//			for (int k = 5; k >= i; k--) {
//			System.out.print("1");
//			System.out.print(i);
//			System.out.print(j);
//		}
//		System.out.println();
//	}
//		}

//		for(int i =1; i<=4; i++){
//		    for (int j = 1; j<=4; j++){
//		    System.out.print(i);
//		    
//		    }
//		 System.out.println();
//		}

//		for(int i =1; i<=5; i++){
//		    for (int j = 1; j<=5; j++){
//			if(j==i) {
//		    System.out.print("*");
//			break;
//		    }
//		else 
//			System.out.print(" ");
//		}
//		 System.out.println();
//
//		}

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j == i) {
					System.out.print(i);
					break;
				} else
					System.out.print(" ");
			}
			System.out.println();

		}

	}

}
