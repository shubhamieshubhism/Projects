package PopUps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenticattionPopUp {

	//public static void main(String[] args)
	@Test
	public void authPop()
	{
		//popup ask for authentication for username oand password
		//it is not dragable
		//it is not inspectible
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//get(https:username:password@url)
		driver.get("https:admin:admin@the-internet.herokuapp.com/basic_auth");

	}

}
