package obeject_Repositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic_utilities.WebDriverUtility;

public class HomePage extends WebDriverUtility{
	@FindBy(linkText = "Organizations")
	private WebElement organizationLink;
	
	@FindBy(linkText = "Contacts")
	private WebElement contactLink;
	
	@FindBy(linkText = "Products")
	private WebElement productLink;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement administrationImg;
	
	@FindBy(linkText = "Sign Out")
	private WebElement signoutLink;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getOrganizationLink() {
		return organizationLink;
	}

	public WebElement getContactLink() {
		return contactLink;
	}

	public WebElement getProductLink() {
		return productLink;
	}

	public WebElement getAdministrationImg() {
		return administrationImg;
	}

	public WebElement getSignoutLink() {
		return signoutLink;
	}
	
	public void clickOnContactLink() {
		contactLink.click();
	}
	public void clickOnOrganization() {
		organizationLink.click();
	}
	
	public void logoutOfApp(WebDriver driver) throws InterruptedException {
		mouseHoveringcAtion(driver, administrationImg);
		Thread.sleep(1000);
		signoutLink.click();
	}

}
