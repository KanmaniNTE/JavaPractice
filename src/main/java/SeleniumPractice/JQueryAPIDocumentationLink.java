package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JQueryAPIDocumentationLink {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\drivers\\chromedriver_114.exe");
	WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();
	driver.get("https://jqueryui.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//Click on API Documentation Navigation
	WebElement link_APIDocumentation = driver.findElement(By.xpath("//a[@href='https://api.jqueryui.com/']"));
	link_APIDocumentation.click();
	String titleOfAPIDocumentation = driver.getTitle();
	System.out.println(titleOfAPIDocumentation);
	if(titleOfAPIDocumentation.contains("jQuery UI API Documentation")) {
		System.out.println("jQuery UI API Documentation tab is loaded");
	}
	else {
		System.out.println("jQuery UI API Documentation tab is not loaded");
	}
}
}
