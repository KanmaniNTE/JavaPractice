package SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicSeleniumCode {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\drivers\\chromedriver_114.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Get Current URL
		System.out.println("Current URL :" + driver.getCurrentUrl());

		// Get Title of jQuery UI
		String titleOfThePage = driver.getTitle();
		System.out.println(titleOfThePage);
		if (titleOfThePage.equals("jQuery UI")) {
			System.out.println("jQuery UI tab is Loaded");
		}else {
			System.out.println("jQuery UI tab is not Loaded");
		}

		// Get Title of jQuery
//		driver.findElement(By.xpath("//a[@title='jQuery'][1]")).click();
		WebElement link_jQuery = driver.findElement(By.xpath("//a[@title='jQuery'][1]"));
		link_jQuery.click();
		String titleOfjQuery = driver.getTitle();
		System.out.println(titleOfjQuery);
		if (titleOfjQuery.equals("jQuery")) {
			System.out.println("jQuery tab is loaded");
		}else {
			System.out.println("jQuery tab is not loaded");
		}
		
		//Click on jQuery Mobile
		WebElement link_jQueryMobile = driver.findElement(By.xpath("//a[@href='https://jquerymobile.com/']"));
		link_jQueryMobile.click();
		String titleOfjQueryMobile = driver.getTitle();
		System.out.println(titleOfjQueryMobile);
		if(titleOfjQueryMobile.equals("jQuery Mobile")) {
			System.out.println("jQuery Mobile tab is loaded");
		}else {
			System.out.println("jQuery Mobile tab is not loaded");
		}
		
      //Click on Plugins
		WebElement link_Plugins = driver.findElement(By.xpath("//a[@href='https://plugins.jquery.com/']"));
		link_Plugins.click();
		String titleOfPlugins = driver.getTitle();
		System.out.println(titleOfPlugins);
		if(titleOfPlugins.equals("jQuery Plugin Registry")) {
			System.out.println("Plugin Registry is loaded");
		}else {
			System.out.println("Plugin Registry is not loaded");
		}
		
		//Click on Contribute
		WebElement link_Contribute = driver.findElement(By.xpath("//a[@href='https://contribute.jquery.org/']"));
		link_Contribute.click();
		String titleOfContribute = driver.getTitle();
		System.out.println(titleOfContribute);
		if(titleOfContribute.equals("Contribute to jQuery")) {
			System.out.println("Contribute tab is loaded");
		}else {
			System.out.println("Contribute tab is not loaded");
		}
		
		//Click on Events
		WebElement link_Events = driver.findElement(By.xpath("//a[contains(text(),'Events')]"));
		link_Events.click();
		String titleOfEvents = driver.getTitle();
		System.out.println(titleOfEvents);
		if(titleOfEvents.equals("OpenJS Foundation")) {
			System.out.println("Events tab is loaded");
		}else {
			System.out.println("Events tab is not loaded");
		}
	}

}
