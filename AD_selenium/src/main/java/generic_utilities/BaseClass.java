package generic_utilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import obeject_Repositories.HomePage;
import obeject_Repositories.LoginPage;

/**
 * This class consist of all basic configurations Annotations of testNG
 * @author SHUBHAM TIRPUDE
 */
public class BaseClass {
	public PropertyFileUtility putil= new PropertyFileUtility();
	public ExcelFileUtility eutil=new ExcelFileUtility();
	public Javautility jutil=new Javautility();
	public WebDriverUtility wutil=new WebDriverUtility();
	
	public WebDriver driver =null;
	
	public static WebDriver sdriver;
	
	@BeforeSuite(alwaysRun = true)
	public void bsConfig() {
		System.out.println("--BD Connection Successful--");
	}
	
	@BeforeClass(alwaysRun = true)
	public void bcConfig() throws IOException {
		String BROWSER=putil.readDataFromPropertyFile("browser");
		String URL=putil.readDataFromPropertyFile("url");
		
		if(BROWSER.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			System.out.println(BROWSER+"--launched--");
		}else if(BROWSER.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			System.out.println(BROWSER+"--launched--");
		}else if(BROWSER.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			System.out.println(BROWSER+"--launched--");
		}else {
			System.out.println("Invalid Browser Name");
		}
		
		wutil.maximizeWindow(driver);
		wutil.waitForPafgeLoad(driver);
		
		sdriver=driver;
		driver.get(URL);
	}
	
	@BeforeMethod(alwaysRun = true)
	public void bmConfig() throws IOException {
		String USERNAME=putil.readDataFromPropertyFile("username");
		String PASSWORD=putil.readDataFromPropertyFile("password");
		LoginPage lp=new LoginPage(driver);
		lp.loginToApp(USERNAME, PASSWORD);
		System.out.println("--login successfully--");
	}
	
	@AfterMethod(alwaysRun = true)
	public void amConfig() throws InterruptedException {
		HomePage hp = new HomePage(driver);
		hp.logoutOfApp(driver);
		System.out.println("--logout successfully--");
	}
	
	@AfterClass(alwaysRun = true)
	public void acConfig() {
		driver.quit();
		System.out.println("--Browser Closed--");
	}
	
	@AfterSuite(alwaysRun = true)
	public void asConfig() {
		System.out.println("--DB Connection Closed--");
	}
	

}
