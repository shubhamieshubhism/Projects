package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollHandlingByJavaScriptExecutors {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.facebook.com");
		
		/*Thread.sleep(1000);
		JavascriptExecutor jr = (JavascriptExecutor)driver;
		jr.executeScript("window.scrollBy(0,2000)");
		
		Thread.sleep(1000);
		JavascriptExecutor jr1 = (JavascriptExecutor)driver;
		jr1.executeScript("window.scrollBy(0,-1000)");*/
		
		
		/*WebElement ele = driver.findElement(By.xpath("//a[.='Instagram']"));
		//Point loc = ele.getLocation();
		//System.out.println(loc.getX());
		//System.out.println(loc.getY());
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		//js1.executeScript("window.scrollBy(812,786)");
		js1.executeScript("arguments[0].scrollIntoView()",ele);
		Thread.sleep(2000);
		//ele.click();*/
		
		/*driver.get("https://www.meesho.com");
		Thread.sleep(2000);
		WebElement ele1 = driver.findElement(By.xpath("//span[text()='Careers']"));
		//Point loc1 = ele1.getLocation();
		//System.out.println(loc1.getX());
		//System.out.println(loc1.getY());
		//Thread.sleep(2000);
		JavascriptExecutor js2 = (JavascriptExecutor)driver;
		//js2.executeScript("window.scrollBy(0,0)");
		js2.executeScript("arguments[0].scrollIntoView()",ele1);
		Thread.sleep(2000);
		//ele1.click();*/
		
		
		driver.get("https://www.selenium.dev");
		Thread.sleep(2000);
		WebElement ele2 = driver.findElement(By.xpath("//a[.='Help']"));
		JavascriptExecutor js3 = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		//js3.executeScript("window.scrollBy(812,786)");
		js3.executeScript("window.scrollBy(200,0)");
		Thread.sleep(2000);
		js3.executeScript("window.scrollBy(-200,0)");
		
		js3.executeScript("window.scrollTo(0,document.body.scrollHeight");
		Thread.sleep(2000);
		js3.executeScript("window.scrollTo(0,-document.body.scrollHeight");

		
		
		
		
		
		
		
		

		
		
		
		//Thread.sleep(5000);
		//driver.close();
		

	}

}
