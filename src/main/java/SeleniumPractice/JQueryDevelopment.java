package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JQueryDevelopment {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\drivers\\chromedriver_114.exe");
	WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();
	driver.get("https://jqueryui.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//Click on Development
	WebElement link_Development = driver.findElement(By.xpath("//a[@href='https://jqueryui.com/development/']"));
	link_Development.click();
	String titleOfDevelopment = driver.getTitle();
	System.out.println(titleOfDevelopment);
	if(titleOfDevelopment.contains("Developmet")) {
		System.out.println("Development tab is loaded");
	}
	else {
		System.out.println("Development tab is not loaded");
	}
}
}
