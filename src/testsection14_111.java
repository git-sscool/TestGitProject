import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class testsection14_111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DesiredCapabilities dc = DesiredCapabilities.chrome();
		dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		// normal chrome browser
		
		ChromeOptions cp = new ChromeOptions();
		cp.merge(dc);
		System.setProperty("webdriver.chrome.driver","D:\\UdemySeleniumCourse\\DriverFiles\\chromedriver_win32_new\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver(cp);
		Driver.manage().window().maximize();
		Driver.manage().deleteAllCookies();
		Driver.manage().deleteCookieNamed("");// specific cookie to delete
	}

}
