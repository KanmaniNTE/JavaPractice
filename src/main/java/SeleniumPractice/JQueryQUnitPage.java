package SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JQueryQUnitPage {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\drivers\\chromedriver_114.exe");
	WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();
	driver.get("https://jqueryui.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//Click on Qunit
			WebElement link_QUnit = driver.findElement(By.xpath("//a[@href='https://qunitjs.com/']"));
			link_QUnit.click();
			String titleOfQUint = driver.getTitle();
			System.out.println(titleOfQUint);
			if(titleOfQUint.equals("QUnit")) {
				System.out.println("QUnit tab is loaded");
			}
			else {
				System.out.println("QUnit tab is not loaded");
			}
			driver.close();
}
}
