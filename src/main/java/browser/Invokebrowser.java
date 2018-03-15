package browser;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


import Fieldmarketing.Constant;

public class Invokebrowser {
	
public static WebDriver Invokechromebrowser(WebDriver driver) throws Exception




	{
	
	Properties prop = new Properties();
	FileInputStream fis = new FileInputStream("C:\\Users\\kselvaraj\\eclipse-workspace\\dotcom\\Global.properties");
	prop.load(fis);
	
	if (prop.getProperty("browser").contains("Chrome")){
		System.setProperty("webdriver.chrome.driver",Constant.Chromedriver);
		driver = new ChromeDriver();
		return driver;
		
	}

	else if (prop.getProperty("browser").contains("Firefox")) {
		
		System.setProperty("webdriver.gecko.driver", Constant.Firefoxdriver);
		 driver = new FirefoxDriver();
		 return driver;
		
	}
	else {
		
		System.setProperty("webdriver.InternetExplorer.driver", Constant.IEdriver);
		 driver = new InternetExplorerDriver();
		 return driver;
		
	}
	
	}


public static WebDriver Invokefirefoxbrowser(WebDriver driver) throws Exception

{
	System.setProperty("webdriver.gecko.driver", Constant.Firefoxdriver);
	 driver = new FirefoxDriver();
	 return driver;
	
}


public static WebDriver InvokeIEdriver(WebDriver driver) throws Exception

{
	System.setProperty("webdriver.InternetExplorer.driver", Constant.IEdriver);
	 driver = new InternetExplorerDriver();
	 return driver;
	
}


	

}