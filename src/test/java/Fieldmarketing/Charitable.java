package Fieldmarketing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import Fieldmarketing.Constant;
import browser.Parallelbrowser;
import excel.ExcelUtils;
import page.Applicationrecieved;
import page.Applyforsupport;
import page.Charitablegiving;
import page.Communitypage;
import page.Createaccountpage;
import page.Myaccount;
import page.Whataburgersupportpage;
import wait.Waitproperty;

public class Charitable {
	
	private static WebDriver driver = null;
	
	private static  WebDriverWait wait;
	
	
	
	@BeforeClass
	@Parameters("browsers")
	
	public void launch(String browsers) throws Exception {
		
		driver = Parallelbrowser.Invokebrowser(driver, browsers);
		
		wait = new WebDriverWait(driver,50);
	}
	
	
	@Test
	public void charitableapplication() throws Exception {
		
		//*****************************************Launch URl*******************************************************
		
		driver.get(Constant.URL);
		
		//*****************************************Community Page*******************************************************
		Waitproperty.waitforelementtobeclickable(wait, Constant.Waitforcommunitypage);
		Communitypage.Community(driver);
		
		
		//*****************************************Initializing Excel*******************************************************
		
		ExcelUtils.Openexcel(Constant.Path_TestData, "Sheet4");
		int count = ExcelUtils.rowcount();
		for (int i=1;i<count;i++) {
		int rownumber=i;
		
		//*****************************************Apply for support page*******************************************************
		Waitproperty.waitforelementtobeclickable(wait, Constant.WaitforApplyforsupportpage);
		Applyforsupport.Apply(driver, rownumber);
		//Thread.sleep(1000);
		
		//*****************************************Community Page*******************************************************
		Waitproperty.waitforelementtobeclickable(wait, Constant.WaitforSupportpage);
		Whataburgersupportpage.Whataburgersupportbtn(driver);
		
		//*****************************************Create account page*******************************************************
		Waitproperty.waitforelementtobeclickable(wait, Constant.Waitforcreateaccountpage);
		Createaccountpage a = new Createaccountpage(driver);
		a.createaccount(rownumber,wait);
		//Thread.sleep(1000);
		
		//*****************************************Charitable giving page*******************************************************
		Waitproperty.waitforelementtobeclickableid(wait, Constant.Charitablesubmit);
		Charitablegiving b = new Charitablegiving(driver);
		b.charit(rownumber);
		
		//*****************************************Application received page*******************************************************
		
		Waitproperty.waitprop(wait, Constant.WaitforApplicationrecivedpage);
		Applicationrecieved.Apprecievedview(driver);
		
		//*****************************************My account page*******************************************************
		
		Waitproperty.waitprop(wait, Constant.WaitforApplicationstatuspage);
		Myaccount.signout(driver);
		
		//*****************************************Writing results in Excel*******************************************************
		
		if (driver!=null) {
					
		ExcelUtils.setcelldata(i, 25, "pass");
		
		}else {
			
		ExcelUtils.setcelldata(i, 25, "Fail");
		}
		
			}
	}

	

}
