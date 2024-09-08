package AdvanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingWebElements {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//for links
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		int count=0;
		for(WebElement link : allLinks)
		{
			System.out.println(link.getText());
			count++;
		}
		System.out.println("total no of links:"+count);
		// for images
		List<WebElement> allimage = driver.findElements(By.xpath("//img"));
		int count1=0;
		for(WebElement img : allimage)
		{
			System.out.println(img.getTagName());
			count1++;
		}
		System.out.println("The total number of images: "+count1);
		driver.close();
		

	}

}
