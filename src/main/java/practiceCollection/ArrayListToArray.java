package practiceCollection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListToArray {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		List<Integer> list1 = new ArrayList<>();
		list.add(10);
		list.add(200);
		list.add(30);
		list.add(75);
		list.add(500);
		list1.add(60);
		list1.add(70);
		list1.add(80);
		System.out.println(list);
		list.toArray();
		System.out.println(list);
		
		

	}

}
