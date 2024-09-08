package interviewQuetions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleAutomation {
	
	@Test
	public void googleAutomationOfVideo() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.youtube.com");
		WebElement searchBar = driver.findElement(By.xpath("//input[@id='search']"));
		searchBar.sendKeys("One Piece latest manga review");
		searchBar.submit();
		Actions act = new Actions(driver);
		WebElement image = driver.findElement(By.xpath("//div[@id='dismissible']/ytd-thumbnail/a/yt-image/img[@src='https://i.ytimg.com/vi/APa93o66izo/hq720.jpg?sqp=-oaymwEcCNAFEJQDSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLCbh7sIUf_ZDGDFWo4HkX1c1GliIg']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(image));
		act.moveToElement(image).perform();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,200)");
		driver.quit();
	}
	@Test
	public void bookATicketOnMakeMyTrip() {
		WebDriverManager.edgedriver().setup();
		EdgeOptions opt=new EdgeOptions();
		opt.addArguments("--guest");
		WebDriver driver = new EdgeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com");
		WebElement from = driver.findElement(By.xpath("//input[@id='fromCity']"));
		from.sendKeys("mumbai");
		driver.findElement(By.xpath("//p[.='Mumbai, India']")).click();
		WebElement to = driver.findElement(By.xpath("//input[@id='toCity']"));
		to.sendKeys("delhi");
		driver.findElement(By.xpath("//p[.='New Delhi, India']")).click();
		driver.findElement(By.xpath("//div[@class='DayPicker-Months']/div/following-sibling::div/div/descendant::p[.='3']")).click();
		driver.findElement(By.xpath("//a[.='Search']")).click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement popup = driver.findElement(By.xpath("//button[.='OKAY, GOT IT!']"));
		wait.until(ExpectedConditions.elementToBeClickable(popup));
		popup.click();
		driver.quit();
	}
	@Test
	public void amazonMobileNamesAndPrices() {
		WebDriverManager.edgedriver().setup();
		EdgeOptions opt=new EdgeOptions();
		opt.addArguments("--guest");
		WebDriver driver = new EdgeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in");
		WebElement searchBar = driver.findElement(By.xpath("//input[@type='text']"));
		searchBar.sendKeys("iphone");
		searchBar.submit();
		List<WebElement> phoneNames = driver.findElements(By.xpath("//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']"));
		List<WebElement> phonePrice = driver.findElements(By.xpath("//span[@class='a-price']"));
		
		for(int i = 0;i<phonePrice.size();i++) {
			System.out.println("The name of phone is "+phoneNames.get(i).getText());
			System.out.println("The price of phone is "+phonePrice.get(i).getText());
		}
	}

}
