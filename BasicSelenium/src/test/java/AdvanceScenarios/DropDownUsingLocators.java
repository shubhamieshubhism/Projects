package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownUsingLocators {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[.='Create new account']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[text()='20']")).click();
		driver.findElement(By.xpath("//option[text()='Aug']")).click();
		driver.findElement(By.xpath("//option[text()='1994']")).click();

	}

}
