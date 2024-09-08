package FrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Properties_File {

	//public static void main(String[] args) throws Throwable 
	
	
	@Test
	public void propertyFile() throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//FileInputStream fis = new FileInputStream("C:\\shubham\\Selenium\\Property_files.properties.txt");
		FileInputStream fis = new FileInputStream("./Property_files.properties.txt");
		Properties pro = new Properties();
		pro.load(fis);
		String URl = pro.getProperty("url1");
		driver.get(URl);
		/*String USERNAME = pro.getProperty("username");
		String PASSWORD = pro.getProperty("password");
		driver.get(URl);
		driver.findElement(By.id("username")).sendKeys(USERNAME); //1
		driver.findElement(By.className("pwdfield")).sendKeys(PASSWORD);//1
		driver.findElement(By.id("loginButtonContainer")).click();//1*/
		

	}

}
