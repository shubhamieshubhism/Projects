 package AdvanceScenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waits {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		/*//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com");*/

		
		//explicit wait --> only when it is necessary
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager");
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(loginButton));
		loginButton.click();
		wait.until(ExpectedConditions.titleContains("Enter Time-Track"));
		
		
		//Fluent wait
		FluentWait<WebDriver> fluent = new FluentWait<WebDriver>(driver);
		fluent.pollingEvery(Duration.ofSeconds(1));
		fluent.withTimeout(Duration.ofSeconds(10));
		fluent.until(ExpectedConditions.elementToBeClickable(loginButton));
	
	
	
	
	}

}
