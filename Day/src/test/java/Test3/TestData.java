package Test3;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestData {
	@Test
	public void testDatafromExcel()
	{
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		File file=new File("src/test/resources/testdata/Book1.xslx");
		try {
			InputStream is = new FileInputStream(file);
			XSSFWorkbook workbook = new XSSFWorkbook(is);
			XSSFSheet sheet1=workbook.getSheet("sheet1");
			for(int i=1;i<=sheet1.getLastRowNum();i++);
			{
							for(int j= 0;j<sheet1.getRow(i).getPhysicalNumberofcells();j++);
				{
					System.out.print(sheet1.getrow(i).getcell(j).getstringvalue()));
					System.out.println();
				}
				workbook.close();
				
				}
		}catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
}
}