import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class section11_87_multiwindow3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\UdemySeleniumCourse\\DriverFiles\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver Driver = new FirefoxDriver();
		Driver.manage().window().maximize();
		Driver.get("https://login.salesforce.com/");
		Thread.sleep(2000);
		Driver.findElement(By.id("privacy-link")).click();
		////a[@id='privacy-link']
		System.out.println("1. parent window" + Driver.getTitle()); // parent window title
		
		Set<String>ids=Driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String parentid = it.next();
		String childid = it.next();
		
		Driver.switchTo().window(childid);
		System.out.println("2. Child Window" + Driver.getTitle());
		
		Driver.switchTo().window(parentid);
		System.out.println(" 3. Back to parent Window" + Driver.getTitle());
		
		Thread.sleep(8000);
		Driver.switchTo().window(childid).close();
	}

}
