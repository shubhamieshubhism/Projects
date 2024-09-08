package AdvanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestionAssignments {
	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		
		Thread.sleep(1000);
		//flipkart
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("bluetooth");
		Thread.sleep(1000);
		List<WebElement> AllList = driver.findElements(By.xpath("//ul[@class='col-12-12 _1MRYA1 _38UFBk']/li"));
		for(WebElement ele: AllList)
		{
			Thread.sleep(1000);
			System.out.println(ele.getText());
		    String list = ele.getText();
		    if(list.equalsIgnoreCase("boat airdopes"))
		    {
		    	ele.click();
		    	break;
		    }
		    if(list.equalsIgnoreCase("bluetooth headphones"))
		    {
		    	ele.click();
		    	break;
		    }
		
		
		
		
		}
		
		
		/*//google
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("selenium");
		Thread.sleep(1000);
		List<WebElement> seleniumlist = driver.findElements(By.xpath("//li[@jsaction='click:.CLIENT;mouseover:.CLIENT']"));
		for(WebElement list : seleniumlist)
		{
			Thread.sleep(1000);
			System.out.println(list.getText());
			String seleniumsuggestionlist = list.getText();
		    if(seleniumsuggestionlist.equalsIgnoreCase("selenium ide"))
		    {
		    	list.click();
		    	break;
		    }
		}*/
		
		
		//meesho
		driver.get("https://www.meesho.com");
		WebElement searchbar = driver.findElement(By.xpath("//input[@placeholder='Try Saree, Kurti or Search by Product Code']"));
		searchbar.sendKeys("cloths");
		searchbar.click();
		Thread.sleep(1000);
		List<WebElement> alllist = driver.findElements(By.xpath("//p[@class='sc-eDvSVe hpsLdS sc-AHaJN puxZX sc-AHaJN puxZX']"));
		for(WebElement list : alllist)
		{
			Thread.sleep(1000);
			System.out.println(list.getText());
			String clothsuggestion = list.getText();
			if(clothsuggestion.equalsIgnoreCase("cloths storage box"))
			{
				list.click();
				break;
			}
		}
	}

}
