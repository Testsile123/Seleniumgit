package Test4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Type {
@Test
public void typecard()
{
System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://hdfcbank.com");
driver.manage().window().maximize();
driver.findElement(By.id("PopupBoxclose")).click();
WebElement prodtype=driver.findElement(By.xpath("//li[contains(text(),'Deposits')]"));
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("argument[0].click()",new Object[] {prodtype});
js.executeScript("window.scrollby(0,1000)");

}}