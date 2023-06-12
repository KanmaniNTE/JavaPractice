package practiceCollection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListContainsAndContainsAll {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		List<String> list1 = new ArrayList<>();
//		list.add(10);
//		list.add(20);
//		list.add(30);
//		list.add(40);
//		list.add(50);
		list1.add("Sun");
		list1.add("Moon");
		list1.add("Earth");
		list.add("Kanmani");
		list.add("Makinthan");
		list.add("Santhosh");
		list.add("Ravanan");
		list.add("Elumalai");
		System.out.println(list);
		
	 list.contains(list1);
	 System.out.println(list);
	 System.out.println(list1);
	 list1.containsAll(list);
	 System.out.println(list);
	 System.out.println(list1);
		
		

	}

}
