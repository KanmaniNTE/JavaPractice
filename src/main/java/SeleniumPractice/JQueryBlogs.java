package SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JQueryBlogs {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\drivers\\chromedriver_114.exe");
	WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();
	driver.get("https://jqueryui.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//Click on Blog
	WebElement link_Blog = driver.findElement(By.xpath("//a[@href='https://blog.jqueryui.com/']"));
	link_Blog.click();
	String titleOfBlog = driver.getTitle();
	System.out.println(titleOfBlog);
	if(titleOfBlog.contains("Blog")) {
		System.out.println("Blog tab is loaded");
	}
	else {
		System.out.println("Blog tab is not loaded");
	}
}
}
