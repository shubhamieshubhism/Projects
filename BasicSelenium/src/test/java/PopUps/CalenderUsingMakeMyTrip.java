package PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderUsingMakeMyTrip {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		WebElement noti = driver.findElement(By.id("webklipper-publisher-widget-container-notification-close-div"));
		Actions act = new Actions(driver);
		act.moveToElement(noti).perform();

	}

}
