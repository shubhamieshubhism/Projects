package FrameWork;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTest {
	
	@Test
	public void m1()
	{
		System.out.println("hi");
	}
	
	@Test
	public void m2()
	{
		System.out.println("hello");
	}
	
	/*@Test
	public static void fetchData() throws Throwable{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//FileInputStream fis = new FileInputStream("C:\\shubham\\Selenium\\Property_files.properties.txt");
		FileInputStream fis = new FileInputStream("./Property_files.properties.txt");
		Properties pro = new Properties();
		pro.load(fis);
		String URl = pro.getProperty("url2");
		driver.get(URl);
		
		
		//FileInputStream fes = new FileInputStream("C:\\shubham\\Selenium\\excelfile.xlsx");
		FileInputStream fes = new FileInputStream("./excelfile.xlsx");
		Workbook book = WorkbookFactory.create(fes);
		Sheet sheet = book.getSheet("Sheet1");
		Row row = sheet.getRow(3);
		Cell cell = row.getCell(1);
		String data = cell.getStringCellValue();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(data);

		
		
	}*/

}
	
	
	
	
	
	
	
	
	

