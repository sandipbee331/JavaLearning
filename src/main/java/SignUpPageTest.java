import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPageTest {
	
	
	public static void main(String [] args)
	{
		String browserName = "chrome";
		 BrowserLaunch brLaunch = new BrowserLaunch();
		WebDriver driver =  brLaunch.initDriver(browserName);
		brLaunch.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		brLaunch.getPageTitle(); 
		
		//By locator
		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By email = By.id("input-email");
		By phone = By.id("input-telephone");
		By password = By.id("input-password");
		By confPass = By.id("input-confirm");
		
		ElementUtils elmentUtil = new ElementUtils(driver);
		elmentUtil.doSendKey(firstName, "Qwerty");
		elmentUtil.doSendKey(lastName, "uioo");
		elmentUtil.doSendKey(email, "qwerty@gmail.com");
		elmentUtil.doSendKey(phone, "956956");
		elmentUtil.doSendKey(password, "956956");
		elmentUtil.doSendKey(confPass, "956956");
		
		
		
		
		
		
		
		
		//brLaunch.browserTeardown();
	}
	
	

}
