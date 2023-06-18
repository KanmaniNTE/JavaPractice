package practiceCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;

public class ToPrintHashsetInDesendingOrder {

	public static void main(String[] args) {
		HashSet<Integer> arr = new HashSet<Integer>();
		arr.add(50);
		arr.add(10);
		arr.add(30);
		arr.add(70);
		arr.add(100);
		arr.add(80);
		arr.add(20);
		arr.add(90);
		arr.add(40);
		arr.add(60);
		System.out.println("Array from Hashset " + arr);

		ArrayList<Integer> arrArList = new ArrayList<Integer>(arr);
		System.out.println("Array from ArrayList " + arrArList);

		// convert ArryList into Array

//		Object[] obj = arrArList.toArray();
//		System.out.println("After Conversion an Array List into Array ");
//
//		// Printing array of objects
//		for (Object obj1 : obj)
//			System.out.print(obj1 + " ");
//
//		for (int i = 0; i < obj.length; i++) {
//
//			Object temp = 0;
//			for (int j = i + 1; j < obj.length; j++) {
//				
//
//				if () {
//					temp = obj[i];
//					obj[i] = obj[j];
//					obj[j] = temp;
//				}
//
//			}
//			System.out.println(obj[i]);

//		}
		// Convert ArrayList to Array
        Integer[] array = arr.toArray(new Integer[0]);
        // Print the array
        System.out.println("Array Values Are :" );
        for (Integer n : array) {
        	
            System.out.println(n);
            
	}
        
		
	}
	}

}