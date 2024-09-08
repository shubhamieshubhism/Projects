package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathLocator {
	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("admin");
		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//td[@id='loginButtonContainer']")).click();
		//driver.get("http://www.meesho.com");
		//driver.findElement(By.xpath("//span[text()='Kids']")).click();
		//driver.findElement(By.xpath("//p[text()='Soft Toys']")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//img[contains(@alt,'Fancy K')]")).click();
		
	}

}
