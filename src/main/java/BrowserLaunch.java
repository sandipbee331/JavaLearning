import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunch {
	
	public static WebDriver driver;
	
	public WebDriver initDriver(String browserName)
	{
		System.out.println("browser name is " + browserName);
		switch(browserName.toLowerCase().trim())
		{
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("Please enter correct browser name... "+browserName);
		}
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		return driver;
	}
	
	public void launchURL(String url)
	{
		if (url==null)
		{
			System.out.println("URL can't be null");
		}
		if (url.indexOf("https")==0)
		{
			driver.get(url);
		}
	}
	public String getPageTitle()
	{
		String pageTitle =driver.getTitle();
		System.out.println("Page title is  " +pageTitle);
		return pageTitle;
	}
	
	public void browserTeardown()
	{
		driver.close();
	}
	
	
	
	
	
	

}
