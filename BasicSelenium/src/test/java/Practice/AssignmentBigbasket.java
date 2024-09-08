package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentBigbasket 

{
	
	
	@Test()
	public void assignPop() throws InterruptedException
	//public static void main(String[] args) throws Throwable
	
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com");
		WebElement searchbar = driver.findElement(By.xpath("(//input[@placeholder='Search for Products..'])[1]"));
		Thread.sleep(1000);
		searchbar.sendKeys("washing powder");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='icon svg-header svg-search svg-search-dim hidden-sm hidden-xs']")).click();
		WebElement powder = driver.findElement(By.xpath("//span[text()='68']/../../../../../../div/a[text()='Green Lemon & Jasmine Detergent Powder']"));
		System.out.println(powder.getText());
		
	}
	

}
