package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Fieldmarketing.Constant;



public class Myacountobjects {
	
	 private static  WebElement element = null;
	
	public static WebElement signout(WebDriver driver) {
		
		element = driver.findElement(By.xpath(Constant.Myaccountsignout));
		
		return element;
	}
	
	public static WebElement submitnewapplication(WebDriver driver) {
		
		element = driver.findElement(By.xpath(Constant.Submitnewapplication));
		
		return element;
	}
	
	public static WebElement application(WebDriver driver) {
		
		element = driver.findElement(By.xpath(Constant.Application));
		
		return element;
	}
	

}
