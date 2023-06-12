package practiceCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListPractice2 {

	public static void main(String[] args) {
		ArrayList<Integer> a= new ArrayList<Integer>(10);
		System.out.println(a.size());
		a.add(10);
		a.add(20);
		a.add(30);
		System.out.println(a);
		System.out.println(a.size());
		
		for(int i = 0; i<a.size();i++) {
			System.out.println(a. get(i));
		}
		
		Iterator<Integer> ite = a.iterator();
		while(ite.hasNext()) 
		{
			System.out.println(ite.next());
		}

}
}
