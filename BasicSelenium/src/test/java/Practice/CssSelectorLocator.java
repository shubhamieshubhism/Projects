package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelectorLocator {
public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	//actitime
	//driver.get("https://demo.actitime.com/login.do");
	//driver.findElement(By.cssSelector("input#username")).sendKeys("admin");
	//driver.findElement(By.cssSelector(".pwdfield")).sendKeys("manager");
	//driver.findElement(By.cssSelector("#keepLoggedInCheckBox")).click();
	//driver.findElement(By.cssSelector("#loginButtonContainer")).click();
	//Thread.sleep(5000);
	
	
	//amazon
	//driver.get("https://www.amazon.in");
	//driver.findElement(By.linkText("Amazon miniTV")).click();
	//driver.findElement(By.cssSelector("[alt=\"Half CA - Season 1 - Watch Free\"]")).click();
	//driver.findElement(By.cssSelector("[placeholder=\"Search Amazon.in\"]")).sendKeys("iphone 14 pro max");
	//Thread.sleep(2000);
	//cssselector syntax 1 [AttributeName="AttributeValue"]
	//driver.findElement(By.cssSelector("[id=\"nav-search-submit-button\"]")).click();
	//cssselector syntax 2  htmlTag[AttributeName="AttributeValue"]
	//driver.findElement(By.cssSelector("a[data-csa-c-content-id=\"nav_avod_desktop_topnav\"]")).click();
   
	driver.get("http://www.meesho.com");
	//Thread.sleep(2000);
	
	
	 
	//driver.close();
}
}
