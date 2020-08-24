import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestLocatorFireFox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		LocateFF();
	}
	public static void LocateFF() throws InterruptedException {
		 
		System.setProperty("webdriver.gecko.driver", "D:\\UdemySeleniumCourse\\DriverFiles\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver Driver = new FirefoxDriver();
		Driver.manage().window().maximize();
		Driver.get("http://www.facebook.com");
		
		
		//Webelement idetified by locators Id and xpath
		//Driver.findElement(By.id("email")).sendKeys("testsele2@gmail.com");
		Driver.findElement(By.xpath("//input[@type='email']")).sendKeys("testsele2@gmail.com");
	
		//Webelement identified by locators id , name and xpath
		//Driver.findElement(By.id("pass")).sendKeys("Test@1234");
		Driver.findElement(By.name("pass")).sendKeys("Test1234");///// Xpath ///*[@id="email"]
		//	Driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Test@1234");
	
		//Webelement identified by xpath
		//Driver.findElement(By.xpath("//input[@value='Log In']")).click();; // Xpath //*[@id="pass"]
		
		Driver.findElement(By.linkText("Forgotten account?")).click();
		//Driver.findElement(By.linkText("Forgotten password?")).click();
		//using Xpath for hyperlink - take this from chrome and use it even for firefox
		Driver.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")).click(); 
		
		/*CSS path / selector - right click on inspect and select copy option
		 * in chrome - itis copy selector
		 * in firefox - CSS selector
		 */
		Driver.findElement(By.cssSelector("#email")).sendKeys("emailid");
		Driver.findElement(By.cssSelector("##pass")).sendKeys("1234");	
		
		//Driver.quit(); // closes all the browsers open by selenium script
		
		/*
		 * Another way for above program to invoke
		  
		  WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("testsele2@gmail.com");
		
		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys("Test@1234");
		
		WebElement buttonc = driver.findElement(By.xpath("//input[@value='Log In']"));
		buttonc.click();
		 */
		
	}
}
