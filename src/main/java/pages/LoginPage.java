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
	
	
	
	@FindBy(xpath="//input[@name='email']")
	public WebElement emailId;
	
	@FindBy(xpath="//input[@name='password']")
	public WebElement passwordTexbox;
	
	@FindBy(xpath="//p[text()='Invalid Credentials.']")
	public WebElement invlaidCredentialErrorMessage;
	
	@FindBy(xpath="//p[text()='Must enter an email address']")
	public WebElement blankUserNameErrorMessage;
	
	@FindBy(xpath="//p[text()='Enter your password']")
	public WebElement blankPasswordErrorMessage;
	
	@FindBy(xpath="//p[text()='sign in']/parent::button")
	public WebElement signInButton;
	

	
	public void clickSignInButton()
	{
		wait.until(ExpectedConditions.visibilityOf(signInButton));
		signInButton.click();
	}
	
	public void enterInvalidEmail(String email)
	{
		wait.until(ExpectedConditions.visibilityOf(emailId));
		emailId.sendKeys(email);
	}
	
	public void enterInvalidPassword(String password)
	{
		wait.until(ExpectedConditions.visibilityOf(passwordTexbox));
		passwordTexbox.sendKeys(password);
	}
	
	public void enterBlankEmail()
	{
		wait.until(ExpectedConditions.visibilityOf(emailId));
		emailId.sendKeys("");
	}
	
	public void enterBlankPassword()
	{
		wait.until(ExpectedConditions.visibilityOf(passwordTexbox));
		passwordTexbox.sendKeys("");
	}
	
	
	public void verifyBlankErrorMessage()
	{
		wait.until(ExpectedConditions.visibilityOf(blankUserNameErrorMessage));
		System.out.println(blankUserNameErrorMessage.isDisplayed());
		System.out.println(blankPasswordErrorMessage.isDisplayed());
	}
	
	
	public void verifyInvlidErrorMessage()
	{
		wait.until(ExpectedConditions.visibilityOf(invlaidCredentialErrorMessage));
		System.out.println(invlaidCredentialErrorMessage.isDisplayed());
	}

}
