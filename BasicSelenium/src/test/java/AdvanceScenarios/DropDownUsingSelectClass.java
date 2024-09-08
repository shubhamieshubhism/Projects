package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownUsingSelectClass {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[.='Create new account']")).click();
		Thread.sleep(2000);
		WebElement daylist = driver.findElement(By.xpath("//select[@id='day']"));
		Thread.sleep(2000);
		daylist.click();
		Select sel = new Select(daylist);
		//sel.selectByIndex(19);
		//drop down using select by value
		//sel.selectByValue("20");
		sel.selectByVisibleText("20");
		WebElement monthlist = driver.findElement(By.xpath("//select[@id='month']"));
		monthlist.click();
		Select sel1 = new Select(monthlist);
		//sel1.selectByIndex(7);
		//sel1.selectByValue("8");
		sel1.selectByVisibleText("Aug");
		
		WebElement yearlist = driver.findElement(By.xpath("//select[@id='year']"));
		yearlist.click();
		Select sel2 = new Select(yearlist);
		//sel2.selectByIndex(29);
		//sel2.selectByValue("1994");
		sel2.selectByVisibleText("1994");
		yearlist.click();
		
		
		
	

	}

}
