package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClassEx {

	
	@Test
	public void methodActionClass()
	//public static void main(String[] args) throws Throwable
	
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		/*driver.get("https://www.amazon.in");
		//in order to execute action class we need to pass perform();
		//it is mandatory.
		//for language
		WebElement ele1 = driver.findElement(By.xpath("//span[@class='icp-nav-link-inner']"));
		Actions Act1 = new Actions(driver);
		Act1.moveToElement(ele1).perform();
		
		//for select your address
		WebElement ele2 = driver.findElement(By.xpath("//span[@id='glow-ingress-line2']"));
		Actions act2 = new Actions(driver);
		//for right--> click contextclick();
		act2.contextClick(ele2).perform();
		//act2.moveToElement(ele2).contextClick(ele2).perform();*/
		
		
		driver.get("https://demo.actitime.com/login.do");
		WebElement USERNAME = driver.findElement(By.name("username"));
		WebElement PASSWORD = driver.findElement(By.name("pwd"));
		WebElement LOGIN = driver.findElement(By.id("loginButton"));
		Actions act = new Actions(driver);
		

		//act.sendKeys(USERNAME, "admin").perform();
		//act.sendKeys(PASSWORD, "manager").perform();
		//act.sendKeys(LOGIN).perform();
		 /* if we are passing multiple action in one line then we need to use built()
		 *combination to action and perform it in sequence is done by build
		act.sendKeys(USERNAME, "admin").sendKeys(PASSWORD, "manager").sendKeys(LOGIN).click(LOGIN).perform();
		
		//drag and drop
		/*driver.get("https://jqueryui.com/resources/demos/droppable/default.html ");
		WebElement drag = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		WebElement drop = driver.findElement(By.xpath("//p[text()='Drop here']"));
		Actions act = new Actions(driver);
		//act.dragAndDrop(drag, drop).perform();
		//drag and drop with click and hold and release.
		act.clickAndHold(drag).perform();
		act.release(drop).perform();*/
		
		/*driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement ele = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions act = new Actions(driver);
		act.doubleClick(ele).perform();*/
		
		//movetooffset it is a method to remove the popup which comes without cross
		//or we need to remove it by clicking it anywhere on the screen
		
		/*driver.get("https://www.makemytrip.com/");
		Actions act = new Actions(driver);
		act.moveByOffset(10,10).perform();
		Thread.sleep(2000);
		WebElement cross = driver.findElement(By.xpath("//a[@class='close']"));
		Thread.sleep(2000);
		act.doubleClick(cross).perform();*/
		
		/*driver.get("https://jqueryui.com/droppable/");
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions act = new Actions(driver);
		Thread.sleep(1000);
		act.dragAndDrop(drag, drop).perform();
		//act.clickAndHold(drag).release(drop).perform();*/
		

		
		
		
		
		
	}

}
