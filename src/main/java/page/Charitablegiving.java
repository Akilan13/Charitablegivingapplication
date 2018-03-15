package page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import excel.ExcelUtils;
import Fieldmarketing.Constant;

public class Charitablegiving {
	
	 WebDriver driver;
	
	@FindBy(id = Constant.CharitableStartdate)
	static
	WebElement CharitableStartdate;
	
	@FindBy(id = Constant.CharitabledecisionDate)
	static
	WebElement Charitabledecision;
	
	@FindBy(id = Constant.CharitableEventName)
	static
	WebElement CharitableEventName;
	
	@FindBy(id = Constant.CharitableEventDescription)
	static
	WebElement CharitableEventDescription;
	
	@FindBy(id = Constant.Charitableattendance)
	static
	WebElement Charitableattendance;
	

	@FindBy(id = Constant.Charitablesponsors)
	static
	WebElement Charitablesponsors;

	@FindBy(id = Constant.Charitableadd1)
	static
	WebElement Charitableadd1;
	
	@FindBy(id = Constant.Charitableadd2)
	static
	WebElement Charitableadd2;
	
	@FindBy(id = Constant.CreateaccountAddress2)
	static
	WebElement CreateaccountAddress2;
	
	@FindBy(id = Constant.Charitablecity)
	static
	WebElement Charitablecity;
	
	@FindBy(id = Constant.Charitablestate)
	static
	WebElement Charitablestate;
	
	@FindBy(id = Constant.Charitablezip)
	static
	WebElement Charitablezip;
	
	@FindBy(id = Constant.Charitableprevious)
	static
	WebElement Charitableprevious;
	
	@FindBy(id = Constant.Charitableyearsofsupport)
	static
	WebElement Charitableyearsofsupport;
	
	@FindBy(id = Constant.Charitableyearsofsupportquestion)
	static
	WebElement Charitableyearsofsupportquestion;
	
	@FindBy(id = Constant.CharitableMission)
	static
	WebElement CharitableMission;
	
	@FindBy(id = Constant.Charitablebackground)
	static
	WebElement Charitablebackground;

	@FindBy(id = Constant.Charitablegeo)
	static
	WebElement Charitablegeo;
	
	@FindBy(id = Constant.Charitableprimary)
	static
	WebElement Charitableprimary;
	
	@FindBy(id = Constant.Charitableprimarycomment)
	static
	WebElement Charitableprimarycomment;
	
	@FindBy(id = Constant.Charitablesecondary)
	static
	WebElement Charitablesecondary;
	
	@FindBy(id = Constant.Charitablesecondarycomment)
	static
	WebElement Charitablesecondarycomment;
	
	@FindBy(id = Constant.CharitableCurrentbudget)
	static
	WebElement CharitableCurrentbudget;

	@FindBy(id = Constant.CharitableRequest1)
	static
	WebElement CharitableRequest1;
	
	@FindBy(id = Constant.Charitablerequestamount)
	static
	WebElement Charitablerequestamount;
	
	@FindBy(id = Constant.Charitablerequestelements)
	static
	WebElement Charitablerequestelements;
	
	@FindBy(id = Constant.Charitablerequest2)
	static
	WebElement Charitablerequest2;
	
	@FindBy(id = Constant.Charitablerefferal)
	static
	WebElement CharitableRefferral;
	
	@FindBy(id = Constant.Charitablew9)
	static
	WebElement w9;
	
	@FindBy(id = Constant.CharitablewIRS)
	static
	WebElement IRS;
	
	@FindBy(id = Constant.CharitableCurrentbudget)
	static
	WebElement Currentbudget;
	
	@FindBy(id = Constant.Charitablesponsorshippacket)
	static
	WebElement Sponsorshippacket;
	
	@FindBy(id = Constant.Charitablesubmit)
	static
	WebElement Submit;
	
	
	public Charitablegiving(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		}
	
	
	public  void charit(int rownumber) throws Exception {
	
		CharitableEventName.sendKeys(ExcelUtils.Readcelldata(rownumber, 19));
		CharitableStartdate.sendKeys(ExcelUtils.Readcelldata(rownumber, 20));
		Charitabledecision.sendKeys(ExcelUtils.Readcelldata(rownumber, 21));
		CharitableEventDescription.sendKeys(ExcelUtils.Readcelldata(rownumber, 22));
		Charitableattendance.sendKeys(ExcelUtils.Readcelldata(rownumber, 23));
		Charitablesponsors.sendKeys(ExcelUtils.Readcelldata(rownumber, 24));
		Charitableadd1.sendKeys(ExcelUtils.Readcelldata(rownumber, 25));
		Charitableadd2.sendKeys(ExcelUtils.Readcelldata(rownumber, 26));
		Charitablecity.sendKeys(ExcelUtils.Readcelldata(rownumber, 27));
		Charitablestate.sendKeys(ExcelUtils.Readcelldata(rownumber, 28));
		Charitablezip.sendKeys(ExcelUtils.Readcelldata(rownumber, 29));
		Select k = new Select(Charitableprevious);
		k.selectByVisibleText((ExcelUtils.Readcelldata(rownumber, 30)));
		//Charitableprevious.sendKeys(ExcelUtils.Readcelldata(rownumber, 31));
		Charitableyearsofsupport.sendKeys(ExcelUtils.Readcelldata(rownumber, 31));
		Charitableyearsofsupportquestion.sendKeys(ExcelUtils.Readcelldata(rownumber, 32));
		CharitableMission.sendKeys(ExcelUtils.Readcelldata(rownumber, 33));
		Charitablebackground.sendKeys(ExcelUtils.Readcelldata(rownumber, 34));
		Charitablegeo.sendKeys(ExcelUtils.Readcelldata(rownumber, 35));
		Charitableprimary.sendKeys(ExcelUtils.Readcelldata(rownumber, 36));
		Charitableprimarycomment.sendKeys(ExcelUtils.Readcelldata(rownumber, 37));
		Charitablesecondary.sendKeys(ExcelUtils.Readcelldata(rownumber, 38));
		Charitablesecondarycomment.sendKeys(ExcelUtils.Readcelldata(rownumber, 39));
		//CharitableCurrentbudget.sendKeys(ExcelUtils.Readcelldata(rownumber, 40));
		CharitableRequest1.sendKeys(ExcelUtils.Readcelldata(rownumber, 41));
		Charitablerequestamount.sendKeys(ExcelUtils.Readcelldata(rownumber, 42));
		Charitablerequestelements.sendKeys(ExcelUtils.Readcelldata(rownumber, 43));
		Charitablerequest2.sendKeys(ExcelUtils.Readcelldata(rownumber, 44));
		CharitableRefferral.sendKeys(ExcelUtils.Readcelldata(rownumber, 45));
		w9.sendKeys(ExcelUtils.Readcelldata(rownumber, 46));
		IRS.sendKeys(ExcelUtils.Readcelldata(rownumber, 47));
		Currentbudget.sendKeys(ExcelUtils.Readcelldata(rownumber, 48));
		Sponsorshippacket.sendKeys(ExcelUtils.Readcelldata(rownumber, 49));
		Submit.sendKeys(Keys.ENTER);
		
		

	}
	

}
