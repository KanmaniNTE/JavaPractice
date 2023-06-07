package arrayPracice;

public class AsendingOrderInMainMethod {

	public static void main(String[] args) {
//		int a[] = { 10, 30, 50, 40, 20, 5 };
		int a[] = { 2, 56, 64, 45, 23, 15, 23, 17, 16 };
		System.out.println("The Asending Array Values are :");

		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i] );
			int temp = 0;
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}
			System.out.println(a[i]);

		}	
	}

}
