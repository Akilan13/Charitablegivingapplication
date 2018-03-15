package pageobjects;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import Fieldmarketing.Constant;
import log4j.Log;


public class Applysupport {
	
	
	public static WebElement element = null;
	
	
	public static WebElement Zip(WebDriver driver) {
		try {
		
		element = driver.findElement(By.id(Constant.Zipcode));
		Log.info("Zipcode field present in Apply for support page");
		}catch(NoSuchElementException e) {
			
			Log.error("Zipcode field not present in Apply for support page");
			throw e;
		}
		 return element;
	}

	
	public static WebElement Date (WebDriver driver) {
		
		try {
		
		element = driver.findElement(By.id(Constant.Applyforsupport_date));
		
		Log.info("Decision date field is present in Apply for support page");
		}catch (NoSuchElementException e) {
			
			Log.error("Decision date field is not present in Apply for support page");
			throw e;
		}
		return element;
	}
	
	public static WebElement Dropdown (WebDriver driver) {
		try {
		
		element = driver.findElement(By.id(Constant.Applyforsupport_date_SupportType));
		
		Log.info("Support type dropdown is present in apply for suppor page");
		
		}catch(NoSuchElementException e) {
			
		Log.error("Support type dropdown is not present in apply for suppor page");
			throw e;
		}
		return element;
	}
	
	
	
	public static WebElement Applybutton(WebDriver driver) {
		
	try {
		element = driver.findElement(By.xpath(Constant.Applyforsupportbtn));
		
		Log.info("Submit button is present in apply for support page");
		
	}catch (NoSuchElementException e) {
		Log.error("Submit button is not present in apply for support page");
		throw e;
	}
		return element;
		
	}
	
	
	public static WebElement Signin(WebDriver driver) {
		
		try {
		element = driver.findElement(By.xpath(Constant.Signinbtn));
		Log.info("Signin button is present in apply for support page");
		}catch (NoSuchElementException e) {
			Log.error("Signin button is not present in apply for support page");
			throw e;
		}
		return element;
		
		
	}
	


	public static WebElement forgotpasswordlink(WebDriver driver) {
		try {
		
		element = driver.findElement(By.xpath(Constant.Forgotpasswordlink));
		Log.info("Forgot password link is present in Apply for support page");
		}catch (NoSuchElementException e) {
			Log.error("Forgot password link is not present in Apply for support page");
			throw e;
		}
		return element;
		
	}



	
	
	
}
