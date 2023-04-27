package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.DriverFactory;

public class LandingPage extends DriverFactory{
	
WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	
	public LandingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//p[text()='login']")
	public WebElement loginButton;
	
	public void clickLoginButton()
	{
		wait.until(ExpectedConditions.visibilityOf(loginButton));
		loginButton.click();
	}

}
