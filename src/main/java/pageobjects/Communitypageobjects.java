package pageobjects;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Fieldmarketing.Constant;
import log4j.Log;



public class Communitypageobjects {
	
	private static WebElement element = null;
	
	public static WebElement Community(WebDriver driver) {
		try {
		element = driver.findElement(By.xpath(Constant.Dotcom_community));
		
		Log.info("Community Link not present in the home page");
		}catch (NoSuchElementException e) {
		Log.error("Community Link not present in the home page");
		}
		
		return element;
		
	}
			

}
