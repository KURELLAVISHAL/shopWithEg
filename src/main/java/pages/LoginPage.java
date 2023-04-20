package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.DriverFactory;

public class LoginPage extends DriverFactory{
	
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//p[text()='login']")
	public WebElement loginButton;
	
	@FindBy(xpath="//input[@name='email']")
	public WebElement emailId;
	
	@FindBy(xpath="//input[@name='password']")
	public WebElement password;
	
	public void clickLoginButton()
	{
		wait.until(ExpectedConditions.visibilityOf(loginButton));
		loginButton.click();
	}
	
	public void enterEmail()
	{
		wait.until(ExpectedConditions.visibilityOf(emailId));
		emailId.sendKeys("test@test.com");
	}
	
	public void enterPassword()
	{
		wait.until(ExpectedConditions.visibilityOf(password));
		password.sendKeys("test123");
	}

}
