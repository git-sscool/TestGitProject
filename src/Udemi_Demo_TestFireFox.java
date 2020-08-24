import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Udemi_Demo_TestFireFox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			hello();
	}
	public static void hello() {
			 
		System.setProperty("webdriver.gecko.driver", "D:\\UdemySeleniumCourse\\DriverFiles\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver Driver = new FirefoxDriver();
		Driver.get("http://www.google.com");
		System.out.println(Driver.getTitle());
	}
}
