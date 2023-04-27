package utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {
	
	public static WebDriver driver;
	
	public void init()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		driver=new ChromeDriver(options);
	}

}
