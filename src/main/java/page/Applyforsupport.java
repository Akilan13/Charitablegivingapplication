package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import pageobjects.Applysupport;
import excel.ExcelUtils;
public class Applyforsupport {
	

	public static void Apply(WebDriver driver,int rownumber) throws Exception {
		



	String ZipCode= ExcelUtils.Readcelldata(rownumber, 0);
	String supportdate1= ExcelUtils.Readcelldata(rownumber, 1);
	
		
	

		Applysupport.Zip(driver).sendKeys(ZipCode);
		
		Applysupport.Date(driver).sendKeys(supportdate1);
		
		
		Select dropdown = new Select(Applysupport.Dropdown(driver));
		dropdown.selectByIndex(1);
		dropdown.selectByIndex(0);
		Thread.sleep(1000);
		
		Applysupport.Applybutton(driver).click();
		//Thread.sleep(9000);
		


	}
	
	
	public static void signinclick(WebDriver driver) {
		Applysupport.Signin(driver).click();
	}
	
	
	public static void forgotpasswordclick(WebDriver driver) {
		Applysupport.forgotpasswordlink(driver).click();
	}
	

}
