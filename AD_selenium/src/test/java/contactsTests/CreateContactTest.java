package contactsTests;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import generic_utilities.ExcelFileUtility;
import obeject_Repositories.ContactInfoPage;
import obeject_Repositories.ContactPage;
import obeject_Repositories.HomePage;
import objectRepository.CreateNewContactPage;
@Listeners(generic_utilities.listenerImplimentationClass.class)
public class CreateContactTest extends BaseClass{
	@Test
	public void createContact() throws EncryptedDocumentException, IOException {
		ExcelFileUtility eutil=new ExcelFileUtility();
		String ORGNAME = eutil.readDataFromExcel("Contact", 7, 2) + jUtil.getRandomNumber();
		String LASTNAME = eutil.readDataFromExcel("Contact", 1, 2);
		
		HomePage hp =new HomePage(driver);
		hp.clickOnContactLink();
		Reporter.log("clicked on contact link");
		
		ContactPage cp = new ContactPage(driver);
		cp.clickOnCreateContactLookUpImg();
		Reporter.log("clicked on the contact look up image");
		
		CreateNewContactPage cncp = new CreateNewContactPage(driver);
		cncp.createNewContact(LASTNAME);
		Reporter.log("contact created successfully");
		
		ContactInfoPage cip = new ContactInfoPage(driver);
		String contactHeader=cip.getHeaderText();
		Reporter.log("Header Captured");
		
		Assert.assertTrue(contactHeader.contains(LASTNAME));
		Reporter.log("header validated");
		System.out.println(contactHeader);
	}
	
	

}
