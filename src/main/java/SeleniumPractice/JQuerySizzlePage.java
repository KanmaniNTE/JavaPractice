package SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JQuerySizzlePage {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\drivers\\chromedriver_114.exe");
	WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();
	driver.get("https://jqueryui.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//Click on Sizzle
			WebElement link_Sizzle = driver.findElement(By.xpath("//a[@href='https://sizzlejs.com/']"));
			link_Sizzle.click();
			String titleOfSizzle = driver.getTitle();
			System.out.println(titleOfSizzle);
			if(titleOfSizzle.equals("Home · jquery/sizzle Wiki · GitHub")) {
				System.out.println("Sizzle tab is loaded");
			}
			else {
				System.out.println("Sizzle tab is not loaded");
			}
			driver.close();
}
}
