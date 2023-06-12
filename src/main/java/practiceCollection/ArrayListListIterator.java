package practiceCollection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListListIterator {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		List<Integer> list1 = new ArrayList<>();
		list.add(10);
		list.add(50);
		list.add(15);
		list.add(70);
		list.add(50);
		list1.add(60);
		list1.add(70);
		list1.add(80);
		System.out.println(list);
		list.listIterator();
		System.out.println("After List Iterator " +list);
		//Returns a list iterator over the elements in this list (in proper sequence)
		
		

	}

}
