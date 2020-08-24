import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testautosuggest_sec13_105 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\UdemySeleniumCourse\\DriverFiles\\chromedriver_win32_new\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.makemytrip.com/");
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//div[contains(@class,'loginModal displayBlock modalLogin dynHeight personal')]")).click();
		Driver.findElement(By.id("fromCity")).click();
		Driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("MUM");
		
		Driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN);
		Driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);
		
		Driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("DEL");
		Driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(Keys.ARROW_DOWN);
		Driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(Keys.ENTER);
		
	}		
}
