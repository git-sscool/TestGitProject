import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class section8_select_51 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\UdemySeleniumCourse\\DriverFiles\\chromedriver_win32_new\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		
		Driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		Driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isSelected();
		Driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		Driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isSelected();
		
		Thread.sleep(5000L);
		
		Driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		
		System.out.println(Driver.findElement(By.id("divpaxinfo")).getText());
		
		
		//using while loop
		int i=1;
		while(i<5){
		Driver.findElement(By.id("hrefIncAdt")).click();
		i++;
		}
		
		Driver.findElement(By.id("hrefIncChd")).click();
		
		//using for for loop
		
		for (int j=1;j<3;j++) {
			Driver.findElement(By.id("hrefIncChd")).click();
		}
		
		Driver.findElement(By.id("btnclosepaxoption")).click();
		
		System.out.println(Driver.findElement(By.id("divpaxinfo")).getText());
		
		
		
		
	}

	
	
	

}
