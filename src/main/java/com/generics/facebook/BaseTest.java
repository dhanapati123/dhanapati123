package com.generics.facebook;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.pom.facebook.LoginPage;
import com.pom.facebook.SignUpPage;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseTest implements AutoConstant
{
  public WebDriver driver;
  
  @BeforeClass
  public void setup()
  {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.get(url);
  }
  
  @BeforeMethod
  public void login() throws InterruptedException, IOException
  {
	   LoginPage login=new LoginPage(driver);
	   login.createnewaccountMethod();;
  }
  
  @AfterMethod
  public void signup() throws IOException, InterruptedException
  {
	  SignUpPage sign=new SignUpPage(driver);
	  sign.signupMethod();;   
  }
  
  @AfterClass
  public void teardown()
  {
	   driver.quit();
  }
}
