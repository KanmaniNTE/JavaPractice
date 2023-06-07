package arrayPracice;

import java.util.Scanner;

public class PraciceArrayKanmani {
	static int givenArrayLength;

	public static void main(String[] args) {
		int[] ar = new int[3];
		ar[0] = 10;
		ar[1] = 20;
		ar[2] = 30;

//		for (int eachValueOfAr : ar) {
//			System.out.println("***");
//			System.out.println(eachValueOfAr);
//		}

//		System.out.println(ar.length);
//
//		System.out.println(ar.clone());
//
//		int[] clonedArray = ar.clone();
//		System.out.println(clonedArray);
//
//		for (int eachValue : clonedArray) {
//			System.out.println(eachValue);
//		}
//
//		int newArray[] = { 1, 2, 3, 4, 5 };
//		String str[] = { "aaa", "bbb", "ccc", "ddd" };
//
//		int arrayLength = ar.length;
//		System.out.println(arrayLength);
//
//		int arrayLength1 = clonedArray.length;
//		System.out.println(arrayLength1);
//
//		int arrayLength2 = newArray.length;
//		System.out.println(arrayLength2);
//
//		for (int i = 0; i < newArray.length; i++) {
//			if (i == 5) {
//				break;
//			}
//			System.out.println(newArray[i]);
//		}

//		int count = 1;
//		for (int each : newArray) {
//			int count = 1;
//			if (count > 5) {
//				break;
//			}
//			System.out.println(each);
//			count++;
//		}

//		for (int eachValue : newArray) {
//			System.out.println(eachValue);
//		}

		PraciceArrayKanmani da = new PraciceArrayKanmani();
//		da.printIntArrayUsingForEach(newArray);
//		da.printIntArrayUsingForEach(clonedArray);
//
////		da.printIntArrayUsingBasicForLoop(str);
//		da.printStringArrayUsingBasicForLoop(str);
//
//		da.findIntArrayLength(newArray);
//
//		da.printIntArrayUsingBasicForLoop(ar);
//		da.printIntArrayUsingBasicForLoop(newArray);
//		da.printIntArrayUsingBasicForLoop(clonedArray);
//		da.printIntArrayUsingForEach(ar);
//		System.out.println(da.returnArrayLength(newArray));
//
//		givenArrayLength = da.returnArrayLength(newArray);
//		System.out.println(givenArrayLength);
//
//		int arrayLength11 = da.returnArrayLength(newArray);
//		System.out.println(arrayLength11);
		
//		da.getIntArrayFromUser();
//		da.getIntArrayFromUser(arrayLength2);
		da.returnSingleValueFromAnIntArray(givenArrayLength);
		

	}

	public void printIntArrayUsingBasicForLoop(int[] array) {
		System.out.println("Values in the array are");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	public void printStringArrayUsingBasicForLoop(String[] array) {
		System.out.println("Values in the array are");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	public void printIntArrayUsingForEach(int[] arr) {
		for (int eachValue : arr) {
			System.out.println(eachValue);
		}
	}

	public void printAStringArrayUsingForEach(String[] array) {
		for (String eachValue : array) {
			System.out.println(eachValue);
		}
	}

	public void findIntArrayLength(int[] ar) {
		int arrayLength2 = ar.length;
		System.out.println(arrayLength2);
	}

	public void findStringArrayLength(String[] ar) {
		int arrayLength2 = ar.length;
		System.out.println(arrayLength2);
	}

	public int returnArrayLength(int[] arr) {
		int lengthVal = arr.length;
		return lengthVal;
	}

	public int returnArrayLength1(int[] arr) {
		return arr.length;
	}

	public void getIntArrayFromUser() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter int array size: ");

		int arrayS = scan.nextInt();

		System.out.println("Please enter " + arrayS + " numbers");

		int arr[] = new int[6];

		for (int i = 0; i < arrayS; i++) {
			arr[i] = scan.nextInt();
		}
		printIntArrayUsingBasicForLoop(arr);
	}
	public int[] getIntArrayFromUser(int arrayLength) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter " + arrayLength + " numbers");

		int arr[] = new int[arrayLength];

		for (int i = 0; i < arrayLength; i++) {
			arr[i] = scan.nextInt();
		}

		printIntArrayUsingBasicForLoop(arr);

		return arr;
	}
	
	public int returnSingleValueFromAnIntArray(int index) {
		int ar[] = new int[3];
		ar[0] = 10;
		ar[1] = 20;
		ar[2] = 30;

		System.out.println(ar[index]);

		return ar[index];

	}
}
