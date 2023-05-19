package inheritancePractice;

public class InhertanceVegitables {
	int a =20;
	String str = "Kanmani";
	
	static int b=20;
	String str1 ="Makinthan";
	
	public void buyOnion() {
		System.out.println("I am Parent, Buy Onion");
	}
	public void buyTomato(int totAmt) {
		System.out.println("I am Parent, Total Amount");
	}
	public static void buyCarrot(String Colour) {
		System.out.println("I am parent, Says Carrot Colour");
		
	}
	public static void buyBeans(int a, int b) {
		System.out.println("I am Parent and give a, b");
	}
		
	public static void main(String[] args) {
		InhertanceVegitables parent = new InhertanceVegitables();
			parent.buyOnion();
			parent.buyTomato(10);
			buyCarrot("Maki");
			buyBeans(12, b);
		}
	

}
