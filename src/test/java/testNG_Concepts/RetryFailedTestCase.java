package testNG_Concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RetryFailedTestCase {
	//retryAnalyzer used to rerun the falied test cases
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void failTestCase() {
		System.out.println(Thread.currentThread());
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.bing.co/");
		System.out.println(1/0);
		
	}
}
