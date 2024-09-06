import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fileupload {

	public static void main(String[] args) {
	
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait( Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		//in html: it should have tag file
		driver.findElement(By.xpath("//input[@type =\"file\"]")).sendKeys("C:\\Users\\Svishwakarma\\Downloads\\sample.jpg");
	//	driver.findElement(By.)
		
		
		
		
	}

}
