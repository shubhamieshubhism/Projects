package obeject_Repositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic_utilities.WebDriverUtility;

public class CreateNewOrganization extends WebDriverUtility {
	@FindBy(name = "accountname")
	private WebElement orgNameEdt;
	
	@FindBy(name = "industry")
	private WebElement industryDropDown;
	
	@FindBy(name = "accounttype")
	private WebElement typeDropDown;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;
	
	public CreateNewOrganization(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getOrgNameEdt() {
		return orgNameEdt;
	}

	public WebElement getIndustryDropDown() {
		return industryDropDown;
	}

	public WebElement getTypeDropDown() {
		return typeDropDown;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	/**
	 * This methos will create new organization with 
	 * mandatory feilds
	 * @param ORGNAME
	 */
	public void creaeNewOrganization(String ORGNAME) {
		orgNameEdt.sendKeys(ORGNAME);
		saveBtn.click();
	}
	
	/**
	 * THis methos will create new organization with industry drop down
	 * @param ORGNAME
	 * @param INDUSTRY
	 */
	public void creaeNewOrganization(String ORGNAME,String INDUSTRY) {
		orgNameEdt.sendKeys(ORGNAME);
		handleDropDown(INDUSTRY, industryDropDown);
		saveBtn.click();
	}
	
	public void creaeNewOrganization(String ORGNAME,String INDUSTRY,String TYPE) {
		orgNameEdt.sendKeys(ORGNAME);
		handleDropDown(INDUSTRY, industryDropDown);
		handleDropDown(TYPE, industryDropDown);
		saveBtn.click();
	}

}
