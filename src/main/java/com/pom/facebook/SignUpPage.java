package com.pom.facebook;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.facebook.BasePage;
import com.generics.facebook.ExcelLibrary;
import com.generics.facebook.Helper;


public class SignUpPage extends BasePage
{
	public WebDriver driver;
	@FindBy(xpath = "//input[@name='firstname']")
	  private WebElement firstnameTextfield;
	
	@FindBy(xpath = "//input[@name='lastname']")
	  private WebElement surnameTextfield;
	
	@FindBy(xpath = "//input[@aria-label='Mobile number or email address']")
	  private WebElement emailTextfield;
	
	@FindBy(xpath = "//input[@autocomplete='new-password']")
	  private WebElement passwordTextfield;
	
	@FindBy(xpath = "//select[@aria-label='Day']")
	  private List<WebElement> dayDropdown;
	
	@FindBy(xpath = "//select[@aria-label='Month']")
	  private List<WebElement> monthDropdown;
	
	@FindBy(xpath = "//select[@aria-label='Year']")
	  private List<WebElement> yearDropdown;
	
	@FindBy(xpath = "(//input[@name='sex'])[2]")
	  private WebElement maleRadiobutton;
	
	@FindBy(xpath = "//button[@name='websubmit']")
	  private WebElement signupbutton;
	private WebElement day;
	private WebElement month;
	private WebElement year;
	
	public SignUpPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void signupMethod() throws IOException, InterruptedException
	{
		Helper.highlightelement(driver,firstnameTextfield);
		firstnameTextfield.sendKeys(ExcelLibrary.getcellvalue("SignUp",1,0));
		Helper.highlightelement(driver,surnameTextfield);
		surnameTextfield.sendKeys(ExcelLibrary.getcellvalue("SignUp",1,1));
		Thread.sleep(2000);
		Helper.highlightelement(driver,emailTextfield);
		emailTextfield.sendKeys(ExcelLibrary.getcellvalue("SignUp",1,2));
		Thread.sleep(2000);
		Helper.highlightelement(driver,passwordTextfield);
		passwordTextfield.sendKeys(ExcelLibrary.getcellvalue("SignUp",1,3));
		Thread.sleep(2000);
		selectbyvalue(day,"8");
		selectbyvisibletext(month,"Jun");
		selectbyvalue1(year,"1992");
		Thread.sleep(2000);
		maleRadiobutton.click();
		Thread.sleep(2000);
		signupbutton.click();
	}

	
}
