import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestRediffE2E {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 
		System.setProperty("webdriver.chrome.driver", "D:\\UdemySeleniumCourse\\DriverFiles\\chromedriver_win32_new\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("http://www.rediff.com");
		Thread.sleep(3000);
		Driver.findElement(By.cssSelector("a[title*='Sign in']")).click(); // css regular expression
		Driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("hello");
		Driver.findElement(By.cssSelector("input#password")).sendKeys("123");
		Driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click(); // xpath regular expression
	}

}
