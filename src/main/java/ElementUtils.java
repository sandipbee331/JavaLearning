import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementUtils {

	private WebDriver driver;
	
	public ElementUtils(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public WebElement doGetElement(By locator)
	{
		return driver.findElement(locator);
	}
	public void doSendKey(By locator, String value)
	{
		doGetElement(locator).sendKeys(value);
	}
	
	public String  doGetText(By locator)
	{
		return doGetElement(locator).getText();
	}
	//=========Select based drop down utils========//
	
	public  void doSelectDropDownByIndex(By locator, int index)
	{
		Select sel = new Select(doGetElement(locator));
		sel.selectByIndex(index);
	}
	
	public  void doSelectDropDownByValue(By locator, String value)
	{
		Select sel = new Select(doGetElement(locator));
		sel.selectByValue(value);
	}
	public  void doSelectDropDownByText(By locator, String visible_text)
	{
		Select sel = new Select(doGetElement(locator));
		sel.selectByVisibleText(visible_text);
	}

	
}
