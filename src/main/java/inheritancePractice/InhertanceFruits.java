package inheritancePractice;

public class InhertanceFruits extends InhertanceVegitables {
	int a = 100;
	String str1 = "abc";
	
	static int b = 20;
	static String str2 = "abcd";
	
	public void buyApple() {
	System.out.println("I am Child for Apple");	
	}
	public void buyOrange(int a) {
	System.out.println("I am Child for Orange");	
	}
	public static void buyBerry(String abc) {
	System.out.println("I am Cild for Berry");	
	}
	public static void buyPapaya(int a, int b) {
	System.out.println("I am Child for Papaya");	
	}
	public static void main(String[] args) {
		InhertanceFruits fruit = new InhertanceFruits();
		fruit.buyApple();//Child class non-static method non-Parameterized
		fruit.buyOnion();//Parent class non-static method non-Parameterized
		fruit.buyOrange(10);//Child class non-static method with Parameterized
		fruit.buyTomato(20);//Parent class non-static method with Parameterized
		
		buyBeans(15, 25);//Parent static method Parameterized
		buyBerry(str2);//Child static method Parameterized
		buyCarrot("Carrot");//Parent static method Parameterized
		buyPapaya(30, 40);//Child static method Parameterized
		
		InhertanceVegitables.buyCarrot("Patent Carrot");//using class name called Parent method with parameterized.
		
		InhertanceVegitables Veg = new InhertanceVegitables();
		//created object in Child class for Parent
		Veg.buyOnion();
		Veg.buyTomato(60);

		InhertanceVegitables fruits = new InhertanceFruits();
		//Created object for Child with parent as reference
		fruits.buyOnion();
		fruits.buyTomato(50);
		
	}

}
