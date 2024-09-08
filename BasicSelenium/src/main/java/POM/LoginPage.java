package POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		//this key word ==> will be holding the address of that  
		//object which is created in heap area
	}
	
	
	
	
	
	
	
	//declaration 
	@FindBy(id="username")
	private WebElement UserTextFeild;
	
	@FindBy(className="pwdfield")
	private WebElement PasswordField;
	
	@FindBy(id="loginButtonContainer")
	private WebElement LoginButton;
	
	//getterMethods

	public WebElement getUserTextFeild() {
		return UserTextFeild;
	}

	public WebElement getPasswordField() {
		return PasswordField;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}
	
	//to reduce the number of lines we will create
	//bussiness logic
	
	public void loginToApp(String username,String pass)
	{
		UserTextFeild.sendKeys(username);
		PasswordField.sendKeys(pass);
		LoginButton.click();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
