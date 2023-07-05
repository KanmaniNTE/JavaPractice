package interviewQiestions;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WindowHandling4 {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\drivers\\chromedriver_114.exe");
		driver = new ChromeDriver();
		WindowHandling4 winhan = new WindowHandling4();
		System.out.println(((RemoteWebDriver) driver).getSessionId());

		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//a[@href = 'https://www.facebook.com/OrangeHRM/']")).click();
		Thread.sleep(5000);

//		driver.switchTo().window("www.facebook.com");
//		driver.findElement(By.xpath("//div[@style='transform: none;']")).click();

//		System.out.println(driver.getTitle());

//		String orangeHRMHomePage = driver.getWindowHandle();
//		System.out.println(orangeHRMHomePage);
//		
//		Set<String> allWindowHandles = driver.getWindowHandles();
//		System.out.println(allWindowHandles);
//		
//		for(String eachWindowHandle: allWindowHandles) {
//			driver.switchTo().window(eachWindowHandle);
//			System.out.println(driver.getTitle());
//			Thread.sleep(5000);
//	}

		String parentWindowHandle = driver.getWindowHandle();
		System.out.println("Parent Window Handle: " + parentWindowHandle);

		Set<String> ChildWindows = driver.getWindowHandles();
		System.out.println("Set of Window ID :" + ChildWindows);

//		for (String winhanID : ChildWindows) {
////			System.out.println(winhanID);
//			String title = driver.switchTo().window(winhanID).getTitle();
//			System.out.println(title);
//		}
		winhan.closeAllChildWindows(parentWindowHandle);
	}

	public void closeAllChildWindows(String parentWinHandle) throws Exception {
		Set<String> allWindowHandles = driver.getWindowHandles();
		for (String eachWindowHandle : allWindowHandles) {
			if (!eachWindowHandle.equals(parentWinHandle)) {
				driver.switchTo().window(eachWindowHandle);
//				driver.findElement(By.xpath("//div[@style='transform: none;']")).click();
				String secondWindow = driver.getTitle();
				System.out.println(secondWindow);
//				if (driver.getTitle().contains("World's Most Popular Opensource HRIS")){
//					driver.findElement(By.xpath("//div[@style='transform: none;']")).click();	
//				}

			}
			
		}
		Thread.sleep(5000);
		////span[contains(text(),'Create new account')]
//		driver.findElement(By.xpath("//div[@style='transform: none;']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Create new account')]")).click();
		Thread.sleep(5000);
		String SecondWindowHandle = driver.getWindowHandle();
		System.out.println(SecondWindowHandle);
		driver.switchTo().window(SecondWindowHandle);
		Set<String> ChildWindows1 = driver.getWindowHandles();
		System.out.println("Second Set Values:" +ChildWindows1);
		driver.switchTo().window(SecondWindowHandle);
		String SecondChild = driver.getTitle();
		System.out.println(SecondChild);
		
//		driver.switchTo().window(ChildWindows1);
//		System.out.println(driver.getTitle());
		
	}
	
}
