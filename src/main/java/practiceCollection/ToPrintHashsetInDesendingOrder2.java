package practiceCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;

public class ToPrintHashsetInDesendingOrder2 {

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

		ListIterator<Integer> listIte = arrArList.listIterator();
		for (int i = 0; i < arrArList.size(); i++) {
			if (listIte.hasNext()) {
				System.out.println(listIte.next());
				Integer arrnum = listIte.next();
				Collections.sort();
					
				}
				
			}
			
			
			
		}
	}

}