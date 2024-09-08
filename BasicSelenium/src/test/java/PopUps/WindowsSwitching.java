package PopUps;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsSwitching {

	@Test
	public void methodWindowsSwitching() throws Throwable
	//public static void main(String[] args) throws Throwable
	
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		
		
		
		driver.findElement(By.xpath("//div[text()='Services']")).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.findElement(By.xpath("//a[@title='FIND JOBS']")).click();
		String mainid = driver.getWindowHandle();//window 1
		System.out.println(mainid);
		//whereever driver is focusing we will get that window id
		//getwindowhandle will get only one id
		Set<String> allid = driver.getWindowHandles();//win1,win2
		//getwindowhandles will get all the id of the windows 
		//that are currently active
		System.out.println(allid);
		
		for(String id:allid)
		{
			if(!mainid.equals(id))
			{
				driver.switchTo().window(id);
				Thread.sleep(1000);
				driver.findElement(By.xpath("//a[@title='FIND JOBS']")).click();
			}
		}
		
		driver.switchTo().window(mainid);
		driver.findElement(By.xpath("//img[@class='cross-icon']")).click();
		Thread.sleep(2000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.findElement(By.xpath("//span[text()='Remote']")).click();
		driver.findElement(By.xpath("//div[text()='Companies']")).click();	
	}

}
