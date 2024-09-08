package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticefXpath {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.wikipedia.org/");
		
//		WebElement countryName = driver.findElement(By.xpath("//tr/td/a[.='Abu Dhabi']/following::td/b/a[.='United Arab Emirates']"));
//	    System.out.println(countryName.getText());
		
	}

}
