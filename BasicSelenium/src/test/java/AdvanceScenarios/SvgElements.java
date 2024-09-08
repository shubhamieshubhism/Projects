package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SvgElements {
	//svg=scalar vector graphics
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[name()='svg' and @class='gb_j']")).click();
		//driver.findElement(By.xpath("//*[name()='svg' and @ class='Gdd5U']")).click();

	}

}
