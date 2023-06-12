package practiceCollection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListClear {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println(list);
		
		list.clear();
		System.out.println(list);
		
		

	}

}
