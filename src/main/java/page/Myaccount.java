package page;

import org.openqa.selenium.WebDriver;
import pageobjects.Myacountobjects;

public class Myaccount {
	
	public static void submitnewapplication(WebDriver driver) throws Exception {
		
		Myacountobjects.submitnewapplication(driver).click();
		
		//Thread.sleep(3000);
		
	}
	
	
	public static void signout(WebDriver driver) throws Exception {
		
		Myacountobjects.signout(driver).click();
		
		//Thread.sleep(3000);
		
	}

	
	public static void Applicationclick(WebDriver driver) throws Exception {
		
		Myacountobjects.application(driver).click();
		
		//Thread.sleep(3000);
		
	}
	
}
