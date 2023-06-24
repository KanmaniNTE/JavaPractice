package testNG_Concepts;

import org.testng.annotations.Test;

public class OrderOfAnnotation {

	@Test(priority=0)
	public void Sum( ) {
		System.out.println("TestSum");
	}
	
	@Test(priority=0)
	public void Annotation( ) {
		System.out.println("Annotation");
	}
	
	@Test(priority=1)
	public void Calculation( ) {
		System.out.println("calculation");
	}
	
	@Test(priority=2)
	public void MiminumCalc( ) {
		System.out.println("TMinimum Clc");
	}
	
	@Test
	public void NoPriority() {
		System.out.println("No Priority set");
	}
	
	
	
}
