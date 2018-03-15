package page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import pageobjects.Applicationrecievedobjects;

public class Applicationrecieved {
	
	public static void Apprecievedview(WebDriver driver) {
		
		Applicationrecievedobjects.Viewaccount(driver).sendKeys(Keys.ENTER);
		
	}

	public static class Applicationrecievedpage {
		
		public static void Apprecievedsignout(WebDriver driver) throws Exception {
			
			Applicationrecievedobjects.signout(driver).sendKeys(Keys.ENTER);
			
			//Thread.sleep(3000);
			
		}
	
}
	
}
