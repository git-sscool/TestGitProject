import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.apache.commons.io.FileUtils;

public class testsection14_112 {

	public static void main(String[] args) throws IOException, InterruptedException {
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
		//Driver.manage().deleteAllCookies();
		//Driver.manage().deleteCookieNamed("");// specific cookie to delete
		Driver.get("https://login.salesforce.com/");
		
		//To take screenshot
		File scr = ((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
		Thread.sleep(3000);
		FileUtils.copyFile(scr,new File("D:\\UdemySeleniumCourse\\section14\\screenshot.png"));
		System.out.println("new develop branch3");
			
	}

}
