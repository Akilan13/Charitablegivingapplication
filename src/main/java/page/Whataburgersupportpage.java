package page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pageobjects.Whataburgersupport;

public class Whataburgersupportpage {
	
	public static void Whataburgersupportbtn(WebDriver driver) throws Exception {
		Thread.sleep(1000);
		Whataburgersupport.Confirmbutton(driver).sendKeys(Keys.ENTER);
		//Whataburgersupport.Confirmbutton(driver)
		
	}

}
