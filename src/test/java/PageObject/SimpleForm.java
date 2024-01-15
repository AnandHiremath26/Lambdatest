package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SimpleForm {
public String actualtext="Welcome to LambdaTest";
	
RemoteWebDriver ldriver;
	public SimpleForm(RemoteWebDriver driver) 
	{
		ldriver=driver;
		PageFactory.initElements(driver,this);
		
}
	@FindBy(xpath="//a[contains(text(),'Simple Form Demo')]")
	WebElement simple;
	
	@FindBy(xpath="	//input[@id='user-message']")
	WebElement textbar;
	
	
	@FindBy(xpath="//button[@id='showInput']")
	WebElement button;
	
	@FindBy(xpath="//p[@id='message']")
	WebElement message;
	
	public void option()
	{
		simple.click();
		textbar.sendKeys(actualtext);
	
		button.click();
		System.out.println("Actual message is :"+actualtext);
		String expected=message.getText();
		System.out.println("expected message is :"+expected);
		Assert.assertEquals(actualtext, expected);
		System.out.println("expected result is equal to Actual text");
		
	}

	
}


