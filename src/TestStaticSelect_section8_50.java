import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestStaticSelect_section8_50 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "D:\\UdemySeleniumCourse\\DriverFiles\\chromedriver_win32_new\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		//Driver.get("https://www.spicejet.com/");
		
		Driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		Select S = new Select(Driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		
		S.selectByVisibleText("Select");
		S.selectByValue("AED");
		S.selectByIndex(3);
	
		S.deselectByValue("AED");
	}
	
}
