package Test;

import org.testng.annotations.Test;

import PageObject.Base;
import PageObject.SimpleForm;



public class MessageVerify extends Base {
	
	SimpleForm s1;
	@Test
	public void test1()
	{
		
	s1=new SimpleForm(driver);
	//log.info("Running Test1");
	s1.option();
	//log.info("test 1 successfully completed");
	//helperClass.captureScreenshots(driver);
	//logger.pass("MessageVerified Test  Completed");
	}

}
