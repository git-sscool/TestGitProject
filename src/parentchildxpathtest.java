import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class parentchildxpathtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\UdemySeleniumCourse\\DriverFiles\\chromedriver_win32_new\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("http://www.google.com");
		
		// identified by chro path
		//	Driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("this is test");
		//Driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[1]/div[3]/center/input[1]")).click();
		//Driver.findElement(By.xpath("//*[@id='gbw']/div/div/div[1]/div[2]/a")).click();
		
		
		//sub parent one level down - Valid
		//Driver.findElement(By.xpath("//div[@class='SDkEP']/div/input")).sendKeys("this is test");
		
		//grand parent to subparent to one level down - Valid
		Driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[2]/input")).sendKeys("this is test");
		
	}

}
