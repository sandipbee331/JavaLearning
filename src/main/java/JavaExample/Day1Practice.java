package JavaExample;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Day1Practice {
	
	static WebDriver driver;

	public static void main(String[] args) {

		// Handle multiple windows
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//a[contains(@href, 'linkedin')]")).click();
		driver.findElement(By.xpath("//a[contains(@href, 'facebook')]")).click();
		driver.findElement(By.xpath("//a[contains(@href, 'youtube')]")).click();
		driver.findElement(By.xpath("//a[contains(@href, 'twitter')]")).click();
		Set <String>wSet = driver.getWindowHandles();
	//	ArrayList<String> wList = new ArrayList<String>(wSet);
		System.out.println(switchtoRightWindow("Facebook", wSet));
		if(switchtoRightWindow("Facebook", wSet))
		{
			System.out.println(driver.getCurrentUrl() +": " +  driver.getTitle());
		}
		
		////a[contains(@href, 'linkedin')]
		
		
		
	}
	public static boolean switchtoRightWindow(String WindowTilte, Set<String>wSet)//ArrayList<String>wList)
	{
		for(String str: wSet)
		{
			String wTitle = driver.switchTo().window(str).getTitle();
			if(wTitle.contains(WindowTilte))
			{
				System.out.println("Found the right window.....");
				return true;
			}
			//System.out.println(wTitle);
		}
		return false;
	}
	

}
