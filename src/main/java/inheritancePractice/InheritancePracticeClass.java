package inheritancePractice;

public class InheritancePracticeClass implements InheritanceInterface {

	@Override
	public void buyVegitables() {
		System.out.println("I am implemented from Interface");
		}
	public static void main(String[] args) {
		InheritancePracticeClass obj = new InheritancePracticeClass();
		obj.buyVegitables();
		obj.buyFruits();
		obj.buyCurd();
		InheritanceInterface.buySnacks();
		
		
	}
public void buyCurd() {
	System.out.println("This is child Class");
}
}
