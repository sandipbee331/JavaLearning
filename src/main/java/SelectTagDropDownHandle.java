import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class SelectTagDropDownHandle {

	 static WebDriver driver;
	
	public static void main(String[] args) {

	
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		driver.get("https://www.orangehrm.com/contact-sales/");
		By country = By.id("Form_getForm_Country");
		
		WebElement country_ele = driver.findElement(country);
		
		Select sel = new Select(country_ele);
		//sel.selectByIndex(5);
		//sel.selectByValue("Afghanistan");
		//sel.selectByVisibleText("France");
		//doSelectDropDownByIndex(country, 10);
		//doSelectDropDownByValue(country, "Gabon");
		doSelectDropDownByText(country, "French Southern Territories");
		
		
		
	}
	
	public static WebElement doGetElement(By locator)
	{
		return driver.findElement(locator);
		
	}

	public static void doSelectDropDownByIndex(By locator, int index)
	{
		Select sel = new Select(doGetElement(locator));
		sel.selectByIndex(index);
	}
	
	public static void doSelectDropDownByValue(By locator, String value)
	{
		Select sel = new Select(doGetElement(locator));
		sel.selectByValue(value);
	}
	public static void doSelectDropDownByText(By locator, String visible_text)
	{
		Select sel = new Select(doGetElement(locator));
		sel.selectByVisibleText(visible_text);
	}
}
