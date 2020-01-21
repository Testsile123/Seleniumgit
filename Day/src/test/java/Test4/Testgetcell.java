package Test4;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testgetcell {
	private static final String ReadExcelUtility = null;
	WebDriver driver;
	@BeforeTest
	public void beforeTest()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@AfterTest
	public void afterTest()
	{
		driver.close();
	}
	@Test(dataProvider = "DP1")
	public void testDemoWebshopLogin(String username , String Password)
	{
		driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.id("Password")).sendKeys(Password);
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		AssertJUnit.assertTrue(driver.findElement(By.linkText("Log out")).isDisplayed());
		driver.findElement(By.linkText("Log out")).click();
		driver.findElement(By.linkText("Log in")).click();
	}
	@DataProvider(name ="DP1")
	public Object[][] getDataFromExcel()
	{
		return ReadExcelUtility.readDataFromExcel();
				
				
				
							
	}
}

	
	
	

