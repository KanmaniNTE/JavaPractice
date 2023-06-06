package arrayPracice;

public class FindGreatestNumberFromArray {
//	int a[] = { 2, 20, 10, 180 };
	int d[] = { 10,15,7,24,36,4,18};
//	int max = b[0];
//	int b = 100;

	public static void main(String[] args) {
		FindGreatestNumberFromArray grt = new FindGreatestNumberFromArray();
//		grt.getMaxValue();
//		grt.buySoap(grt.b);
		grt.getMaxValue(grt.d);
//		System.out.println(grt.a);
//		System.out.println(grt.b);
//	   System.out.println(grt.max);
	}

	public void getMaxValue(int[] arr) {
		int max = arr[0];
		System.out.println("The Values in the Array are : ");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			if (arr[i] > max) {
				max = arr[i];
			}

		}
		System.out.println("The Greatest Value is " + max);
	
	}
	public void buySoap(int Amt) {
		System.out.println("Buy soap for Given Amount");
	}

}
