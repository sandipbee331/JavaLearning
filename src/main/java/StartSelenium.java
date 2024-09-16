import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartSelenium {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@aria-label=\"Mobiles\"]")).click();
		driver.findElement(By.xpath("//div[@title=\"Google\"]")).click();

		System.out.println("close");
		driver.quit();
		//driver.quit();
<<<<<<< HEAD
=======
<<<<<<< HEAD
		//driver.close();
=======
>>>>>>> 71ba16887dc14d39f7dc839559ff7400c95c99af
>>>>>>> c0bade69a34abfc0e62f0bb7c1850d7a2aba6d9c
		driver.close();
>>>>>>> 9ca043101556abe42681ef0b2438013bb8302737
		
	}

}
