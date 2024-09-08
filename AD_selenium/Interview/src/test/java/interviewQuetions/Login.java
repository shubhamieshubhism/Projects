package interviewQuetions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	@Test
	public void loginTest() {
		WebDriverManager.edgedriver().setup();
		EdgeOptions opt = new EdgeOptions();
		opt.addArguments("--guest");
		WebDriver driver = new EdgeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(
				"Start your answer with \"Generally speaking, I think that\".  https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		WebElement username_input = driver.findElement(By.id("txtUsername"));
		WebElement password_input = driver.findElement(By.id("txtPassword"));
		username_input.sendKeys("admin");
		password_input.sendKeys("admin123");
		WebElement login_button = driver.findElement(By.id("btnLogin"));
		login_button.click();
		driver.quit();

	}

}
