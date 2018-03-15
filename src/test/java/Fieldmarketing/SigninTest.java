package Fieldmarketing;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import excel.ExcelUtils;
import wait.Waitproperty;
import page.Applyforsupport;
import page.Communitypage;
import page.Signinpage;
import Fieldmarketing.Constant;
//import browser.Invokebrowser;
import browser.Parallelbrowser;

public class SigninTest {

private static WebDriver driver;
	
	private static WebDriverWait wait;
	
	@BeforeClass
	@Parameters("browsers")
	public void Beforetest(String browsers) throws Exception

	
	{
		driver = Parallelbrowser.Invokebrowser(driver, browsers);
		//driver = Invokebrowser.Invokechromebrowser(driver);
		wait = new WebDriverWait(driver, 40);
		driver.get(Constant.URL);
		
		
	}
	
	
	
	@Test
	
	public void Test() throws Exception{
		
		ExcelUtils.Openexcel(Constant.Path_TestData, "Sheet1");
		
		
		Waitproperty.waitprop(wait, Constant.Dotcom_community);
		Communitypage.Community(driver);
		
		Waitproperty.waitprop(wait, Constant.WaitforApplyforsupportpage);
		Applyforsupport.signinclick(driver);
			
				
		for (int i = 1; i<ExcelUtils.rowcount()+1; i++){
			
				
			
			
			Waitproperty.waitforelementtobepresent(wait, Constant.Waitforsigninpage);
			Signinpage.signindotcom(driver, i);
			
		
			
			String Expectedresult = driver.findElement(By.xpath("//*[@id='content']/div/div/div[3]/form/div[1]/span[1]/span")).getText();
			
             System.out.println(Expectedresult);
           
			
			
		}
		
	}
	
	@AfterClass
	
public void aftertest() throws Exception{
		
		if (driver!=null) {
		//driver.close();
		driver.quit();
		ExcelUtils.Closeexcel();
		}
	}
}
