 import org.openqa.selenium.htmlunit.HtmlUnitDriver;
 import org.openqa.selenium.WebDriver;
 
public class HTMLBrowser {

	
	//@Test
	public void testing()
	{
	System.setProperty("webdriver.HtmlUnitDriver.driver", "C:\\Users\\Driver\\driver\\htmlunitdriver.exe");
	WebDriver driver = new HtmlUnitDriver();
	driver.get("https://google.com");
	System.out.println(driver.getTitle());
	}
	
	
	
}
