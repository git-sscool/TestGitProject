import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Udemi_Demo_TestIE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			hello();
	}
	public static void hello() {
			 
		System.setProperty("webdriver.ie.driver","D:\\UdemySeleniumCourse\\DriverFiles\\IEDriverServer_Win32_3.150.1\\IEDriverServer.exe");
		WebDriver Driver = new InternetExplorerDriver();
		Driver.get("http://www.facebook.com");
		System.out.println(Driver.getTitle());
	}
}
