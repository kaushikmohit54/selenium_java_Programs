package retryLogic;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class Myclass {
	
	@Test(retryAnalyzer=retryLogic.RetryAnalyzer.class)
	public void test1() {
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(false, true);
	}
}
