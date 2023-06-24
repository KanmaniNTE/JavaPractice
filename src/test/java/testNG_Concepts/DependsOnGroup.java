package testNG_Concepts;

import org.testng.annotations.Test;

public class DependsOnGroup {
	

	@Test(groups= {"group11"})
	public void group11() {
		System.out.println(1/0);
		System.out.println("group11");
	}
	
	@Test(groups= {"group22"})
	public void group22() {
		System.out.println("I am belongs to group22");
	}
	
	@Test(groups = {"group12"})
//	@Test(dependsOnGroups = {"group11", "group22"})
	public void group11and22() {
		System.out.println("I am depend on group11and22");
	}
	
	@Test(dependsOnGroups = "group11")
	public void group11Checking() {
		System.out.println("I am depend on group11");
	}
	
	@Test(dependsOnGroups = "group22")
	public void group22Checking() {
		System.out.println("I am depend on group22");
	}
	
	@Test(dependsOnGroups = "group11", alwaysRun = true)
	public void groupAlwaysRun() {
		System.out.println("Always run");
	}
	
    
}
