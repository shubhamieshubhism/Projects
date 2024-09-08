package PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPopUp
{

	//public static void main(String[] args) throws Throwable 
	
	@Test
	public void methodFileUpload() throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://monsterindia.com/");
		driver.findElement(By.xpath("//div[contains(text(),'Upload Resume')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("\"C:\\shubham\\Selenium\\CLASS NOTES GIVEN BY MAM\\AdvanceScenarios2pm.txt\"");

	}

}
