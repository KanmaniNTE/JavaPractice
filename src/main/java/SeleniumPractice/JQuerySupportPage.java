package SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JQuerySupportPage {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\drivers\\chromedriver_114.exe");
	WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();
	driver.get("https://jqueryui.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//Click on Support
			WebElement link_Support = driver.findElement(By.xpath("//a[@href='https://jquery.org/support/'][1]"));
			link_Support.click();
			String titleOfSupport = driver.getTitle();
			System.out.println(titleOfSupport);
			if(titleOfSupport.contains("jQuery Support")) {
				System.out.println("Sizzle tab is loaded");
			}
			else {
				System.out.println("Sizzle tab is not loaded");
			}
//			driver.close();
}
}
