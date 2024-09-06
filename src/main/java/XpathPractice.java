import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractice {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement rightArrow = driver.findElement(By.xpath("(//div[@data-tracking-id=\"Beauty, Food, Toys & more\"]//*[name() ='svg'])[last()]"));
		//driver.findElement()
	}

}
