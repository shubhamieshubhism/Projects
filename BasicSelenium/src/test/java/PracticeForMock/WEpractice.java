package PracticeForMock;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WEpractice {
	
	
      @Test	
      public void methodPractice() throws InterruptedException
      {
    	  WebDriverManager.chromedriver().setup();
    	  WebDriver driver = new ChromeDriver();
    	  driver.manage().window().maximize();
    	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	  driver.get("https://www.naukri.com/");
    	  driver.findElement(By.xpath("//div[text()='Services']")).click();
    	  String mainid = driver.getWindowHandle(); 
    	  
    	  Set<String> allid = driver.getWindowHandles();
    	  System.out.println(allid);
    	  for (String id: allid) {
    		  if(!mainid.equals(id))
    		  {
    			  driver.switchTo().window(id);
    			  driver.findElement(By.xpath("//a[@title='FIND JOBS']")).click();
    			  
    		  }
			
		}
    	  driver.switchTo().window(mainid);
    	  driver.findElement(By.xpath("//img[@class='cross-icon']")).click();
  		  Thread.sleep(2000);
  		  driver.findElement(By.xpath("//div[text()='Companies']")).click();
    	  
    	  
      }

}
