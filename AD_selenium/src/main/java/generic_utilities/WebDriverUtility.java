package generic_utilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

/**
 * This class consist of all generic methods related to the web driver actions
 */

public class WebDriverUtility {
	/**
	 * This method will maximize the window
	 * 
	 * @param driver
	 */
	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();

	}

	/**
	 * This method will minimize the window
	 * 
	 * @param driver
	 */
	public void minimizeWindow(WebDriver driver) {
		driver.manage().window().minimize();
	}

	/**
	 * This method will wait for page to load
	 * 
	 * @param driver
	 */
	public void waitForPafgeLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	/**
	 * This method will wait for a particular element to be visible in the DOM
	 * 
	 * @param driver
	 * @param element
	 */
	public void waitForElementToBeVisible(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	/**
	 * This method will handle dropdown by index
	 * 
	 * @param element
	 * @param index
	 */
	public void handleDropDown(WebElement element, int index) {
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}

	/**
	 * This method will handle drop down by using string
	 * 
	 * @param element
	 * @param value
	 */
	public void handleDropDown(WebElement element, String value) {
		Select sel = new Select(element);
		sel.selectByValue(value);
	}

	/**
	 * This method will handle drop down by using value.
	 * 
	 * @param value
	 * @param element
	 */
	public void handleDropDown(String value, WebElement element) {
		Select sel = new Select(element);
		sel.selectByValue(value);
	}

	/**
	 * This method will perform mouse hobering action
	 * 
	 * @param driver
	 * @param element
	 */
	public void mouseHoveringcAtion(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();;
	}

	/**
	 * This method will move the cursor based on offset and click on web page
	 * 
	 * @param driver
	 */
	public void moveAndClick(WebDriver driver) {
		Actions act = new Actions(driver);
		act.moveByOffset(10, 10).click().perform();

	}

	/**
	 * This method will perform right click
	 * 
	 * @param driver
	 */
	public void rightClickAction(WebDriver driver) {
		Actions act = new Actions(driver);
		act.contextClick().perform();
	}

	/**
	 * This methos will perform the double click action
	 * 
	 * @param driver
	 */
	public void doubleClickAction(WebDriver driver) {
		Actions act = new Actions(driver);
		act.doubleClick().perform();;
	}
    /**
     * This method will handle drag and drop action
     * @param driver
     * @param scrEle
     * @param dstEle
     */
	public void dragAndDropAction(WebDriver driver, WebElement scrEle, WebElement dstEle ) {
		Actions act = new Actions(driver);
		act.dragAndDrop(scrEle, dstEle).perform();
	}
	
	/**
	 * This method will handle frame by index
	 * @param driver
	 * @param index
	 */
	public void switchToFrame(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}
	
	/**
	 * This method will handle frame by name or id
	 * @param driver
	 * @param NameOrID
	 */
	public void switchToFrame(WebDriver driver, String NameOrID) {
		driver.switchTo().frame(NameOrID);
	}
	
	/**
	 * This method will handle frame by web element
	 * @param driver
	 * @param element
	 */
	public void switchToFrame(WebDriver driver,WebElement element) {
		driver.switchTo().frame(element);
	}
	
	/**
	 * This method will handle the scroll down action by 500 units
	 * @param driver
	 */
	public void scrollDownAction(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollby(0,500);","");
	}
	
	/**
	 * This method will handle the scroll up action by 500 untis
	 * @param driver
	 */
	public void scrollUpAction(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,-500)", "");
	}
	
	/**
	 * This method will accept the alet 
	 * @param driver
	 */
    public void acceptAlert(WebDriver driver) {
    	driver.switchTo().alert().accept();
    }
    
   
   /**
    * This method will cancel the alert popup 
    * @param driver
    */
    public void cancelAlert(WebDriver driver) {
    	driver.switchTo().alert().dismiss();
    }
    
    /**
     * This method will get the text of alert popup
     * @param driver
     */
    public void getAlertText(WebDriver driver) {
    	driver.switchTo().alert().getText();
    }
    
    /**
     * This method will capture screenShots 
     * @param driver
     * @param ScreeenshotName
     * @return
     * @throws IOException
     */
    public String captureScreenShot(WebDriver driver, String ScreeenshotName) throws IOException {
    	TakesScreenshot ts = (TakesScreenshot)driver;
    	File src = ts.getScreenshotAs(OutputType.FILE);
    	File dst = new File(".\\Screenshot\\"+ScreeenshotName+".png");
    	Files.copy(src, dst);
    	return dst.getAbsolutePath();
    	
    }
    
    /**
     * This method will switch from one window to another window
     * @param driver
     * @param partialWinTitle
     */
    public void switchWindow(WebDriver driver, String partialWinTitle) {
    	//step 1 get all windows
    	Set<String> allWinIDs = driver.getWindowHandles();
    	//step 2 navigate through each window
    	for (String winID : allWinIDs) {
    		//step 3 switch to each window and capture the title
    		String actTitle = driver.switchTo().window(winID).getTitle();
    		//step 4 compare act title with expected partial title
    	    if(actTitle.contains(partialWinTitle)) {
    	    	break;
    	    }
			
		}
    }
    
    
	
}
