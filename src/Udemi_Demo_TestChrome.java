import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Udemi_Demo_TestChrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			hello();
	}
	public static void hello() throws InterruptedException {
			 
		System.setProperty("webdriver.chrome.driver", "D:\\UdemySeleniumCourse\\DriverFiles\\chromedriver_win32_new\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("http://www.gmail.com");
		
	//	System.out.println(Driver.getTitle());
		
		//System.out.println(Driver.getCurrentUrl());
		
		//System.out.println(Driver.getPageSource());
		
		Driver.get("http://www.yahoo.com");
				
		Driver.navigate().back();
		
		//Driver.wait(100);
		
		//Driver.navigate().forward();
		
		//Driver.close(); // closes the current browser
		
		Driver.quit(); // closes all the browsers open by selenium script
		System.out.println("change in new developement branch");
	}
}
