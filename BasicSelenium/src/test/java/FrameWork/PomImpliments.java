package FrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POM.HomePage;
import POM.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PomImpliments {

	
	
	@Test
	public void methodPomImplimentation() throws Throwable
	//public static void main(String[] args) throws Throwable 
	
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//FileInputStream fis = new FileInputStream("C:\\shubham\\Selenium\\Property_files.properties.txt");
		FileInputStream fis = new FileInputStream("./Property_files.properties.txt");
		Properties pro = new Properties();
		pro.load(fis);
		String URl = pro.getProperty("url");
		driver.get(URl);
	    String USERNAME = pro.getProperty("username");
		String PASSWORD = pro.getProperty("password");
		driver.get(URl);
		/*driver.findElement(By.id("username")).sendKeys(USERNAME); //1
		driver.findElement(By.className("pwdfield")).sendKeys(PASSWORD);//1
		driver.findElement(By.id("loginButtonContainer")).click();*/
		
		
		//using getter method 
		/*LoginPage login = new LoginPage(driver);
		login.getUserTextFeild().sendKeys(USERNAME);
		login.getPasswordField().sendKeys(PASSWORD);
		login.getLoginButton().click();*/
		
		
		//using business logic
		LoginPage login = new LoginPage(driver);
		login.loginToApp(USERNAME, PASSWORD);
		
		Thread.sleep(1000);
		/*//if we are using without the getproperty
		LoginPage login = new LoginPage(driver);
		login.loginToApp("admin", "manager");*/
		
		HomePage home = new HomePage(driver);
		home.ViewLink();
		

	}

}
