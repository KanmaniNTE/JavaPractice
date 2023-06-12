package practiceCollection;

import java.util.HashSet;

public class PracticeHashSet {
	public static void main(String[] args) {
		HashSetMethod();
	}

	static int a;
	static boolean b;

	public static void HashSetMethod() {
		HashSet<Integer> arr = new HashSet<Integer>();
		HashSet<Integer> arr1 = new HashSet<Integer>();
		HashSet<Integer> arr2 = new HashSet<Integer>();
		System.out.println("Adding elements in Hashset");

		arr.add(5);
		arr.add(15);
		arr.add(25);
		arr.add(35);
		arr.add(45);
		arr.add(55);
		System.out.println(arr);

		a = arr.size();
		System.out.println(a);

		arr1.add(20);
		arr1.add(30);
		arr1.add(40);

		System.out.println("Before adding all to one set");
		System.out.println(arr);
		System.out.println(arr1);
		b = arr.addAll(arr1);
		System.out.println(b);
		System.out.println("After adding all to one set");
		System.out.println(arr);
		System.out.println(arr1);

		System.out.println("After cloning");
		Object o = arr.clone();
		System.out.println(o);

//     b = arr.contains(arr);
		b = arr.containsAll(arr2);
		System.out.println("Arr contains value 2 " + b);
		// equals
		System.out.println(arr.equals(arr2));
		// hashcode
		System.out.println(arr.hashCode());

		// isEmpty
		System.out.println(arr.isEmpty());

		// remove
		arr.remove(5);
		System.out.println(arr);

		// Wait
//     arr.wait(10);
		

	}

}