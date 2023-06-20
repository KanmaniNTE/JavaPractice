package seleniumBasics;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AlertHandling {
	
	static WebDriver driver;
	Alert alert = driver.switchTo().alert();

	public static void main(String[] args) {
		System.out.println(System.getProperty("user.dir"));
		System.setProperty("webdriver.chrome.driver",
				".\\src\\test\\resources\\drivers\\chromedriver_114.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("cusid")).sendKeys("53920");
		driver.switchTo().alert();//NoSuchAlertPresentException
		driver.findElement(By.name("submit")).click();
//		driver.switchTo().alert();
//		driver.switchTo().alert().accept();;
//		driver.findElement(By.name("res")).click();
		
		try {
			driver.findElement(By.name("cusid")).clear();//UnHandledAlertException
//			driver.switchTo().alert().accept();
		}
		catch(UnhandledAlertException e) {
			System.out.println(e.getMessage());
		}
		catch(NoAlertPresentException e) {
			System.out.println(e.getMessage());
		}
		
//		we cant use finally in this situation
//		finally {
//			driver.switchTo().alert().accept();
//		}
		
//		TargetLocator TL = driver.switchTo();
//		Alert AL = TL.alert();
//		AL.accept();
//		AL.dismiss();
//		AL.getText();
//		AL.sendKeys(null);
//		driver.switchTo().alert().dismiss();
	}
	
	
	
//	We can write alert method like below. 
//	But proper method would be 3rd or combination of 3rd and 4th.
	
	public void acceptAlert() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	public void dismissAlert() {
		driver.switchTo().alert().dismiss();
	}
	
	public void getTextFromAlert() {
		try {
			driver.switchTo().alert().getText();
		}
		catch(UnhandledAlertException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void sendTextToAlert(String text) {
		alert.sendKeys(text);
	}
	
	public void sendTextToAlert1(String text) {
		try {
		alert.sendKeys(text);
		}
		catch(UnhandledAlertException e) {
			System.out.println(e.getMessage());
		}
	}

}
