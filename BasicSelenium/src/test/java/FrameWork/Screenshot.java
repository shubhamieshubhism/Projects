package FrameWork;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import POM.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	
	@Test
	public void methodScrshot() throws Throwable
	//public static void main(String[] args) throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://demo.actitime.com/login.do");
		//driver.findElement(By.id("username")).sendKeys("admin");
		LoginPage log = new LoginPage(driver);
		
		log.loginToApp("admin","manager");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File scr = ts.getScreenshotAs(OutputType.FILE);
		File dst = new File("Scrshot.png");
		FileUtils.copyFile(scr, dst);
	    
		
	}

}
