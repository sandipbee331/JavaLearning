package SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.makemytrip.com/legal/in/eng/privacy_policy.html");
		boolean display = driver.findElement(By.id("IndiaPolicy")).isDisplayed();
		System.out.println(display);
		
		
		
		
		
		
		
		
		
		
	}

}
