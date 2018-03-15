package page;

import org.openqa.selenium.WebDriver;
import pageobjects.Signinobjects;

public class Signinpage {
	
	public static void signindotcom(WebDriver driver,int rownum) {
		
		Signinobjects.username(driver).sendKeys("username");
		Signinobjects.password(driver).sendKeys("password");
		Signinobjects.Signin(driver).click();
		
	}

}
