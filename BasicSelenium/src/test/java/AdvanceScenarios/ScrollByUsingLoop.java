package AdvanceScenarios;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollByUsingLoop {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.amazon.in");
		driver.get("https://www.meesho.com");
		
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		for(int i=0;i<5;i++)
		{
			js.executeScript("window.scrollBy(0,500)");
			Thread.sleep(400);
		}
		for(int i=0;i<4;i++)
		{
			js.executeScript("window.scrollBy(0,-400)");
			Thread.sleep(400);
		}
		
		
		Thread.sleep(5000);
		driver.close();

	}

}
