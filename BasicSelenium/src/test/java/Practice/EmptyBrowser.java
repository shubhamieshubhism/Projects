package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class EmptyBrowser {

	public static void main(String[] args) {
		
	WebDriver driver1 = new ChromeDriver();
	//WebDriver driver = new EdgeDriver();
	//get(String url)--->web driver method ---> to launch the url.
	//driver1.get("https://www.amazon.in/");
	//if we go for two application then we are able to access only one application 
	//driver1.get("https://www.facebook.com/");	
	//we have total 13 selenium methods
	//get url method use to type the url on browser
	driver1.get("http://www.amazon.in");
	//method 2 get title
	String title=driver1.getTitle();
	System.out.println(title);
	//this method is use to get title of the url showing on the browser

	
	}
}
