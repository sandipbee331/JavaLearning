import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SVGElements {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://petdiseasealerts.org/forecast-map/#/");
		Thread.sleep(4000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id, \"map-instance\")]")));
		Thread.sleep(4000);
		//String path = "//*[local-name() = 'svg']//*[name() ='g' and @id ='features']//*[name() ='path']";
		String path = "//*[local-name() = 'svg' and @id = \"map-svg\"]//*[name()='g' and @id = 'regions']//*[name() ='path']";
		List<WebElement> StateList = driver.findElements(By.xpath(path));
        System.out.println("Hello");
		System.out.println(StateList.size());	
		Actions act = new Actions(driver);
		for(WebElement e : StateList )
		{
		   String stateName = e.getAttribute("name");	
		   if(stateName.equalsIgnoreCase("florida"))
		   {
			   
			  int h=  e.getSize().getHeight();
			 int b =  e.getSize().getWidth();
			 System.out.println(h +"    :"+b);
			 Thread.sleep(2000);
			 act.scrollToElement(e);
			 act.moveToElement(e, (b/2)-40, 0).click().build().perform();
			   //act.click();
			 System.out.println("florida is here");
			 break;
		   }
		  // System.out.println(stateName);
		}
	
	
	
	
	
	}

}
