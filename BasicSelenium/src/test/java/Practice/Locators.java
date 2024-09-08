package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//demo.actitime.com/login.do
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin"); //1
		//driver.findElement(By.name("pwd")).sendKeys("manager");
		//3.locator classname
		driver.findElement(By.className("pwdfield")).sendKeys("manager");//1
		//remember me check box
		driver.findElement(By.id("keepLoggedInCheckBox")).click();//1
		driver.findElement(By.id("loginButtonContainer")).click();//1
		Thread.sleep(2000);//1
		driver.findElement(By.linkText("View Time-Track")).click();//1
		//driver.findElement(By.id("logoutLink")).click();
		
		//www.amazon.in
		//driver.get("https://www.amazon.in");
		//driver.findElement(By.linkText("Amazon miniTV")).click();//for amazon mini tv
		//Thread.sleep(2000);
		//driver.navigate().back();
		//Thread.sleep(2000);
		//driver.findElement(By.linkText("Mobiles")).click();
		//Thread.sleep(2000);
		//4.locator partialLinkText
		//driver.findElement(By.partialLinkText("Amazon min")).click();
		//driver.close();
		//driver.findElement(By.id("nav-logo-sprites")).click();
		//Thread.sleep(2000);
		
		//driver.close();
		//driver.get("http://www.youtube.com");
		
		//finding the location of the user text feild
		//by using id locator
		//1.locator id
		
		//the above command is use to give direct input in 
		//username which is element on the webpage
		//id is a locator and sendkeys will send the input 
		//that you want to give eg shubham
		
		//2.locator name
		//password
		
		
		
	}

}
