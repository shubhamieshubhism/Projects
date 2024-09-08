package FrameWork;

import org.testng.annotations.Test;


public class ImpmentTest {

	
	
	/*Dependancy
	@Test(priority = 2)
	public void createContact()
	{
	  System.out.println("contact creted");
	}
	
	//@Test(priority = 1)
	@Test(dependsOnMethods = "createContact" )
	public void modifyContact()
	{
		System.out.println("Contact Modified");
	}
	//@Test(priority = 3)
	@Test(dependsOnMethods = "createContact")
	public void deleteContact()
	{
		System.out.println("Contact Deleted");
	}*/
	
	/*//invocation
	//to execute same method for multiple times
	public void createContact()
	{
	  System.out.println("contact creted");
	}
	public void modifyContact()
	{
		System.out.println("Contact Modified");
	}
	public void deleteContact()
	{
		System.out.println("Contact Deleted");
	}*/
	
	
	
	//enabled--> it will use to leave the method 
	//or not to execute that method
	//by using enable= false.
	@Test(priority = 2)
	public void createContact()
	{
	  System.out.println("contact creted");
	}
	

	@Test(enabled = false)
	public void modifyContact()
	{
		System.out.println("Contact Modified");
	}
	//@Test(priority = 3)
	@Test(dependsOnMethods = "createContact")
	public void deleteContact()
	{
		System.out.println("Contact Deleted");
	}
	
	
}
