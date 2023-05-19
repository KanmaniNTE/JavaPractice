package oopsConcept;

public class StaticOverridePractice extends Parent1 {
	public static void main(String[] args) {
		buyVegitables();
		Parent1.buyVegitables();
// Here I used class name Parent, while run time I got error that saying "Patent" class already exsit.

	}
	public static int buyVegitables() {
		System.out.println("Buy Onion");
		return 0;
	}

}

class Parent1{
	public static int buyVegitables() {
		System.out.println("Buy Tomato");
		return 10;

	}
}