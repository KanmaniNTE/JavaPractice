package basicsOfJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReturnBasics {
	
	int myValue;
	
	public static void main(String[] args) {
		ReturnBasics dummy = new ReturnBasics();
		dummy.method1();
		dummy.method2();
		int value1 = dummy.method2();
		System.out.println(value1);
		
//		int ccc should be 'a' + 10. But int a is local variable
		int ccc = value1 + 10;
		
	}
	
	public void method1() {
		int a = 10;
//		System.out.println(a);
	}
	
	public int method2() {
		int a = 10;
//		System.out.println(a);
		return a;
//		return 10;
	
	}
	
	public int practiceReturnType2() {
		int a = 10;
		myValue = a;
		return myValue;
//		return a;
	}
	
	
	public void practiceReturnType1() {
//		int b = a+10;
		
		int c;
		ReturnBasics dummy = new ReturnBasics();
		c = dummy.method2(); //c = 10;
		
//		int b = a +10; it is nothing but 
		int b = c + 10;
		
		WebDriver driver = new ChromeDriver();
		WebElement userName = driver.findElement(By.id(""));
		
	}
	
	public void practiceReturnType3() {
		ReturnBasics dummy = new ReturnBasics();
		myValue = dummy.method2();
	}

}
