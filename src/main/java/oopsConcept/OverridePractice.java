package oopsConcept;

public class OverridePractice extends Parent {
	public static void main(String[] args) {
		Parent parent = new Parent();
		parent.buyFruits();
		parent.buySnacks(10);
		parent.buyVegitables();

		OverridePractice child = new OverridePractice();
		child.buyCurd();
		child.buySnacks("Chocolate Cake");
		child.buyVegitables();

		System.out.println("I am Overriding Method");
		Parent test = new OverridePractice();
		test.buyFruits();
		test.buySnacks(25);
		test.buyVegitables();


	}

	public void buyVegitables() {
		System.out.println("Buy Tomato");
	}

	public void buyCurd() {
		System.out.println("Buy Curd");
	}
	public void buySnacks(String cake) {
		System.out.println("Buy Cake  "+cake);
	}
}

class Parent {
	public void buyVegitables() {
		System.out.println("Buy Beetroot");
	}

	public void buyFruits() {
		System.out.println("Buy Apple");
	}

	public void buySnacks(int amount) {
		System.out.println("Buy Scnacks for Rs  "+amount);
	}


}



