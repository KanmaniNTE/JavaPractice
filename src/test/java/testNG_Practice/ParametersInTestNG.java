package testNG_Practice;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersInTestNG {
	
	WebDriver driver;
//	public static String browser;
	
	@Parameters({"browser", "implicitWait"})
	@Test
	public void launchBrowser(String browser, int implicitWait) throws Exception {
		System.out.println("***********" +implicitWait);
//		Properties prop = new Properties();
//		FileInputStream fis = new FileInputStream("");
//		prop.load(fis);
//		browser = prop.getProperty("BrowserName");
		switch(browser){
			case "Chrome":
				System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\drivers\\chromedriver_114.exe");
				driver = new ChromeDriver();
				break;
			case "firefox":
				System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
				break;
		}
	
		driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitWait));
	}

}
