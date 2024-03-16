package Seleleniumproject.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signinpage {

	WebDriver driver;

	public signinpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);




	}

	@FindBy(css="input[type='text']")

	WebElement mobilenumber;

	@FindBy(css="input[type='password']")

	WebElement password;

	@FindBy(xpath="//button[normalize-space()='Sign In']")

	WebElement button;



  public void LogInPage(String number,String pass )
  
  {
	
	  
	  mobilenumber.sendKeys(number);
	  
	  password.sendKeys(pass);
	  
	  button.click();
	  
	  
	  
  }

  public void GoTo()
  {
	  driver.get("https://reeldrama-testweb.revlet.net/auth/signin");
  }
}


