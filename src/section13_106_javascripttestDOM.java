import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class section13_106_javascripttestDOM {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*Using HTML DOM (document object model) using java script extract all hidden element from webpage 
		 * because selenium cant find hidden element or any AJAX implementation. Investigate properties of an object if it has 
		 * any hidden text. It is achievable using javascript executor* 
		 */
		
		System.setProperty("webdriver.chrome.driver","D:\\UdemySeleniumCourse\\DriverFiles\\chromedriver_win32_new\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.ksrtc.in/");
		Driver.findElement(By.id("fromPlaceName")).click();
		Driver.findElement(By.id("fromPlaceName")).sendKeys("BAN");
		
		Driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
		Driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
		Driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
		Driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ENTER);
		System.out.println(Driver.findElement(By.id("fromPlaceName")).getText());//This will not written any value as this is an hidden element
		
		// to view the value use Js	 DOM
		
		JavascriptExecutor js = (JavascriptExecutor)Driver;
		
		String script = "return document.getElementById(\"fromPlaceName\").value;";
		String text = (String) js.executeScript(script);
		System.out.println(text);
		int i = 0;
		//to verify if airport option is displayed in suggestion box
		while(!text.equalsIgnoreCase("BANGALORE INTERNATION AIRPORT"))
		{
			i++;
			Driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
			text = (String) js.executeScript(script);
			
			System.out.println(text);
			if(i>10) {
				break;				
			}
			
		}
		if(i>10) {
			System.out.println("Element is not found");
		}
		else {
			
			System.out.println("Element is found");
		}
	}

}
