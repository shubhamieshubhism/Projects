package Practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POM.InstagramLogin;
import io.github.bonigarcia.wdm.WebDriverManager;

public class IGloginwithPom {
	
	
	@Test
	public void Iglogin()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		InstagramLogin iglog = new InstagramLogin(driver);
		//iglog.loginIGApp("abc","xyz");
		iglog.getIGUserTextFeild().sendKeys("sshubhism");
	}

}
