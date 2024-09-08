package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassAssignment {

	public static void main(String[] args) throws Throwable {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		//driver.findElement(By.xpath("(//span[text()='Apple iPhone 13 (128GB) - Blue'])[3]")).
		//driver.findElement(By.xpath("(//span[text()='Apple iPhone 14 Pro (128 GB) - Space Black'])[1]/../../../../../div/div/div/div/div/div/div/../../../div/div/a/span/span/span[text()='1,19,999']")).getText();
		String value = driver.findElement(By.xpath("(//span[text()='Apple iPhone 14 Pro (128 GB) - Space Black'])[1]/../../../../../div/div/div/div/div/div/div/../../../div/div/a/span/span/span[text()='1,19,999']")).getText();
		System.out.println(value);

	}
}
