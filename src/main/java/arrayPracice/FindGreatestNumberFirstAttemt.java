package arrayPracice;

public class FindGreatestNumberFirstAttemt {
	int a[] = { 2, 20, 10, 180 };
	int max = a[0];

	public static void main(String[] args) {
		FindGreatestNumberFirstAttemt grt = new FindGreatestNumberFirstAttemt();
		grt.getMaxValue1();
//		grt.getMaxValue(null);
		grt.getMaxValue2(grt.a);
	}

	public void getMaxValue(int[] arr) {

		System.out.println("The Values in the Array are : ");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(a[i]);
			if (a[i] > max) {
				max = a[i];
			}

		}
		System.out.println("The Greatest Value is " + max);

	}

	public void getMaxValue1() {
		int a[] = { 200, 20, 10, 180, 190 };

		System.out.println("The Values in the Array are : ");

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			if (a[i] > max) {
				max = a[i];
			}

		}
		System.out.println("The Greatest Value is " + max);

	}
	
	public void getMaxValue2() {
		int b[] = { 1, 20, 10, 18, 0 };

		System.out.println("The Values in the Array are : ");

		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
			if (b[i] > max) {
				max = b[i];
			}

		}
		System.out.println("The Greatest Value is " + max);

	}
	
	public void getMaxValue2(int[] b) {

		System.out.println("The Values in the Array are : ");

		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
			if (b[i] > max) {
				max = b[i];
			}

		}
		System.out.println("The Greatest Value is " + max);

	}

}
