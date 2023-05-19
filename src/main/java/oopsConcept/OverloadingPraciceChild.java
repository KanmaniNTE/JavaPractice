package oopsConcept;

public class OverloadingPraciceChild extends  OverloadingPracticeParent{
	
	
	public void buyVegitables() {
		System.out.println("I am Child from Vegitables");
	}
	
	public void buyVegitables(int TotAmt, String buyOnion) {
		System.out.println("I am Overloading Method");
	}
	
//	public void buyVegitables(String buyOnion, int TotAmt) {
//		System.out.println("I am Overloading Method");
//}
	public void buyVegitables(int TotAmt, String buyOnion,int RemAmt) {
		System.out.println("I am Overloading Method");
	}
	public void butVegitables(int RemAmt) {
		System.out.println("I am Overloading Method");
	}
	
	public int buyVegitables(int TotAmt) {
		System.out.println("Total Amount is 1000");
		return TotAmt;
		
	}
	
	public String buyVegitables(String buyOnion, int TotAmt) {
		return buyOnion;
		
		
	}
	
	public int buySnacks(){
		System.out.println("I am Child from Snacks");
		return 0;
		
	}
	public String buyVegitables(String VegName) {
		System.out.println("Buy Carrot");
		return VegName;
		
	}
	public static void main(String[] args) {
		OverloadingPraciceChild obj =new OverloadingPraciceChild();
		System.out.println(obj.buyFruits());
		System.out.println(obj.buySnacks());
		System.out.println(obj.buyVegitables("Carrot"));
        System.out.println(obj.buyVegitables(100));
        System.out.println(obj.buyVegitables("onion",100 ));
        obj.buyVegitables(100, "Onion");
        obj.butVegitables(10);
        obj.buyVegitables(10, "Correct", 15);
	}

}
