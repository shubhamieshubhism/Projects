package FrameWork;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertEx {

	@Test
	public void m1()
	{
		System.out.println("step1");
		Assert.assertEquals(false, false);
		System.out.println("step2");
		System.out.println("step3");
		System.out.println("step4");
		System.out.println("step5");
	}
	@Test
	public void m2()
	{
		String exp = "shubham";
		String act = "shubham";
		Assert.assertEquals(exp, act);
	}
}
