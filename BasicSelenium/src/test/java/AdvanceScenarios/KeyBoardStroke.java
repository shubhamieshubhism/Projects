package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardStroke {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		/*//case 1
		driver.findElement(By.id("username")).sendKeys("admin");
		//driver.findElement(By.name("pwd")).sendKeys("manager");
		WebElement password = driver.findElement(By.name("pwd"));
		password.sendKeys("manager");
		password.sendKeys(Keys.ENTER);*/
		
		
		/*//case 2
		driver.findElement(By.id("username")).sendKeys("admin");
		WebElement password = driver.findElement(By.name("pwd"));
		password.sendKeys("manager",Keys.ENTER);*/
		
		//case3 i want my cursor go to password text feild
		//all thing will be done in one line olny
		//driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
		
		//case 4
		//for selecting the checkbox and other similar things we use keys.space
		//driver.findElement(By.id("username")).sendKeys("admin");
		
		//copy paste using keysclass();
		
		WebElement k=driver.findElement(By.id("username"));
		k.sendKeys("admin");
		k.sendKeys(Keys.CONTROL,"a");  
        k.sendKeys(Keys.CONTROL,"c");
        WebElement p=driver.findElement(By.name("pwd"));
        p.sendKeys(Keys.CONTROL,"v");
      
        
        

	}

}
