package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleBrowser {
public static void main(String[] args) throws InterruptedException {
	//WebDriver driver =new EdgeDriver();
	WebDriver driver = new ChromeDriver();
	//driver.get("https://www.amazon.in");
	driver.navigate().to("https://www.amazon.in");
	//String url = driver.getCurrentUrl();
	//System.out.println(url);
	//String title = driver.getTitle();
	//System.out.println(title);
	//String source = driver.getPageSource();
	//System.out.println(source);
	//driver.manage().window().maximize();
	//driver.manage().window().minimize();
	Thread.sleep(2000);//to wait 
	driver.navigate().back();
	Thread.sleep(2000);//to wait
	driver.navigate().forward();
	driver.navigate().refresh();//to refreash
	driver.close();//to close the window
}	
}
