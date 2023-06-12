package practiceCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListListIterator1 {
	static Integer i;
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		List<Integer> list1 = new ArrayList<>();
		list.add(10);
		list.add(25);
		list.add(5);
		list.add(14);
		list.add(50);
		list1.add(60);
		list1.add(70);
		list1.add(80);
		System.out.println(list);
		ListIterator<Integer> listit=list.listIterator(3);
		System.out.println(list);
		i=listit.previous();
		listit.next();
		System.out.println("Next element "+i);
		
		

	}

}
