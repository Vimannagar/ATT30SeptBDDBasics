package qa;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverFactory2 {

	static WebDriver driver;
	

	public WebDriver initBrowser(String browser) throws MalformedURLException {
		Capabilities capabilities;
		if (browser.equalsIgnoreCase("Chrome")) {
			
			capabilities = new ChromeOptions();
			
		} else  {
			capabilities = new FirefoxOptions();
		}
		
		driver = new RemoteWebDriver(new URL("http://18.212.195.230:4444/wd/hub"), capabilities);
		return driver;
	}

	public static WebDriver getDriver() {
		return driver;
	}

}
