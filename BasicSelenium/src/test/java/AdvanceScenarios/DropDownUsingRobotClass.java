package AdvanceScenarios;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownUsingRobotClass {

	@Test
	public void methodDropDownRobotClass() throws Throwable
	//public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[.='Create new account']")).click();
		Thread.sleep(2000);
		WebElement daylist = driver.findElement(By.xpath("//select[@id='day']"));
		Thread.sleep(2000);
		daylist.click();
		Robot rob =new Robot();
		rob.keyPress(KeyEvent.VK_UP);
		rob.keyRelease(KeyEvent.VK_UP);
		Thread.sleep(400);
		rob.keyPress(KeyEvent.VK_UP);
		rob.keyRelease(KeyEvent.VK_UP);
		Thread.sleep(400);
		rob.keyPress(KeyEvent.VK_UP);
		rob.keyRelease(KeyEvent.VK_UP);
		Thread.sleep(400);
		rob.keyPress(KeyEvent.VK_UP);
		rob.keyRelease(KeyEvent.VK_UP);
		Thread.sleep(400);
		
		WebElement monthlist = driver.findElement(By.xpath("//select[@id='month']"));
		monthlist.click();
		Robot rob1 = new Robot();
		rob1.keyPress(KeyEvent.VK_DOWN);
		rob1.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(400);
		rob1.keyPress(KeyEvent.VK_DOWN);
		rob1.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(400);
		rob1.keyPress(KeyEvent.VK_DOWN);
		rob1.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(400);
		rob1.keyPress(KeyEvent.VK_DOWN);
		rob1.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(400);
		
		
		WebElement yearlist = driver.findElement(By.xpath("//select[@id='year']"));
		yearlist.click(); 
		Robot rob2 = new Robot();
	    rob2.keyPress(KeyEvent.VK_DOWN);
		rob2.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(400);
		rob2.keyPress(KeyEvent.VK_DOWN);
		rob2.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(400);
		rob2.keyPress(KeyEvent.VK_DOWN);
		rob2.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(400);
		rob2.keyPress(KeyEvent.VK_DOWN);
		rob2.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(400);
		rob2.keyPress(KeyEvent.VK_DOWN);
		rob2.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(400);
		yearlist.click();
		
	
	
	
	
	}

}
