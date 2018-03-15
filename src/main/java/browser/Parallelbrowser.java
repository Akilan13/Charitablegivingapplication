package browser;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


import Fieldmarketing.Constant;

public class Parallelbrowser {
	
	
	public static WebDriver Invokebrowser(WebDriver driver,String browsers) throws Exception


	{
	
	//Properties prop = new Properties();
	//FileInputStream fis = new FileInputStream("C:\\Users\\kselvaraj\\eclipse-workspace\\dotcom\\Global.properties");
	//prop.load(fis);
		
	if (browsers.contains("Chrome")){
		System.setProperty("webdriver.chrome.driver",Constant.Chromedriver);
		driver = new ChromeDriver();
		return driver;
		
	}

	else if (browsers.contains("Firefox")) {
		
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

}
