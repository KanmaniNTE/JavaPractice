package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JQuerySupportNavigation {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\drivers\\chromedriver_114.exe");
	WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();
	driver.get("https://jqueryui.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//Click on Development
	WebElement link_SupportNavigaion = driver.findElement(By.xpath("//a[@href='https://jqueryui.com/support/']"));
	link_SupportNavigaion.click();
	String titleOfSupportNavigaion = driver.getTitle();
	System.out.println(titleOfSupportNavigaion);
	if(titleOfSupportNavigaion.contains("Support")) {
		System.out.println("Support tab is loaded");
	}
	else {
		System.out.println("Support tab is not loaded");
	}
}
}
