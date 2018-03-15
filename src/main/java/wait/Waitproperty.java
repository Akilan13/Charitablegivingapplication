package wait;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitproperty {
	
   	
	
	public static void waitprop(WebDriverWait wait, String xpath) {
		
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		}
	
	
	public static void waitforelementtobeclickable(WebDriverWait wait, String xpath) {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
			
	}
	
	public static void waitforpagetoload(WebDriverWait wait) {
		wait.until(ExpectedConditions.jsReturnsValue("return document.readyState==\"complete\";"));
								
	}
	
	public static void waitforelementtobepresent(WebDriverWait wait, String xpath) {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
				
	}
	
	public static void waitforelementtobeselected(WebDriverWait wait, String xpath) {
		wait.until(ExpectedConditions.elementToBeSelected(By.xpath(xpath)));
				
	}
	
	public static void waitforelementtobeclickableid(WebDriverWait wait, String id) {
		wait.until(ExpectedConditions.elementToBeClickable(By.id(id)));
			
	}
	
	public static void waitpropid(WebDriverWait wait, String id) {
		
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
		}
	
	public static void waitforelementtobepresentid(WebDriverWait wait, String id) {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id(id)));
				
	}
	
	public static void waitforelementtobeselectedid(WebDriverWait wait, String id) {
		wait.until(ExpectedConditions.elementToBeSelected(By.id(id)));
				
	}
	
	public static void waitforElementtobedisplayedid(WebDriverWait wait, By by ) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
				
	}



}
