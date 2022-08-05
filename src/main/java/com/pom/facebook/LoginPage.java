package com.pom.facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
  @FindBy(xpath = "//a[.='Forgotten password?']")
  private WebElement forgottenpasswordLink;
  
  @FindBy(xpath = "//a[.='Create New Account']")
  private WebElement createnewaccountLink;
  
  @FindBy(xpath = "//a[.='Create a Page']")
  private WebElement createapageLink;
  
  public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
  
  public void forgotpasswordMethod()
	{
	  forgottenpasswordLink.click();
	}
  
  public void createnewaccountMethod() 
  {
	  createnewaccountLink.click();  
  }
  
  public void createapageMethod() 
  {
	  createapageLink.click();  
  }
  
}
