package PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HiddenDivisionPopUp {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement USERNAME = driver.findElement(By.name("username"));
		WebElement PASSWORD = driver.findElement(By.name("pwd"));
		WebElement LOGIN = driver.findElement(By.id("loginButton"));
		Actions act = new Actions(driver);
		
		act.sendKeys(USERNAME, "admin").sendKeys(PASSWORD, "manager").sendKeys(LOGIN).click(LOGIN).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Tasks']")).click();
		

	}

}
