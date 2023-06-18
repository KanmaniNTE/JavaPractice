package practiceCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

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
		ListIterator<Integer> listIte = list.listIterator();
		for (int i = 0; i < list.size(); i++) {
			if (listIte.hasNext()) {
//				System.out.println(listIte.next());
				Integer myValue = listIte.next();
				System.out.println(myValue);
				if (myValue > 10)
					System.out.println("above value is greater than 10");
				else
					System.out.println("above value is not greater than 10");
			}
		}

		System.out.println("****************** Print Integer arrayList using for each **************");
		for (Integer eachValue : list) {
			System.out.println(eachValue);
		}
		System.out.println("After List Iterator " + list);
		// Returns a list iterator over the elements in this list (in proper sequence)

		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(10);
		list2.add(50);
		list2.add(15);
		list2.add(70);
//		Creating object for the class
//		ArrayListListIterator obj = new ArrayListListIterator();
//		obj.printIntegerArrayListUsingListIteratorInReverseOrder(list2);

	}

	public void printIntegerArrayListUsingBasicForLoop(ArrayList<Integer> givenArrayList) {
		for (int i = 0; i < givenArrayList.size(); i++) {
			Integer each = givenArrayList.get(i);
			System.out.println(each);
		}
	}

	public void printIntegerArrayListUsingForEach(ArrayList<Integer> givenArrayList) {
		for (Integer eachValueFromGivenArrayList : givenArrayList) {
			System.out.println(eachValueFromGivenArrayList);
		}
	}

	public void printStringArrayListUsingForEach(ArrayList<String> givenArrayList) {
		for (String eachValueFromGivenArrayList : givenArrayList) {
			System.out.println(eachValueFromGivenArrayList);
		}
	}

	public void printCharacterArrayListUsingForEach(ArrayList<Character> givenArrayList) {
		for (Character eachValueFromGivenArrayList : givenArrayList) {
			System.out.println(eachValueFromGivenArrayList);
		}
	}

	ArrayList<Integer> integerList = new ArrayList<Integer>();
	ArrayList<String> stringList = new ArrayList<String>();
	ArrayList<Character> chracterList = new ArrayList<Character>();
	
	public void printAnyArrayListUsingForEach(String arrayListType, Object givenArrayList) {
//		switch(arrayListType) {
////		What is upcasting and downcasting in java
//		
//		case "Integer":
//			for(Integer eachValueFromGivenArrayList: givenArrayList ) {
//				System.out.println(eachValueFromGivenArrayList);
//			}
//		}
	}

	public void printIntegerArrayListUsingListIterator(ArrayList<Integer> givenArrayList) {
		System.out.println("Printing Integer ArrayList Using List Iterator ");
		ListIterator<Integer> listIte = givenArrayList.listIterator();
		for (int i = 0; i < givenArrayList.size(); i++) {
			if (listIte.hasNext()) {
				System.out.println(listIte.next());
			}
		}
	}

	public void printIntegerArrayListUsingListIteratorInReverseOrder(ArrayList<Integer> givenArrayList) {
//		printIntegerArrayListUsingIterator(givenArrayList);
//		printIntegerArrayListUsingListIterator(givenArrayList);
		System.out.println("Printing Integer ArrayList Using List Iterator In Reverse Order");
		ListIterator<Integer> listIte = givenArrayList.listIterator();
		for (int i = 0; i < givenArrayList.size(); i++) {
			if (listIte.hasNext()) {
				System.out.println(listIte.next());
			}
		}
//		for (int i = givenArrayList.size(); i > 0; i--) {
			for (int i = 0; i< givenArrayList.size();  i++) {
			if (listIte.hasPrevious()) {
				System.out.println(listIte.previous());
			}
		}
	}

	public void printIntegerArrayListUsingIterator(ArrayList<Integer> givenArrayList) {
		Iterator<Integer> ite = givenArrayList.iterator();
		for (int i = 0; i < givenArrayList.size(); i++) {
			if (ite.hasNext()) {
				System.out.println(ite.next());
			}
		}
	}

}
