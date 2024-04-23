package appfeatures;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import qa.DriverFactory;
import qa.DriverFactory2;
import utility.ConfigLoader;

public class ApplicationHooks {
	DriverFactory2 df;
	
	WebDriver driver;
	
	@Before
	public void launchBrowser() throws IOException
	{
		df = new DriverFactory2();
		
		String configBrowser = ConfigLoader.readConfigData("browser");
		
		String mavenCommandBrowser = System.getProperty("clibrowser");
		
		String environment = System.getProperty("env");
		
		System.out.println(environment);
		
		if(mavenCommandBrowser!=null)
		{
			configBrowser= mavenCommandBrowser;
		}
		
		driver = df.initBrowser(configBrowser);
		
		driver.manage().window().maximize();
	
	}
	
	@After(order = 2)
	public void tearDown(Scenario scenario)
	{
		if(	scenario.isFailed())
		{
			String nameOfScenario = scenario.getName();
			
			String ScenarioName = nameOfScenario.replace(" ", "_");
			
			TakesScreenshot ts = (TakesScreenshot)driver;
			
		 byte[] source = ts.getScreenshotAs(OutputType.BYTES);
		 
		 scenario.attach(source, "image/png", ScenarioName);
			
		}
	}
	
	@After(order = 1)
	public void closingBrowser()
	{
		driver.quit();
	}
	

}
