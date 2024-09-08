package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender {

	
	@Test
	public void methodCalender()
	//public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/");
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		driver.findElement(By.xpath("//p[@class='sc-jlwm9r-1 dRQhOp']")).click();
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		
		
		//dynamic Xpath.
		String month = "September 2023";
		String day = "23";
		//driver.findElement(By.xpath("//div[text()='"+month+"']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='"+day+"']")).click();
		driver.findElement(By.xpath("//div[.='"+month+"']/ancestor::div[@class='DayPicker-Months']/descendant::p[text()='"+day+"']")).click();
		
		//driver.findElement(By.xpath("//span[text()='Done']")).click();
		/*driver.findElement(By.xpath("//li[text()='economy']")).click();
		driver.findElement(By.xpath("//a[text()='Done']")).click();
		driver.findElement(By.xpath("//span[text()='Return']")).click();
		driver.findElement(By.xpath("//div[text()='October 2023']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='2']")).click();
		driver.findElement(By.xpath("//span[text()='Done']")).click();
		driver.findElement(By.xpath("//li[text()='economy']")).click();
		driver.findElement(By.xpath("//a[text()='Done']")).click();
		//driver.findElement(By.xpath("//span[text()='SEARCH FLIGHTS']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));*/
		
		
		
		


	}

}
