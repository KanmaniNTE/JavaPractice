package SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JQueryThemes {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\drivers\\chromedriver_114.exe");
	WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();
	driver.get("https://jqueryui.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//Click on Themes
	WebElement link_Themes = driver.findElement(By.xpath("//a[@href='https://jqueryui.com/themeroller/']"));
	link_Themes.click();
	String titleOfThemes = driver.getTitle();
	System.out.println(titleOfThemes);
	if(titleOfThemes.contains("ThemeRoller")) {
		System.out.println("ThemeRoller tab is loaded");
	}
	else {
		System.out.println("ThemeRoller tab is not loaded");
	}
}
}
