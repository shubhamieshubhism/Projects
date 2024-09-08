package AdvanceScenarios;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import obeject_Repositories.LoginPage;

public class practice {
	
public WebDriver driver;
@Test
public void methodPractice() throws Throwable {
	WebDriverManager.chromedriver().setup();
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	driver= new ChromeDriver(options);
	driver.get("https://demo.actitime.com/login.do");
	LoginPage log= new LoginPage(driver);
	log.loginToApp("admin", "manager");
	TakesScreenshot ts = (TakesScreenshot) driver;
	File scr = ts.getScreenshotAs(OutputType.FILE);
    File dst= new File("Scrshot.png");
    FileUtils.copyFile(scr, dst);
}

}
