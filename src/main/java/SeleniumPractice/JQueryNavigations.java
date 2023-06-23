package seleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JQueryNavigations {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\drivers\\chromedriver_114.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		JQueryNavigations obj = new JQueryNavigations();
		obj.navigateThroughEachMenu();
		
	}

		public void clickEachNavigation() {
		// Click on Demo
		WebElement link_Demo = driver.findElement(By.xpath("//a[@href='https://jqueryui.com/demos/']"));
		link_Demo.click();
		String titleOfDemos = driver.getTitle();
		System.out.println(titleOfDemos);
		if (titleOfDemos.contains("jQuery UI Demos")) {
			System.out.println("jQuery UI API Documentation tab is loaded");
		} else {
			System.out.println("jQuery UI API Documentation tab is not loaded");
		}
		
		// Click on JQuery Navigation
		WebElement link_Download = driver.findElement(By.xpath("//a[contains(text(), 'Download')]"));
		link_Download.click();
		String titleOfDownload = driver.getTitle();
		System.out.println(titleOfDownload);
		if (titleOfDownload.contains("Download")) {
			System.out.println("Download tab is loaded");
		} else {
			System.out.println("Download tab is not loaded");
		}
		
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
		
		///Click on Development
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
	
	public void navigateThroughEachMenu() throws InterruptedException {
		Thread.sleep(5000);
//		driver.findElement(By.xpath("//ul[@id='menu-top']//a")).click();
		List<WebElement> mainMenu = driver.findElements(By.xpath("//ul[@id='menu-top']/li/a"));
		System.out.println(mainMenu.size()+"********size************");
		for(WebElement eachMenu: mainMenu) {
			System.out.println(eachMenu.getAttribute("href"));
			System.out.println(eachMenu.getText());
			eachMenu.click();
			Thread.sleep(5000);
		}
	}
}
