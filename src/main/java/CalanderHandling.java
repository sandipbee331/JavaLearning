import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CalanderHandling {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		
		FirefoxOptions options = new FirefoxOptions();
		 driver = new FirefoxDriver(options);
		driver.get("https://www.makemytrip.com/hotels/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		//driver.findElement(By.id("checkin")).click();
		driver.findElement(By.cssSelector("#checkin")).click();
		String monthYear = driver.findElement(By.xpath("(//div[@class=\"DayPicker-Caption\" and @role = 'heading'])[1]")).getText();
		System.out.println(monthYear);
		
		while(!monthYear.equalsIgnoreCase("May2023"))
		{
			driver.findElement(By.cssSelector("span.DayPicker-NavButton--next")).click();
			monthYear = driver.findElement(By.xpath("(//div[@class=\"DayPicker-Caption\" and @role = 'heading'])[1]")).getText();
			System.out.println(monthYear);
		}
		//selectDay("May 16 2023");
		selectDay();
	}
	
	//public static void selectDay(String date)
	public static void selectDay()
	{
		//driver.findElement(By.xpath("//div[@class=\"DayPicker-Week\"]/div[contains(@aria-label, \"+date+\")]")).click();
		driver.findElement(By.xpath("//div[@class=\"DayPicker-Week\"]/div[contains(@aria-label, \"May 16 2023\")]")).click();

	}

}
