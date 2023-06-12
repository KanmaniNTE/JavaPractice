package practiceCollection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAddAddAllRemoveRemoveAll {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println(list);
		list.add(5, 60);
		list.add(6, 60);
		System.out.println(list);
		
		System.out.println("The Size of ArrayList is " +list.size());
		List<Integer> list1 = new ArrayList<>();
		list1.add(5);
		list1.add(15);
		list1.add(25);
		list1.add(35);
		
		list.addAll(list1);
		System.out.println(list);
		System.out.println("The Size of ArrayList is " +list.size());
		
		list.remove(8);
		System.out.println(list);
		
		list.removeAll(list1);
		System.out.println(list);
		
		

	}

}
