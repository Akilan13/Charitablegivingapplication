package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Fieldmarketing.Constant;

public class Createaccountobjects {
	
	public static WebElement element = null;

	public static WebElement firstname(WebDriver driver) {
		
		 element = driver.findElement(By.id(Constant.Createaccount_Firstname));
		
		return element;
	    }
	
	

	public static WebElement lastname(WebDriver driver) {
		
		 element = driver.findElement(By.id(Constant.CreateaccountLastname));
		
		return element;
		
	    }
	
		public static WebElement birthday(WebDriver driver) {
			
			 element = driver.findElement(By.id(Constant.CreateaccountBirthday));
			
			return element;
        }
		public static WebElement Email(WebDriver driver) {
			
			 element = driver.findElement(By.id(Constant.CreateaccountEmail));
			
			return element;
			
		}
		
		
		public static WebElement ConfirmEmail(WebDriver driver) {
			
			 element = driver.findElement(By.id(Constant.CreateaccountconfirmEmail));
			
			return element;
			
		}
		
		public static WebElement Password(WebDriver driver) {
			
			 element = driver.findElement(By.id(Constant.CreateaccountPassword));
			
			return element;
		
		}
		
		public static WebElement ConfirmPassword(WebDriver driver) {
			
			 element = driver.findElement(By.id(Constant.CreateaccountConfirmPassword));
			
			return element;
	
					
		}
		
		public static WebElement Organization(WebDriver driver) {
			
			 element = driver.findElement(By.id(Constant.CreateaccountOrganization));
			
			return element;
			
		}
		
		public static WebElement Organizationwebsite(WebDriver driver) {
			
			 element = driver.findElement(By.id(Constant.CreateaccountOrganizationWebsite));
			
			return element;
		
		}
		
		public static WebElement Address1(WebDriver driver) {
			
			 element = driver.findElement(By.id(Constant.CreateaccountAddress_1));
			
			return element;
		}
		
		public static WebElement Address2(WebDriver driver) {
			
			 element = driver.findElement(By.id(Constant.CreateaccountAddress2));
			
			return element;
		}
		
		
		public static WebElement Zipcode(WebDriver driver) {
			
			 element = driver.findElement(By.id(Constant.CreateaccountZipCode));
			
			return element;
		}
		
		public static WebElement City(WebDriver driver) {
			
			 element = driver.findElement(By.id(Constant.CreateaccountCity));
			
			return element;
		}
		
		public static WebElement State(WebDriver driver) {
			
			 element = driver.findElement(By.id(Constant.CreateaccountState));
			
			return element;
		}
		
		public static WebElement Phone(WebDriver driver) {
			
			 element = driver.findElement(By.id(Constant.CreateaccountPhone));
			
			return element;
		}
		
		public static WebElement irs(WebDriver driver) {
			
			 element = driver.findElement(By.id(Constant.Createaccountirsstatus));
			
			return element;
		}
		
		public static WebElement Submit(WebDriver driver) {
			
			 element = driver.findElement(By.id(Constant.Createaccountbutton));
			
			return element;
		}
		
		
		
}
