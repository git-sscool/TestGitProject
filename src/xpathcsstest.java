import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathcsstest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\UdemySeleniumCourse\\DriverFiles\\chromedriver_win32_new\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("http://www.facebook.com");
		
		//By CSS path locator
		//Driver.findElement(By.cssSelector("input[name='email']")).sendKeys("hello");
		//Driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("1234");
		//Driver.findElement(By.cssSelector("input[value='Log In']")).click();
		Driver.findElement(By.cssSelector("[value='Log In']")).click(); // without tag name
	
		//CSS path - 
		//Driver.findElement(By.cssSelector("#email")).sendKeys("emailid");
		//Driver.findElement(By.cssSelector("#pass")).sendKeys("1234");	
		//Driver.findElement(By.cssSelector("#loginbutton")).click();
		
	}	

}
