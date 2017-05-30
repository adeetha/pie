package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class WebBrowser {
	
	public static WebDriver driver;
	
	public static WebDriver selectWebBrowser(String browserName){
		
		if(browserName.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "E://Adeetha//selenium//geckodriver-v0.11.1-win64//geckodriver.exe");
			driver = new FirefoxDriver();
			
			/*System.setProperty("phantomjs.binary.path","E://Adeetha//selenium//Webdriver jars//phantomjs-2.1.1-windows//bin//phantomjs.exe"); 
		    driver = new PhantomJSDriver();*/
			
		}else{
			//driver = new ChromeDriver();
		}
		
		return driver;
		
	}
	
	
	
	
	
	/*public static WebDriver getDriver(){
		return driver;
	}*/

}
