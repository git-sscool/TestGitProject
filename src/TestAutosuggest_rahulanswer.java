
public class TestAutosuggest_rahulanswer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebElement popup = driver.findElement(By.cssSelector(".autopop__wrap.makeFlex.column.defaultCursor"));

        WebElement account = driver.findElement(By.xpath("//li[@data-cy='account']"));

        if(popup.isDisplayed()) {

            account.click();

        }

        driver.findElement(By.id("fromCity")).click();

        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

        WebElement source = driver.findElement(By.xpath("//input[@placeholder='From']"));

        source.sendKeys("MUM");

        Thread.sleep(2000);

        source.sendKeys(Keys.ARROW_DOWN);

        source.sendKeys(Keys.ENTER);

        // Enter text Bangalore to destination search

        WebElement destination = driver.findElement(By.xpath("//input[@placeholder='To']"));

        destination.sendKeys("Bengaluru");

        Thread.sleep(2000);

        destination.sendKeys(Keys.ARROW_DOWN);

        destination.sendKeys(Keys.ENTER);

        Thread.sleep(2000);
	}

}
