package PracticeForMock;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WDMpractice {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		String source = driver.getPageSource();
		System.out.println("the title is :"+title);
		System.out.println("The url is :"+url);
		System.out.println("The source is :"+source);
		

	}

}
