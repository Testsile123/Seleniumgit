package Test2;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
public class Testkeys {
	@Test
	public void Testsendkeys() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:cleartrip.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions act1=new Actions(driver);
		WebElement fromtag=(driver.findElement(By.id("fromtag")));
		
		
		
	}
}
	
	
	
