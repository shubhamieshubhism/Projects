package obeject_Repositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactInfoPage {
	
	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement contactHeaderText;
	
	public ContactInfoPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getContactHeaderText() {
		return contactHeaderText;
	}
	
	public String getHeaderText() {
		return contactHeaderText.getText();
	}

}
