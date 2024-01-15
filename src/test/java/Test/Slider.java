package Test;

import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


import PageObject.Base;
import PageObject.SliderTest;


public class Slider extends Base {
	
	@Test
	public void SliderbarTest() throws InterruptedException
	{
		SliderTest sl=new SliderTest(driver);
		sl.DragAndDrop();
		//log.info("Slider test is Started");
		//sl.slider();
		//log.info("Slider test is completed");
		//helperClass.captureScreenshots(driver);	
		//logger.pass("Slider Test  Completed");
	}
	

}
