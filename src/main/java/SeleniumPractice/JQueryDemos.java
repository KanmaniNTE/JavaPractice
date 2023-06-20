package SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JQueryDemos {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\drivers\\chromedriver_114.exe");
	WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();
	driver.get("https://jqueryui.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//Click on Demo
	WebElement link_Demo = driver.findElement(By.xpath("//a[@href='https://jqueryui.com/demos/']"));
	link_Demo.click();
	String titleOfDemos = driver.getTitle();
	System.out.println(titleOfDemos);
	if(titleOfDemos.contains("jQuery UI Demos")) {
		System.out.println("jQuery UI API Documentation tab is loaded");
	}
	else {
		System.out.println("jQuery UI API Documentation tab is not loaded");
	}
}
}
