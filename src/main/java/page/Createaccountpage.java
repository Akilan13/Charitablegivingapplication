package page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Fieldmarketing.Constant;
import excel.ExcelUtils;
import wait.Waitproperty;


public class Createaccountpage {
	
	WebDriver driver;
	
	By Firstname = By.id(Constant.Createaccount_Firstname);
	By lastname = By.id(Constant.CreateaccountLastname);
	By Birthday = By.id(Constant.CreateaccountBirthday);
	By Contactemail = By.id(Constant.CreateaccountEmail);
	By Confirmemail = By.id(Constant.CreateaccountconfirmEmail);
	By password = By.id(Constant.CreateaccountPassword);
	By Confirmpassword = By.id(Constant.CreateaccountConfirmPassword);
	By Organization = By.id(Constant.CreateaccountOrganization);
	By Organizationwebsite = By.id(Constant.CreateaccountOrganizationWebsite);
	By address1 = By.id(Constant.CreateaccountAddress_1);
	By address2 = By.id(Constant.CreateaccountAddress2);
	By City = By.id(Constant.CreateaccountCity);
	By State = By.id(Constant.CreateaccountState);
	By Zipcode = By.id(Constant.CreateaccountZipCode);
	By Phone = By.id(Constant.CreateaccountPhone);
	By IRSstatus = By.id(Constant.Createaccountirsstatus);
	By School = By.id(Constant.Createaccountschool);
	By Taxid = By.id(Constant.Createaccounttaxid);
	By submitbtn = By.id(Constant.Createaccountbutton);
	
	//Constructor Class to assign main driver to local driver
	public Createaccountpage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	// Read cell data from Excel 
	public void createaccount(int rownumber,WebDriverWait wait) throws Exception {
		String Firstname1 = ExcelUtils.Readcelldata(rownumber, 2);
		String lastname1 = ExcelUtils.Readcelldata(rownumber, 3);
		String Birthday1 = ExcelUtils.Readcelldata(rownumber, 4);
		String Contactemail1 = ExcelUtils.Readcelldata(rownumber, 5);
		String Confirmemail1 = ExcelUtils.Readcelldata(rownumber, 6);
		String password1 = ExcelUtils.Readcelldata(rownumber, 7);
		String Confirmpassword1 = ExcelUtils.Readcelldata(rownumber, 8);
		String Organization1 = ExcelUtils.Readcelldata(rownumber, 9);
		String Organizationwebsite1 = ExcelUtils.Readcelldata(rownumber, 10);
		String address11 = ExcelUtils.Readcelldata(rownumber, 11);
		String address12 = ExcelUtils.Readcelldata(rownumber, 12);
		String City1 = ExcelUtils.Readcelldata(rownumber, 13);
		String State1 = ExcelUtils.Readcelldata(rownumber, 14);
		String Zipcode1 = ExcelUtils.Readcelldata(rownumber, 15);
		String Phone1 = ExcelUtils.Readcelldata(rownumber, 16);
		String IRSstatus1 = ExcelUtils.Readcelldata(rownumber, 17);
		String TaxID1 = ExcelUtils.Readcelldata(rownumber, 18);
		
		driver.findElement(Firstname).sendKeys(Firstname1);
		driver.findElement(lastname).sendKeys(lastname1);
		driver.findElement(Birthday).sendKeys(Birthday1);
		driver.findElement(Contactemail).sendKeys(Contactemail1);
		driver.findElement(Confirmemail).sendKeys(Confirmemail1);
		driver.findElement(password).sendKeys(password1);
		driver.findElement(Confirmpassword).sendKeys(Confirmpassword1);
		driver.findElement(Organization).sendKeys(Organization1);
		driver.findElement(Organizationwebsite).sendKeys(Organizationwebsite1);
		driver.findElement(address1).sendKeys(address11);
		driver.findElement(address2).sendKeys(address12);
		driver.findElement(City).sendKeys(City1);
		driver.findElement(State).sendKeys(State1);
		driver.findElement(Zipcode).sendKeys(Zipcode1);
		driver.findElement(Phone).sendKeys(Phone1);
		Select b = new Select(driver.findElement(IRSstatus));
		b.selectByVisibleText(IRSstatus1);
		Waitproperty.waitforElementtobedisplayedid(wait, School);
		driver.findElement(School).sendKeys(Keys.SPACE);
		//driver.findElement(School).click();
		driver.findElement(Taxid).sendKeys(TaxID1);
		driver.findElement(submitbtn).click();
		
		
	}

}
