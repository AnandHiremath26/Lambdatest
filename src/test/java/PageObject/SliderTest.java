package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SliderTest {
	RemoteWebDriver ldriver;
	
	public  SliderTest(RemoteWebDriver driver) 
	{
		ldriver=driver;
		PageFactory.initElements(driver,this);

	}
	@FindBy(xpath="//a[contains(text(),'Drag & Drop Sliders')]")
	WebElement dd;

	@FindBy(xpath="//output[@id='rangeSuccess']")
	WebElement slider;



	public void DragAndDrop() throws InterruptedException

	{
		dd.click();
		Thread.sleep(5000);
		WebElement element=ldriver.findElement(By.xpath("//div[@id='slider1']//input"));
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		//WebDriverWait wait = new WebDriverWait(ldriver,10);
		//wait.until(ExpectedConditions.elementToBeClickable(dd)).click();;
		//dd.click();
Thread.sleep(5000);
		
	}
	public void slider()
	{
slider.click();
		Actions ac=new Actions(ldriver);
		ac.dragAndDropBy(slider, 95,15).perform();
		System.out.println(slider.getText());
	}

}
