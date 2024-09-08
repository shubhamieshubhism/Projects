package Practice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods 
{
public static void main(String[] args) throws InterruptedException {
	//WebDriver driver1 = new ChromeDriver();
		//WebDriver driver1 = new EdgeDriver();
		//driver1.get("https://www.amazon.in/");
		WebDriver driver1 = new ChromeDriver();
		//make habit to write maximizing window command after browser launchs
		//driver1.manage().window().maximize();
		
		//method 1 geturl(open url or application)
		//it is use to launch the application
		driver1.get("http://www.amazon.in");
		
		//method 2 gettitle(title of the url or application)
		String title=driver1.getTitle();
		System.out.println(title);
		//this method is use to get title of the url showing on the browser
		//it will wait until the application is fully loaded
		//method 3 get current url 
		String URL=driver1.getCurrentUrl();
		System.out.println(URL);
		//use to get the current url of the application.
	
		
		//method 4 getpagesource
		String source=driver1.getPageSource();
		System.out.println(source);
		//use to get the source code of the web page
		
		//method 5 (use for maximize and minimize the window)
		//Options data=driver1.manage();
		//Window win=data.window();
		//win.maximize();
		//short form and using the less number of lines to maximize and minimize the window
		//use to maximize and minimize the window
		
		driver1.manage().window().maximize();
		
		
		//Thread.sleep(1000);
		//this method maximize the screen
		
		//method 6 (navigation)
		//it is use to open the application 
		//but it will not wait until the application is fully loaded
		driver1.navigate().to("https://www.amazon.in");
		
		//inside navigate there is back and forward methods 
		//they are use to automate the process of back and forward
		//inside the browser
		Thread.sleep(2000);//wait for 2 seconds
	    driver1.navigate().back();//navigate to back
	    Thread.sleep(2000);//wait for 2 seconds
	    driver1.navigate().forward();//navigate to forward
		
		// refreash the application
		driver1.navigate().refresh();//navigates the refreash button in the application
		
		//method 7 close
		driver1.close();
		//it will close exactly where driver is focusing
		
		//method 8
		driver1.quit();
		//if we want to close all the window then we use driver.quit();
		//close all the windows
		
		
		
}
}
