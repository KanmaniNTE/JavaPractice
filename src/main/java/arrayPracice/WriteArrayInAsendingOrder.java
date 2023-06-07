package arrayPracice;

public class WriteArrayInAsendingOrder {
//	int a[] = { 10, 30, 50, 40, 20, 5 };
	int a[] = { 2, 56, 64, 45, 23, 15, 23, 17, 16 };
//	int a[] = { 1,1,1,1,1};

	public static void main(String[] args) {
		
//		write code to print array
		
		WriteArrayInAsendingOrder asen = new WriteArrayInAsendingOrder();
		
		PraciceArrayKanmani obj = new PraciceArrayKanmani();
		obj.printIntArrayUsingBasicForLoop(asen.a);
     
		asen.ArrayInAsendingOrder(asen.a);
		
//		Write code to print array after asending
		
		System.out.println("Array values after asending or sort");
		
		obj.printIntArrayUsingBasicForLoop(asen.a);
	}

	public void ArrayInAsendingOrder(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
			int temp = 0;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}
//			System.out.println(arr[i]);
		}

	}
	
	public void sortAnArrayUsingArraysClass() {
		
	}
	
	
}
