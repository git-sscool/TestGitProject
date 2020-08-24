import java.util.Iterator;
import java.util.List;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class section11_88_89_framemanage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\UdemySeleniumCourse\\DriverFiles\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver Driver = new FirefoxDriver();
		Driver.manage().window().maximize();
		Driver.get("https://jqueryui.com");
		//Thread.sleep(2000);
		Driver.findElement(By.xpath("//a[contains(text(),'Droppable')]")).click();
		
		
		//Driver.switchTo().frame(Driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		System.out.println(Driver.findElements(By.tagName("iframe")).size());
		Driver.switchTo().frame(0);
		
		
		Thread.sleep(2000);	
		Driver.findElement(By.id("draggable")).click();
		System.out.println(Driver.findElement(By.id("draggable")).getText());
		
		Actions A = new Actions(Driver);
		
		WebElement sourcee = Driver.findElement(By.id("draggable"));
		WebElement targett = Driver.findElement(By.id("droppable"));
			
		A.dragAndDrop(sourcee, targett).build().perform(); // if build and perform is not written no action will be executed.
		Driver.switchTo().defaultContent(); // this used and imp as need to switch the focus from frame to any object outside as it will not be done by default.
		
		//List<WebElement> framee = Driver.findElements(By.tagName("iframe"));// how to write syntax for set
		//A.dragAndDrop(sourcee, (WebElement) framee).build().perform(); // casting of array/set for webelement
				
	}
	
}
