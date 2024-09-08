package FrameWork;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertEx {
	
	

	@Test
	public void m1()
	{
		System.out.println("step1");
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(false, false);
		System.out.println("step2");
		System.out.println("step3");
		System.out.println("step4");
		System.out.println("step5");
		soft.assertAll();
	}
	@Test
	public void m2()
	{
		String exp = "shubham";
		String act = "shubham";
		//Assert.assertEquals(exp, act);
		SoftAssert soft1 = new SoftAssert();
		soft1.assertEquals(exp, act);
		soft1.assertAll();
	}

}
