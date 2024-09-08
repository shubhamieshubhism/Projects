package obeject_Repositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationInfoPage {
	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement orgheaderText;
	
	public OrganizationInfoPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getOrgheaderText() {
		return orgheaderText;
	}
	
	
	public String getHeaderText() {
		return orgheaderText.getText();
	}

}
