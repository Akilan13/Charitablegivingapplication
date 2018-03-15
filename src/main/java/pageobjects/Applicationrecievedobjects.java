package pageobjects;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import Fieldmarketing.Constant;
import log4j.Log;

public class Applicationrecievedobjects {
	
	public static WebElement element = null;
	

	public static WebElement Viewaccount(WebDriver driver) {
		try {
			element = driver.findElement(By.xpath(Constant.viewaccount));
			Log.info("Viewaccount element is displayed");
		}catch(NoSuchElementException e) {
			Log.error("View account element not found in application recieved page");
			throw e;
		}
		return element;
			}
	
	
	public static WebElement signout(WebDriver driver) {
try {
	
		element = driver.findElement(By.xpath(Constant.viewaccount));
		
		}catch(NoSuchElementException e)	{
			Log.error("Signout button not found in Application recieved page");
			throw e;
		}
		return element;
		
	}
	
	public static WebElement Submitnewapplication(WebDriver driver) {
	try {
		element = driver.findElement(By.id(Constant.Submitnewapplication));	
		
	}catch(NoSuchElementException e) {
		Log.error("Submit application button is not present");
		throw e;
	}
		
		
	return element;
		
	}

}
