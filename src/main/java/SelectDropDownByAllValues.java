import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownByAllValues {

	static WebDriver driver;
	public static void main(String[] args) {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		driver.get("https://www.orangehrm.com/contact-sales/");
		By country = By.id("Form_getForm_Country");
		Select sel = new Select(driver.findElement(country));
		List <WebElement> countryList =sel.getOptions();
		System.out.println(countryList.size());
		
		for(WebElement countryName : countryList)
		{
			System.out.println(countryName);
		}
		
		
		
		
	}

}
