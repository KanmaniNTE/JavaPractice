package SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JQueryAbout {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\drivers\\chromedriver_114.exe");
	WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();
	driver.get("https://jqueryui.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//Click on About
	WebElement link_About = driver.findElement(By.xpath("//a[@href='https://jqueryui.com/about/']"));
	link_About.click();
	String titleOfAbout = driver.getTitle();
	System.out.println(titleOfAbout);
	if(titleOfAbout.contains("About")) {
		System.out.println("About tab is loaded");
	}
	else {
		System.out.println("About tab is not loaded");
	}
}
}
