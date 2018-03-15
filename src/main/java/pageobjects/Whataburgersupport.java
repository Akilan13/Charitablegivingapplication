package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Fieldmarketing.Constant;

public class Whataburgersupport {
	
	public static WebElement element = null;
	
	public static WebElement Confirmbutton(WebDriver driver) {
		
	element = driver.findElement(By.xpath(Constant.Confirmation_button));
		
		return element;
		
	}

}
