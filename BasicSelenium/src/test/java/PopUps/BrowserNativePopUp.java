package PopUps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserNativePopUp {

	public static void main(String[] args) {
		
		/*ChromeOptions option = new ChromeOptions();
		option.addArguments("incognito");
		WebDriverManager.chromedriver();
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://amazon.in");*/
		
		/*EdgeOptions option1 = new EdgeOptions();
		option1.addArguments("InPrivate");
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver(option1);
		driver.get("https://amazon.in");*/
		
		ChromeOptions option3 = new ChromeOptions();
		option3.addArguments("incognito");
		WebDriverManager.chromedriver().setup();
		WebDriver driver2 = new ChromeDriver();
		driver2.get("https:www.google.com");
	}

}
