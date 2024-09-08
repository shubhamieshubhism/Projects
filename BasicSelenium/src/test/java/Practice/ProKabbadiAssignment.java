package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProKabbadiAssignment {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.google.com");
	    driver.manage().window().maximize();
	    Thread.sleep(1000);
	   // driver.findElement(By.xpath("//button[.='Stay signed out']")).click();
	    WebElement searchbar = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
	    searchbar.sendKeys("pro kabaddi points table 2022");
	    searchbar.submit();
	    Thread.sleep(1000);
	    String teamname = "Bengaluru Bulls";
	    System.out.println(teamname);
	    /*String gp = "22";
	    String win = "13";
	    String loss = "8";
	    String draw = "1";
	    String pd = "39";
	    String pts = "74";*/
	    
	    Thread.sleep(1000);
	    //team name and gp
	    driver.findElement(By.xpath("(//span[.='"+teamname+"'])[2]")).click();
	    
	    //team name and win
	    //driver.findElement(By.xpath("(//span[text()='"+teamname+"'])[2]/ancestor::tr[@class='tsp-trtb tsp-rr tsp-cbd tsp-hbd']/descendant::span[text()='"+win+"']"));
        //team name and loss
	    //driver.findElement(By.xpath("(//span[text()='"+teamname+"'])[2]/ancestor::tr[@class='tsp-trtb tsp-rr tsp-cbd tsp-hbd']/descendant::span[text()='"+loss+"']"));
	    //team name and draw
	    //driver.findElement(By.xpath("(//span[text()='"+teamname+"'])[2]/ancestor::tr[@class='tsp-trtb tsp-rr tsp-cbd tsp-hbd']/descendant::span[text()='"+draw+"']"));
	    //team name and pd
	    //driver.findElement(By.xpath("(//span[text()='"+teamname+"'])[2]/ancestor::tr[@class='tsp-trtb tsp-rr tsp-cbd tsp-hbd']/descendant::span[text()='"+pd+"']"));
	    //team name and pts
	    //driver.findElement(By.xpath("(//span[text()='"+teamname+"'])[2]/ancestor::tr[@class='tsp-trtb tsp-rr tsp-cbd tsp-hbd']/descendant::span[text()='"+pts+"']"));
	
	
	
	
	
	
	
	}

}
