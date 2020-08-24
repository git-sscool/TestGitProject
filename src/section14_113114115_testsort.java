import java.awt.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class section14_113114115_testsort {

	private static final boolean String = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\UdemySeleniumCourse\\DriverFiles\\chromedriver_win32_new\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		/*Plan of execution
		 * 1. retrieve all fruit / vegename from the coulmn 
		 * 2. save the values into array list1
		 * 3. create arraylist2 and copy all the items from arraylist1 to arraylist 2
		 * sort the arraylist 2 and compare it with original arraylist 1
		 *  
		 */
		Driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();// descending order
		Driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();// ascending order
		//List firstColList= (java.awt.List) Driver.findElements(By.cssSelector("tr td:nth-child(2)"));
		java.util.List<WebElement> firstColList= Driver.findElements(By.cssSelector("tr td:nth-child(2)"));
		//List<WebElement> firstColList= driver.findElements(By.cssSelector("tr td:nth-child(2)"));
		ArrayList<String> originalist = new ArrayList<String>();
		
		for(int i=0;i<firstColList.size();i++) {
			originalist.add(firstColList.get(i).getText());				
		}
		
		ArrayList<String> copiedlist = new ArrayList<String>();
		for(int i=0;i<originalist.size();i++) {
			copiedlist.add(originalist.get(i));				
		}
		//sort copies list (first click it will be desc
		//Collections.sort(copiedlist);
		Collections.reverse(copiedlist);
		
		for(String firststring:originalist )
		{
		System.out.println(firststring);
		}
		System.out.println("*******************");
		
		for(String secondstring:copiedlist )
		{
		System.out.println(secondstring);
		}
		
		Assert.assertTrue(originalist.equals(copiedlist));
	}

	
}
