package AdvanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestion {

	@Test
	public void methodAutoSuggestion() throws Throwable
	//public static void main(String[] args) throws Throwable 
	
	{
		//when you on search for something we get suggestions
		//how to handle these siggestion is that what we are going to 
		//learn in this advance scenario
		//ie autosuggestion.
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("puma");
		Thread.sleep(2000);
		List<WebElement> AllList = driver.findElements(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']"));
		Thread.sleep(1000);
		for(WebElement list : AllList)
		{
			Thread.sleep(1000);
			System.out.println(list.getText());
			String lists = list.getText();
			Thread.sleep(1000);
			if(lists.equalsIgnoreCase("puma slippers for men"));
			{
				list.click();
				break;
			}

			
		}

	}

}
