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
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchDataFromExcelFile {
	public WebDriver driver;
	
	@Test
	public void methodFetchDataFromExcel() throws Throwable
	//public static void main(String[] args) throws Throwable 
	
	
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
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

		
		
	}

}
