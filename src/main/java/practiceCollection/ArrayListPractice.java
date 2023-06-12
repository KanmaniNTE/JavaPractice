package practiceCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListPractice {

	public static void main(String[] args) {
//		ArrayList<String> cars1 = new ArrayList<String>();
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Maruti");
		cars.add("swift");
		cars.add("Audi"); 	
		cars.add(3, "Volvo");
		cars.add(null);
		cars.add("Maruti");
		cars.add("Swift");
		cars.add(null);
//		cars.add(null);
//		cars.add(2, "BMW"); 
		cars.add(3, "I10");
		
		System.out.println(cars);
		System.out.println(cars.get(0));
		System.out.println(cars.size());
		
		System.out.println("****for loop****");
		for(int i=0;i<cars.size();i++) {
			System.out.println(cars.get(i));
		}
		
		System.out.println("****for each****");
		for(String each : cars) {
			System.out.println(each);
		}
		cars.set(3, "BENZ");
		System.out.println(cars);
		
		cars.remove(1);
		System.out.println(cars); 
		
//		cars.clear();
//		System.out.println(cars);
		
//		Collections.sort(cars1); 
//		System.out.println(cars1);
		
		ArrayList<String> cars1 = (ArrayList<String>)cars.clone(); 
		System.out.println(cars1);
		
		System.out.println("******forEach method******");
		cars1.forEach(eachCars1 -> System.out.println(eachCars1)); //lambda expression
		
		System.out.println("******forEachRemaining method******");
		Iterator carsIterator = cars1.iterator();
		carsIterator.forEachRemaining(eachCars -> System.out.println(eachCars));
		
		System.out.println("******Using Iterator********");
		Iterator<String> iterator = cars.iterator();
		while(iterator.hasNext()) {
			String carname = iterator.next(); // this is like get(i)
			System.out.println(carname);
			
			System.out.println("******Using ListIterator********");
//			List<String> coolStringList = Arrays.asList("Java", "Scala", "Groovy");
			List<String> coolStringList = new ArrayList<String>();
			coolStringList.add("Java");
			coolStringList.add("Scala");
			coolStringList.add("Groovy");
			System.out.println(coolStringList);
			
			ListIterator <String> listIterator = coolStringList.listIterator();
			System.out.println("++++" +listIterator.hasNext());
			System.out.println("&&&&&&&&&"+listIterator.next());
			
//			ListIterator <String> listIterator1 = coolStringList.listIterator();
			while(listIterator.hasNext()) {
				System.out.println(listIterator.next());
				
				
//				ListIterator <String> listIterator1 = coolStringList.listIterator();
				while(listIterator.hasNext()) {
					System.out.println(listIterator.next());
				}
			}
			
			
			
			
		}
	}

}
