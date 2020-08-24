import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSection7_48 {

	public static void main(String[] args) throws InterruptedException {
		// CSS selector locators
		
		/*
		 * xpath syntax //tagname[@attribute='value'] or //*[@attribute='value']
		 * 
		 * CSS syntax tagname[attribute='value'] or [class='value']
		 * 
		 * 
		 */
		System.setProperty("webdriver.gecko.driver", "D:\\UdemySeleniumCourse\\DriverFiles\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver Driver = new FirefoxDriver();
		Driver.manage().window().maximize();
		Driver.get("https://login.salesforce.com/");
		
		Driver.findElement(By.cssSelector("input[id='username']")).sendKeys("1234"); //or
		//Driver.findElement(By.cssSelector("#username")).sendKeys("hello");
		
		Driver.findElement(By.cssSelector("input[id='password']")).sendKeys("1234");
		
		Driver.findElement(By.xpath("//input[@id='Login']")).click();
		Driver.findElement(By.cssSelector("#Login")).click();
	}

}
