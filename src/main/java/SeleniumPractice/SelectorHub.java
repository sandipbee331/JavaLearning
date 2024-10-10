package SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectorHub {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://selectorshub.com/xpath-practice-page/");
		/*
		 * Actions action =new Actions(driver);
		 * action.moveToElement(driver.findElement(By.className("dropdown"))).build().
		 * perform(); driver.findElement(By.linkText("Join Training")).click();
		 */
		
		Wait<WebDriver>fluentWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(2))
				.pollingEvery(Duration.ofNanos(100)).ignoring(NoSuchElementException.class);
		
		
		
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("cars")));
		
		
		//driver.findElement(By.id("cars")).click();
		Select select = new Select(driver.findElement(By.id("cars")));
		//select.selectByIndex(2);
		select.selectByVisibleText("Audi");
		
		
		
		
		
	}

}
