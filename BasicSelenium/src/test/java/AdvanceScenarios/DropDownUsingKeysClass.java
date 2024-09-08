package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownUsingKeysClass {public static void main(String[] args) throws InterruptedException {
	
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.findElement(By.xpath("//a[.='Create new account']")).click();
	Thread.sleep(2000);
	
	/*WebElement daylist = driver.findElement(By.xpath("//select[@id='day']"));
	Thread.sleep(2000);
	daylist.click();
	daylist.sendKeys(Keys.ARROW_UP);
	Thread.sleep(400);
	daylist.sendKeys(Keys.ARROW_UP);
	Thread.sleep(400);
	daylist.sendKeys(Keys.ARROW_UP);
	Thread.sleep(400);
	WebElement monthlist = driver.findElement(By.xpath("//select[@id='month']"));
	Thread.sleep(2000);
	monthlist.click();
	monthlist.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(400);
	monthlist.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(400);
	monthlist.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(400);
	monthlist.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(400);
	WebElement yearlist = driver.findElement(By.xpath("//select[@id='year']"));
	yearlist.click();
	yearlist.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(400);
	yearlist.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(400);
	yearlist.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(400);
	yearlist.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(400);
	yearlist.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(400);
	yearlist.sendKeys(Keys.ARROW_DOWN);
	yearlist.click();*/
	
	
	
	
	
	
	
	
	
	
}

}
