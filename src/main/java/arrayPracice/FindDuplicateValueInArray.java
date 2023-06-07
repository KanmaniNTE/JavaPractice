package arrayPracice;

public class FindDuplicateValueInArray {
//	int a[] = { 1, 2, 2, 3, 4, 3 };
	int a[] = {1,1,2,3,2,3,3,4};
	

	public static void main(String[] args) {
		
		FindDuplicateValueInArray dup = new FindDuplicateValueInArray();
		PraciceArrayKanmani obj = new PraciceArrayKanmani();
		obj.printIntArrayUsingBasicForLoop(dup.a);
		dup.FindDuplicateValue(dup.a);
	}

	public void FindDuplicateValue(int[] arr) {
		WriteArrayInAsendingOrder arrayInAsending = new WriteArrayInAsendingOrder();
		arrayInAsending.ArrayInAsendingOrder(arr);
		for (int i = 0; i < arr.length; i++) {
			if(i==0 || a[i]!=a[i-1] ) {
			int count = 1;
			for (int j = i + 1; j < arr.length-1; j++) {
				if (arr[i] == arr[j]) {
					count++;
//                   break;
				}

			}
			System.out.println(arr[i] + " is present " +count + " times");
			}
		}
	}
	
	Arrays
}
