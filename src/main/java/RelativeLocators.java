import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocators {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.linkText("Port Alberni, Canada"));
		String values = driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
	    System.out.println(values);
	    
	    String leftValue = driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
	    System.out.println(leftValue);
	    
	    String aboveText = driver.findElement(with(By.tagName("p")).above(ele)).getText();
	    System.out.println(aboveText);
	    
	    String belowText = driver.findElement(with(By.tagName("p")).below(ele)).getText();
	    System.out.println(belowText);
	    
	   String nearText = driver.findElement(with(By.tagName("a")).near(ele)).getText();
	   System.out.println(nearText);
	}

}
