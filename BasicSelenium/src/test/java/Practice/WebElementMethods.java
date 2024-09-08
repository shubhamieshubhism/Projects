package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementMethods {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.facebook.com");
		//CssValue 
		//use to get the properties of the element such as color, font size and etc.
		/*WebElement data = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
		String font = data.getCssValue("font-size");
		System.out.println(font);
		System.out.println(data.getCssValue("font-size"));
		WebElement data1 = driver.findElement(By.xpath("//input[@id='email']"));
		String ElementColor =data1.getCssValue("color");
		System.out.println(ElementColor);
		WebElement data2 = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
		String logocolour = data2.getCssValue("color");
		System.out.println(logocolour);
		System.out.println(data2.getCssValue("color"));*/
		
		//driver.get("https://www.flipkart.com");
		//driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();//for closing popup
		
		/*driver.get("https://www.amazon.in");
		store in a variable i.e element
		WebElement element = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		element.sendKeys("puma");
		element.submit();//for entering the value.
		submit is use for searching element in the search bar.
		driver.get("https://www.google.com");
		WebElement search = driver.findElement(By.xpath("//textarea[@name='q']"));
	    search.sendKeys("selenium");
	    search.submit();*/
		
		/*//get location //location of elements in facebook
		WebElement text = driver.findElement(By.xpath("//a[text()='Help']"));
		System.out.println(text.getLocation().getX());
		System.out.println(text.getLocation().getY());
		getsize will get height and weight of the element
		System.out.println(text.getSize().getHeight());
		System.out.println(text.getSize().getWidth());
		getrec will give all dimension in one webelement.
		WebElement text1=driver.findElement(By.xpath("//a[@id='u_0_0_gs']"));
		System.out.println(text1.getRect().getX());
		System.out.println(text1.getRect().getY());
		System.out.println(text1.getRect().getHeight());
		System.out.println(text1.getRect().getWidth());*/
		
		driver.get("https://demo.actitime.com/login.do");
		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		//clear();to erase what is written
		/*WebElement USERNAME = driver.findElement(By.id("username"));
		USERNAME.sendKeys("admin");
		Thread.sleep(2000);
		USERNAME.clear();*/
		
		//isDisplayed();
		/*WebElement logo =driver.findElement(By.xpath("//div[@class='atLogoImg']"));
		if(logo.isDisplayed())
		{
			System.out.println("logo id displayed");
		}
		else
		{
			System.out.println("logo is not displayed");
		}*/
		//isEnable();
		/*WebElement USERNAME = driver.findElement(By.id("username"));
		if(USERNAME.isEnabled())
		{
			USERNAME.sendKeys("admin");
		}
		else
		{
			System.out.println("It is not enable");
		}
		//iselect();
		WebElement checkbox = driver.findElement(By.xpath("//input[@id='keepLoggedInCheckBox']"));
		checkbox.click();
		if(checkbox.isSelected())
		{
			System.out.println("checkbox is selected");
		}
		else
		{
			System.out.println("checkbox is not selected");
		}*/
		
		/*//getattribute - it will give us the value which the attribute contains such as class, id , and etc
		WebElement USERNAME = driver.findElement(By.id("username"));
		System.out.println(USERNAME.getAttribute("placeholder"));
		WebElement password = driver.findElement(By.xpath("//input[@name='pwd']"));
		System.out.println(password.getAttribute("href"));*/
		
		//Tagme();-it will print the html tag of the element
		//WebElement USERNAME = driver.findElement(By.id("username"));
		//System.out.println(USERNAME.getTagName());
		
		/*//getariarole();
		WebElement USERNAME = driver.findElement(By.id("username"));
		System.out.println(USERNAME.getAriaRole());
		
		WebElement remember1 = driver.findElement(By.xpath("//input[@type='checkbox']"));
		System.out.println(remember1.getAriaRole());
		
		WebElement password = driver.findElement(By.name("pwd"));
		System.out.println(password.getAriaRole());*/
		
		//getdomAttribute();
		WebElement USERNAME = driver.findElement(By.id("username"));
		System.out.println(USERNAME.getDomAttribute("id"));
		System.out.println(USERNAME.getDomProperty("id"));
		WebElement password = driver.findElement(By.name("pwd"));
		System.out.println(password.getDomProperty("hidden"));
		System.out.println(password.getDomProperty("nodeName"));
		System.out.println(password.getDomProperty("name"));
		
	    /*//getAttributeName();
		WebElement data1=driver.findElement(By.xpath("//a[@id='loginButton']"));
		System.out.println(data1.getAccessibleName());
		WebElement checkbox1 = driver.findElement(By.xpath("//input[@type='checkbox']"));
		System.out.println(checkbox1.getAccessibleName());*/
		
		/*//getText();
		driver.get("https://www.amazon.in");
	    WebElement data2 = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	    data2.sendKeys("iphone");
	    data2.submit();
	    driver.findElement(By.xpath("(//span[text()='1,19,999'])[1]")).getText();
	    String data1 = driver.findElement(By.xpath("(//span[text()='1,19,999'])[1]")).getText();
	    System.out.println(data1);*/

	  
	    
		

	}

}
