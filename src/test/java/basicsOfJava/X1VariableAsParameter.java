package basicsOfJava;

public class X1VariableAsParameter {

	public static void main(String[] args) {
		X1VariableAsParameter obj1 = new X1VariableAsParameter();
//		obj1.buyXXSoap();
//		obj1.buyHamamSoap();
//		obj1.buyLuxSoap();
		
		obj1.buySoap(null);
		obj1.buySoap("Hamam");
		obj1.buySoap("Lux");
		obj1.buySoap("XX");
		
		obj1.buySoap(0);
		obj1.buySoap(10);
		
		obj1.buySoap("Hamam", 10);
		obj1.buySoap(10, "Lux");
		
		obj1.buySoapAndShampoo("Lux", "Chik");
		
		obj1.buySoapAndShampoo(10, 20);
		
		obj1.buySoapAndShampoo(10, "Lux", 10, "Chik");
		obj1.buySoapAndShampoo(10, "Chik", 10, "Lux");
	}
	
	public void buyXXSoap() {
		System.out.println("Buy XX soap");
	}
	
	public void buyHamamSoap() {
		System.out.println("Buy Hamam soap");
	}
	
	public void buyLuxSoap() {
		System.out.println("Buy Lux soap");
	}
	
	public void buySoap(String soapName) {
//		System.out.println("Buy soapName");
//		System.out.println(soapName);
//		System.out.println("Buy soapName soap");
//		System.out.println("Buy" "soapName" "soap");
//		System.out.println("Buy" soapName "soap");
//		System.out.println("Buy"+soapName+"soap");
//		System.out.println("Buy"  +soapName+   "soap");
		System.out.println("Buy " +soapName+ " soap");
	}
	
	public void buySoap(int soapAmount) {
//		System.out.println("Buy " +soapAmount+ " soap");
//		System.out.println("Buy " +soapAmount+ " rupees" + " soap");
		System.out.println("Buy " +soapAmount+ " rupees soap");
	}
	
	public void buySoap(String soapName, int soapAmount) {
		System.out.println("Buy " +soapName+ " soap for "+soapAmount+ " rupees");
	}
	
	
	public void buySoap(int soapAmount, String soapName) {
//		System.out.println("Buy 10 rupees Lux soap"); 
		//replace the variables text with respective variable name
		//variable text - 10 and Lux 
		//respective variable name 
		// 		* 10 - soapAmount
		//		* Lux - soapName
		System.out.println("Buy "+soapAmount+" rupees "+soapName+" soap");
	}
	
	public void buySoapAndShampoo() {
		System.out.println("Buy soap and shampoo");
	}
	
	public void buySoapAndShampoo(String soapName, String shampooName) {
		System.out.println("Buy "+soapName+" soap and "+shampooName+ " shampoo");
	}
	
	public void buySoapAndShampoo(int soapAmount, int shampooAmount) {
		System.out.println("Buy "+soapAmount+" rupees soap and "+shampooAmount+ " rupees shampoo");
	}

	public void buySoapAndShampoo(int soapAmount, String soapName, int shampooAmount, String shampooName) {
		System.out.println("Buy "+soapAmount+" rupees "+soapName+" soap and "+shampooAmount+ " rupees "+shampooName+" shampoo");
	}
}
