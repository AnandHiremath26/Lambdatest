package PageObject;


import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;
import java.net.MalformedURLException;



import org.testng.annotations.*;

public class Base {


	public RemoteWebDriver driver;
	public String username = "anandhiremath728";
	public String accessKey = "34dvpjOeGAAGMAWWW5H5z03Z1IbwZUNFfqMFglOpmpXD3xaPhx";
	public String gridURL = "https://www.lambdatest.com/selenium-playground";
	boolean status = false;

	@BeforeClass
	@Parameters(value={"browser","version","platform"})
	public void setUp(String browser, String version, String platform) throws Exception {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("browserName", browser);
		capabilities.setCapability("version", version);
		capabilities.setCapability("platform", platform); // If this cap isn't specified, it will just get the any available one
		capabilities.setCapability("build", "LambdaTestSampleApp");
		capabilities.setCapability("name", "LambdaTestJavaSample");
		capabilities.setCapability("network", true); // To enable network logs
		capabilities.setCapability("visual", true); // To enable step by step screenshot
		capabilities.setCapability("video", true); // To enable video recording
		capabilities.setCapability("console", true);

		try {
			driver = new RemoteWebDriver(new URL("https://" + username + ":" + accessKey + "@hub.lambdatest.com/wd/hub"), capabilities);
			System.out.println(driver);
		} catch (MalformedURLException e) {
			System.out.println("Invalid grid URL");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		driver.get("https://www.lambdatest.com/selenium-playground");}

	
	@AfterClass
	public void tearDown() {
		//driver.executeScript("lambda-status=" + Status);
		driver.quit();
	}
}
