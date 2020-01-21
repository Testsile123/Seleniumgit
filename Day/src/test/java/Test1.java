
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
public class Test1 {
@Test
public void testcardlink()

{
	System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://hdfcbank.com");
	driver.manage().window().maximize();
	driver.findElement(By.id("PopupBoxclose")).click();
	Actions act1=new Actions(driver);
	act1.moveToElement(driver.findElement(By.cssSelector("a(title ='pay']"))).pause(3000).perform();
		driver.findElement(by.xpath)
}
}
