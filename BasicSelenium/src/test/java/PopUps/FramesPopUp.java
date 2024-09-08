package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesPopUp {

	@Test
	public void methodFramesPopup() throws Throwable
	//public static void main(String[] args) throws Throwable
	
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		/*//switch frame ==> index value
		driver.get("https://jqueryui.com/droppable/ ");
		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).perform();*/
		
		//switch frame ==> using id, name
		driver.get("https://demo.automationtesting.in/Frames.html ");
		//driver.switchTo().frame("SingleFrame");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("nike");
		
		//switch frame ==> using webelement
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@name='SingleFrame']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("nike");
		
		


	}

}
