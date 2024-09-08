package obeject_Repositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic_utilities.WebDriverUtility;

public class CreateNewContact extends WebDriverUtility {
	
	@FindBy(name = "lastname")
	private WebElement lastNameEdt;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;
	
	@FindBy(xpath = "(//img[@title='Select'])[1]")
	private WebElement orgLookUpImg;
	
	@FindBy(name = "search_text")
	private WebElement orgSearchEdt;
	
	@FindBy(name = "search")
	private WebElement orgSearchBtn;
	
	public CreateNewContact(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getLastNameEdt() {
		return lastNameEdt;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public WebElement getOrgLookUpImg() {
		return orgLookUpImg;
	}

	public WebElement getOrgSearchEdt() {
		return orgSearchEdt;
	}

	public WebElement getOrgSearchBtn() {
		return orgSearchBtn;
	}
	
	/**
	 * This method will create new contact with mandatory feild
	 * @param LASTNAME
	 */
	public void createNewContact(String LASTNAME) {
		lastNameEdt.sendKeys(LASTNAME);
		saveBtn.click();
	}
	public void createNewContact(WebDriver driver, String LASTNAME,String ORGNAME) {
		lastNameEdt.sendKeys(LASTNAME);
		orgLookUpImg.click();
		switchWindow(driver,"Accounts");
		orgSearchBtn.sendKeys(ORGNAME);
		orgSearchBtn.click();
		driver.findElement(By.xpath("//a[.='"+ORGNAME+"']"));
		switchWindow(driver, "Contacts");
		saveBtn.click();
	}
	
	
	

	
}
