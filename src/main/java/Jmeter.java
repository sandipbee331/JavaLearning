import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Jmeter {
	
	
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://uat.tpexpress.co.uk/tpevwr/index.html");
	//	driver.switchTo().frame(driver.findElement(By.))
		FluentWait wait = new FluentWait(driver)
		        .withTimeout(Duration.ofSeconds(50)) // Maximum time to wait
		        .pollingEvery(Duration.ofSeconds(2)) // Polling interval
		        .ignoring(org.openqa.selenium.NoSuchFrameException.class);
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.titleContains("Sale"));
		// wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.className("truste_popframe"))));
		String title = driver.getTitle();
		System.out.println(title);
		//if(title.)
	}
	
	

}
