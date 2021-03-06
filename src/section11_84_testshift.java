import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class section11_84_testshift {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\UdemySeleniumCourse\\DriverFiles\\chromedriver_win32_new\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("http://www.amazon.com");

		// Create Action Class - to handle mouse and keyboard actions and pass driver
		// object as an argument , driver capability get actions class methods.

		Actions A = new Actions(Driver);

		/*
		 * Imp Note - if webelement is traced using class name = nav-a nav-a-2 .. the
		 * same class name is available multiple times. So if accounts and list element
		 * is traced using class name it will not locate it as same class name is given
		 * to langauge option and by default since selenium searches the object from top
		 * left to right, it will trace langauge option instead of list option...
		 */

		/*
		 * * A.moveToElement(Driver.findElement(By.cssSelector(
		 * "a[id='nav-link-accountList']"))).build().perform(); // Open account list
		 * 
		 * A.moveToElement(Driver.findElement(By.cssSelector("a[id='icp-nav-flyout']")))
		 * .build().perform(); // language
		 * 
		 * By.id to find element nav-link-accountList - options and list icp-nav-flyout
		 * - langauge
		 * 
		 */

		// build and perform use to have composite actions in single step. Perform will
		// used to execute the action
		Driver.findElement(By.cssSelector("span[class='a-button-inner']")).click();
		Thread.sleep(2000);
		Driver.findElement(By.cssSelector("input[data-action-type='SELECT_LOCATION']")).click();

		A.moveToElement(Driver.findElement(By.cssSelector("#icp-nav-flyout"))).build().perform();
		Thread.sleep(2000);

		A.moveToElement(Driver.findElement(By.cssSelector("#nav-link-accountList"))).build().perform();
		Thread.sleep(2000);

		// A.moveToElement(Driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		// To select the text which has been entered
		A.moveToElement(Driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello")
				.doubleClick().build().perform();
		Thread.sleep(2000);

		// to perform right click on link
		A.moveToElement(Driver.findElement(By.cssSelector("#nav-link-accountList"))).contextClick().build().perform();
		
		WebElement go = Driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input"));
		A.moveToElement(go).click().build().perform();
	}

}
