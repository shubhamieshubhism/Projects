package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InstagramLogin {
	
	
	public InstagramLogin(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@name='username']")
	private WebElement IGUserTextFeild;
	@FindBy(xpath="//input[@name='password']")
	private WebElement IGPassword;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement IGLoginbuootn;
	public WebElement getIGUserTextFeild() {
		return IGUserTextFeild;
	}
	public WebElement getIGPassword() {
		return IGPassword;
	}
	public WebElement getIGLoginbuootn() {
		return IGLoginbuootn;
	}
	public void loginIGApp(String username,String password)
	{
		IGUserTextFeild.sendKeys(username);
		IGPassword.sendKeys(password);
		IGLoginbuootn.click();
	}

}
