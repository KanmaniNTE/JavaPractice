package practiceCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSort {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		List<Integer> list1 = new ArrayList<>();
		list.add(100);
		list.add(120);
		list.add(90);
		list.add(07);
		list.add(457);
		list1.add(60);
		list1.add(70);
		list1.add(80);
		System.out.println(list);
//		list.sort(null);
		Collections.sort(list);
		System.out.println(list);
		
		

	}

}
