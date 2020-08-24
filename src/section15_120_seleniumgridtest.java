import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class section15_120_seleniumgridtest {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

			//DesiredCapabilities dc = DesiredCapabilities.chrome();
			//dc.setBrowserName("chrome");
			DesiredCapabilities dc = DesiredCapabilities.firefox();
			dc.setBrowserName("firefox");
			dc.setPlatform(Platform.WINDOWS);
			// create a webdrive for a remote machine
			
			WebDriver Driver = new RemoteWebDriver(new URL("http://192.168.0.25:5567/wd/hub"),dc);
			Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Driver.get("https://www.rediff.com");

	}

}
