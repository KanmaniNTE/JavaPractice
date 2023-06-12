package practiceCollection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListGet {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		List<Integer> list1 = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list1.add(60);
		list1.add(70);
		list1.add(80);
		System.out.println(list);
		
		System.out.println(list.get(4));
		
		

	}

}
