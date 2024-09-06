import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FrameHandling {
	//public static FirefoxDriver driver;
	public static void main(String[] args) {
		
		// driver 
		FirefoxOptions options = new FirefoxOptions();
		 FirefoxDriver driver = new FirefoxDriver(options);
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		
	}

}
