package inheritancePractice;

public interface InheritanceInterface {
	int a =10;
	
	public void buyVegitables();
	
	default void buyFruits() {
		System.out.println("I am default method from Interface");
	}
	public static void buySnacks() {
		System.out.println("I am static Method from Interface");
	}

}
