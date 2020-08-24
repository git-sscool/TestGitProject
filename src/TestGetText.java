import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestGetText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "D:\\UdemySeleniumCourse\\DriverFiles\\chromedriver_win32_new\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("http://www.salesforce.com");
		
		Driver.findElement(By.xpath("//*[@id='globalnavbar-header-container']/div[2]/div/div[6]/div/div/a")).click();
		
		Driver.findElement(By.id("username")).sendKeys("hello");
		
		Driver.findElement(By.name("pw")).sendKeys("1234");
		
		Driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
				
		// by xpath
		//System.out.println(Driver.findElement(By.xpath("//*[@id='error']")).getText()); 
		
		//by css selector
		System.out.println(Driver.findElement(By.cssSelector("div#error.loginError")).getText()); 
	}
}
