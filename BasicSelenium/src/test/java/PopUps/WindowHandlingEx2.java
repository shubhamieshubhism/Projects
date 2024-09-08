package PopUps;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlingEx2 {

	@Test
	public void methodWindowsHandlingEX2() throws Throwable
	//public static void main(String[] args) throws Throwable 
	
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Windows.html ");
		driver.findElement(By.xpath("//a[.='Open New Seperate Windows']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='click']")).click();
		
		//String mainid = driver.getWindowHandle();
		//System.out.println(mainid);
		
		
		//main window(Frames & windows)
		Set<String> allid = driver.getWindowHandles();
		//System.out.println(allid);
		for(String id:allid)
		{
		driver.switchTo().window(id);
		String title = driver.getTitle();
		System.out.println(title);//--->print the titles of windows
		if(title.contains("Selenium"))
		{
			break;
		}
		}
		driver.findElement(By.xpath("//a[.='Watch the Videos']")).click();
		driver.close();
		
		
		//second window(SeleniumConf Chicago 2023 Playlist - YouTube)
		Thread.sleep(1000);
		Set<String> allid1 = driver.getWindowHandles();
		for(String id1:allid1)
		{
		driver.switchTo().window(id1);
		String title1 = driver.getTitle();
		System.out.println(title1);
		if(title1.contains("SeleniumConf Chicago 2023 Playlist - YouTube"))
		{
			break;
		}
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Shorts']")).click();
		driver.close();
		
		
		//third window(Frames & windows)
		Thread.sleep(1000);
		
		Set<String> allid2 = driver.getWindowHandles();
		for(String id2:allid2)
		{
		driver.switchTo().window(id2);
		String title2 = driver.getTitle();
		System.out.println(title2);
		if(title2.contains("Frames & windows"))
		{
			break;
		}
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[.='Home']")).click();
	    Thread.sleep(10000);
	    driver.quit();
		
	}
}


