package seleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ActionsClassPractice {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\drivers\\chromedriver_114.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		ActionsClassPractice obj = new ActionsClassPractice();
		Actions actions = new Actions(driver);
		WebElement IDEEclipse = driver.findElement(By.xpath("//option[text() = 'Eclipse']"));
		WebElement IDEIntell = driver.findElement(By.xpath("//option[text() = 'IntelliJ IDEA']"));
		WebElement IDEVisual = driver.findElement(By.xpath("//option[text() = 'Visual Studio']"));
		WebElement IDENetBeans = driver.findElement(By.xpath("//option[text() = 'NetBeans']"));
		
//	actions.moveToElement(EclipseDrop).moveToElement(EclipseIntell).moveToElement(EclipseVisual).moveToElement(EclipseNetBeans).build().perform();
//		actions.moveToElement(EclipseDrop).moveToElement(EclipseIntell).moveToElement(EclipseVisual).moveToElement(EclipseNetBeans).clickAndHold().build().perform();
//		actions.moveToElement(IDEEclipse).clickAndHold()
//		.moveToElement(IDEIntell).clickAndHold()
//		.moveToElement(IDEVisual).clickAndHold()
//		.moveToElement(IDENetBeans).clickAndHold().build().perform();
		
		WebElement multipleDropDown = driver.findElement(By.xpath("//select[@id = 'ide']"));
		List<WebElement> allOptions = driver.findElements(By.xpath("//select[@id = 'ide']//option"));
		
		actions.keyDown(Keys.CONTROL).build().perform();
		for(WebElement eachOption: allOptions ) {
			actions.moveToElement(eachOption).click().build().perform();
			Thread.sleep(2000);
		}
		
		actions.keyUp(Keys.CONTROL).build().perform();
		
		Select select = new Select(multipleDropDown);
		System.out.println(select.getAllSelectedOptions());
		
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
		for(WebElement each: allSelectedOptions) {
			System.out.println(each.getText());
		}
		
		select.deselectAll();
		
		}
	
	
		
//		Actions actions = new Actions(driver);
//		WebElement courseDropDown = driver.findElement(By.xpath("//option[text() = 'Eclipse']"));
//		courseDropDown.click();
//		Actions actions = new Actions(driver);
//		actions.clickAndHold(courseDropDown);
//		actions.keyDown(Keys.SHIFT).sendKeys("Visual Studio").build().perform();
//		obj.typeInCaptialUsingActions("IntelliJ IDEA");
//		obj.typeInCaptialUsingActions("Visual Studio");
	
//	public void typeInCaptialUsingActions(String text) {
//		Actions actions = new Actions(driver);
//		actions.keyDown(Keys.SHIFT).sendKeys(text).build().perform();
//	}
}

