import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumStart {
	
	static WebDriver driver;

	public static void main(String[] args) {

		System.out.println("hello");
		
		String browser = "edge";
		
		switch(browser) {
		
		case "chrome":
			driver = new ChromeDriver();
			driver.get("https://www.geeksforgeeks.org/");
			driver.quit();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			driver.get("https://www.geeksforgeeks.org/");
			driver.quit();
			break;
		case "edge":
			driver = new EdgeDriver();
			driver.get("https://www.geeksforgeeks.org/");
			break;
		
			
			
			
			
			
		}
			
	}

}
