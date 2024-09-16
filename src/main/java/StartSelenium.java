import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartSelenium {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@aria-label=\"Mobiles\"]")).click();
		driver.findElement(By.xpath("//div[@title=\"Apple\"]")).click();
		System.out.println("close");
<<<<<<< HEAD
		driver.quit();
=======
		//driver.quit();
>>>>>>> 71ba16887dc14d39f7dc839559ff7400c95c99af
		driver.close();
		
	}

}
