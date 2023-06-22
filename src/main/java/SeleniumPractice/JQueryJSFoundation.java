package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JQueryJSFoundation {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\drivers\\chromedriver_114.exe");
	WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();
	driver.get("https://jqueryui.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//Click on JS Foundation
			WebElement link_JSFoundation = driver.findElement(By.xpath("//a[@href='https://js.foundation/']"));
			link_JSFoundation.click();
			String titleOfJSFoundation = driver.getTitle();
			System.out.println(titleOfJSFoundation);
			if(titleOfJSFoundation.contains("OpenJS Foundation")) {
				System.out.println("OpenJS Foundation tab is loaded");
			}
			else {
				System.out.println("OpenJS Foundation tab is not loaded");
			}
//			driver.close();
}
}
