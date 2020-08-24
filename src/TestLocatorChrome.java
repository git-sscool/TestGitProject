import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLocatorChrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		LocateChromme();
	}
	public static void LocateChromme() throws InterruptedException {
		 
		System.setProperty("webdriver.chrome.driver", "D:\\UdemySeleniumCourse\\DriverFiles\\chromedriver_win32_new\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("http://www.facebook.com");
		
		
		//Webelement idetified by locators Id and xpath, classname
		//Driver.findElement(By.id("email")).sendKeys("testsele2@gmail.com");
		Driver.findElement(By.xpath("//input[@type='email']")).sendKeys("testsele2@gmail.com");  // Xpath //*[@id="email"]
		//Driver.findElement(By.className("inputtext")).sendKeys("testsele2@gmail.com");
	
		//Webelement identified by locators id , name and xpath
		//Driver.findElement(By.id("pass")).sendKeys("Test@1234");
		Driver.findElement(By.name("pass")).sendKeys("Test1234");
		//	Driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Test@1234"); XPATH//*[@id="pass"]
	
		//Webelement identified by xpath
		Driver.findElement(By.xpath("//input[@value='Log In']")).click();; // Xpath 
		
		//Driver.findElement(By.linkText("Forgotten account?")).click();
		Driver.findElement(By.linkText("Forgotten password?")).click();
		//using Xpath for hyperlink - take this from chrome and use it even for firefox
		Driver.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")).click();
		
		/*CSS path / selector - right click on inspect and select copy option
		 * in chrome - itis copy selector
		 * in firefox - CSS selector
		 * 
		 * There is no direct way in chrome to get CSS path. You can find it in the toolbar at the bottom of the browser 
		 */
		Driver.findElement(By.cssSelector("#email")).sendKeys("emailid");
		Driver.findElement(By.cssSelector("##pass")).sendKeys("1234");	
		
		//Driver.quit(); // closes all the browsers open by selenium script
		
		/* IMP Selenium Intw question
		 * While locating a web element in web locator .. if it has a class name with multiple spaces e.g "this is a class name",
		 * it will give an error while running the selenium code as it does not support compound class name i.e name with spaces.
		 * 
		 * If multiple elements have the same class name ... selenium scans the elements from top left and it will input the value
		 * in the first element which is located from left regardless of the valid one.
		 * 
		 * 
		 */
		
		/*
		 * Another way for above program to invoke
		  
		  WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("testsele2@gmail.com");
		
		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys("Test@1234");
		
		WebElement buttonc = driver.findElement(By.xpath("//input[@value='Log In']"));
		buttonc.click();
		 */
		
	}
}
