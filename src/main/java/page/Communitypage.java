package page;

import org.openqa.selenium.WebDriver;


import pageobjects.Communitypageobjects;

public class Communitypage {
	
	public static void Community(WebDriver driver) throws Exception {
		
		//driver.get(Constant.URL);
		
		
		
		
		Communitypageobjects.Community(driver).click();
		//Thread.sleep(1500);

		
		
	}

}
