package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Framenumber {
	
	public int framenum(WebDriver driver,String path1) {
		
		int a = driver.findElements(By.tagName("iframe")).size();
		
		int i;
		for ( i=0;i<a;i++){
			driver.switchTo().frame(i);
			int Count = driver.findElements(By.xpath(path1)).size();
			if (Count>0) {
				break;
			}
			else {
				System.out.println("Continue Looping");
			}
		}
		
		return i;
		
	}

}
