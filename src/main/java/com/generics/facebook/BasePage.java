package com.generics.facebook;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.apache.poi.ss.formula.functions.Index;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BasePage 
{
  public void gettitle(WebDriver driver)
  {
	  System.out.println(driver.getTitle());
  }
  
  public void selectbyvalue(WebElement el,String no)
  {
	  Select sel=new Select(el);
	  sel.selectByValue(no);
  }
  
  public void selectbyvisibletext(WebElement ele,String text)
  {
	  Select sel1=new Select(ele);
	  sel1.selectByVisibleText(text);
  }
  
  public void selectbyvalue1(WebElement el1,String n)
  {
	  Select sel2=new Select(el1);
	  sel2.selectByValue(n);
  }
  
  public void movetoelement(WebDriver driver,WebElement ele)
  {
	  Actions act=new Actions(driver);
	  act.moveToElement(ele).perform();	  
  }
  
  public void robottab() throws AWTException
  {
	  Robot r=new Robot();
	  r.keyPress(KeyEvent.VK_TAB);
	  r.keyRelease(KeyEvent.VK_TAB);
  }
  
  public void alertok(WebDriver driver)
  {
	  Alert alt=driver.switchTo().alert();
	  alt.accept();
  }
  
	/*
	 * public void javascriptexecutor(WebDriver driver, WebElement ele) {
	 * JavaScriptExecutor js=(JavaScriptExecutor)driver;
	 * js.executeScript("arguments[int].click",ele); }
	 */
}
