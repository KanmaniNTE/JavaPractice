package testNG_Concepts;

import org.testng.annotations.Test;

public class InvocationCountWithThread {
	
	@Test(invocationCount = 20, threadPoolSize = 6)
	public void invocationCountTest() {
		System.out.println("I am invocation count method");
		System.out.println(Thread.currentThread());
	}

}
