package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Fieldmarketing.Constant;


public class Signinobjects {
	
	private static  WebElement element = null;
	
  public static WebElement username(WebDriver driver) {
	  
	  element = driver.findElement(By.id(Constant.username));
	  
	  return element;
	  
  }
  
  public static WebElement password(WebDriver driver) {
	  
	  element = driver.findElement(By.id(Constant.password));
	  
	  return element;
	  
  }
  
  public static WebElement Signin(WebDriver driver) {
	  
	  element = driver.findElement(By.xpath(Constant.Signin));
	  
	  return element;
	  
  }
  
  public static WebElement Forgotpassword(WebDriver driver) {
	  
	  element = driver.findElement(By.xpath(Constant.Forgotpasswordsignin));
	  
	  return element;
	  
  }
  

}
