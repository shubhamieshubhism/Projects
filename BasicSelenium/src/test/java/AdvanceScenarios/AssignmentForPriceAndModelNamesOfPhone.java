package AdvanceScenarios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentForPriceAndModelNamesOfPhone {


	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		WebElement searchbar = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchbar.sendKeys("iphone");
		searchbar.submit();
		
		
		
		
		List<WebElement> phonelist = driver.findElements(By.xpath("//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']"));

		List<WebElement> pricelist = driver.findElements(By.xpath("//span[@class='a-price']"));
		
		
	
		for(WebElement list : phonelist)
		{
			Thread.sleep(1000);
			System.out.println(list.getText());
		
		}
		for(WebElement list1:pricelist)
		{
			Thread.sleep(1000);
			System.out.println(list1.getText());
		}
		
		
		
		
		 List<WebElement> iphoneProducts = driver.findElements(By.cssSelector(".s-result-item"));

	        
	        for (WebElement iphoneProduct : iphoneProducts) {
	            
	            String iphoneName = iphoneProduct.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).getText();

	           
	            String iphonePrice = iphoneProduct.findElement(By.xpath("//span[@class='a-price']")).getText();

	           
	            System.out.println("iPhone Name: " + iphoneName);
	            System.out.println("iPhone Price: " + iphonePrice);
	        }
		// Get the list of iPhone products
      

		
	
	

	}

}
