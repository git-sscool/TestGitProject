import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class section13_100_tablegrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		System.setProperty("webdriver.chrome.driver","D:\\UdemySeleniumCourse\\DriverFiles\\chromedriver_win32_new\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.cricbuzz.com/live-cricket-scorecard/29053/1st-test-west-indies-tour-of-england-2020");
		
		//find element for entire table first
		//this is common name for all boxes so selenium will take first by default i.e. first box
		//WebElement table = Driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']")); - *********
		
		WebElement table = Driver.findElement(By.cssSelector("#innings_1 > div:nth-child(1)")); //css selector this for another box
		WebElement extra = Driver.findElement(By.cssSelector("#innings_1 > div:nth-child(1) > div:nth-child(14)"));
				
				/*2nd box
				#innings_1 > div:nth-child(1)
				/html[1]/body[1]/div[1]/div[2]/div[4]/div[2]/div[3]/div[1]*/
				
				/*1st box 
				 * Driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']")) -check for comment***** above
				#innings_2 > div:nth-child(1) - css selector
				/html[1]/body[1]/div[1]/div[2]/div[4]/div[2] - Absolute xpath*/
		
		
		System.out.println(Driver.findElement(By.cssSelector("#innings_1 > div:nth-child(1) > div.cb-col.cb-col-100.cb-scrd-hdr-rw > span:nth-child(1)")).getText());
		
		int rowcount = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
		System.out.println("rowcount-2" + rowcount);
		System.out.println("****************************************************************************");
		int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
							
		for (int i= 0; i<count-2;i++) {
			
		    System.out.println(table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText());
			String value = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
		    
			int valueinteger = Integer.parseInt(value);
			sum = sum+ valueinteger;
		}
		
		System.out.println("sum of all score" + sum);
		/* This will give 1st box extra 2nd column as it has common header for extras web element so by default it will select the 1st from top
			Driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div"));
			*/
			
			System.out.println("Extras" + Driver.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]/div[14]/div[2]")).getText());
			String extravalue = Driver.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]/div[14]/div[2]")).getText();
			int valueextra = Integer.parseInt(extravalue);
			
			int finaltotal = sum  + valueextra;
			System.out.println("Final Total" + finaltotal);
			
			String actualtotal =  Driver.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]/div[15]/div[2]")).getText();
			int totalactual = Integer.parseInt(actualtotal);
			
			
			if (totalactual==finaltotal) {
				System.out.println("comparision successful" );
				}
			else {
				
				System.out.println("comparision unsuccessful" );
			
			}
			
			/* This will give 1st box extra 2nd column as it has common header for extras web element so by default it will select the 1st from top
			Driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div"));
			*/
			
			
	}

}
