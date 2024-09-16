import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MakeMyTrip {

	public static void main(String[] args) {

		
		/*
		 * WebDriver driver = new ChromeDriver();
		 * driver.get("https://www.makemytrip.com");
		 * driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
		 * wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
		 * "//section[@data-cy=\\\"CommonModal_2\\\"]")));
		 * if(driver.findElement(By.xpath("//section[@data-cy=\"CommonModal_2\"]")).
		 * isDisplayed()) { driver.findElement(By.linkText("Privacy Policy")).click();
		 * 
		 * } else { driver.findElement(By.xpath("//div[@data-cy=\"account\"]")).click();
		 * driver.findElement(By.linkText("Privacy Policy")).click(); }
		 */
		
		
		  String str ="manoj singh"; String[] ch = str.split(" ");
		  System.out.println(ch[0]); String str1 = ch[1]+" "+ch[0];
		  System.out.println(str1); //char strnew = ch[1];
		  //System.out.println(strnew);
		 char [] s = str.toCharArray();
		 
		 System.out.println(s);
		 for(int i=0; i<s.length;i++)
		 {
			 
			 
			 System.out.println(s[i]);
		 }
		 
		 
		 
		 String str11 = "This is a java language";
		 String[] ch11 = str11.split(" ");
		 String[] newch11 = new String[ch11.length-1];
		 int size = ch11.length;
		 for(int i=2; i<size; i++)
		 {
			 ch11[i]= ch11[i=1];
		 }
		 size--;
		 
		 for(int i=0; i<size-1; i++)
		 {
			System.out.print("ch11[i]");
			
		 }
			
		 
		 
	}
	
	

}
