package pie.auto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import helper.WebBrowser;

public class CommonValidation {
	
	public static ExtentReports report = null;
	public static ExtentTest logger = null;
	public  static WebDriver myDriver = null;
	public  WebDriverWait wait =  new WebDriverWait(myDriver, 25);
	
static	
	{	
	myDriver = WebBrowser.selectWebBrowser("firefox");			
	myDriver.get("http://81.22.17.146:8080/iAdmin/index_bankadmin.jsp");
	myDriver.manage().window().maximize();
	myDriver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS); 
	}



	public  boolean elementPresent(final By locator, String text){
		
		try {			
			
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));					
			if(element.getText().equalsIgnoreCase(text)){
				return true;
			}else{
				return false;
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	
	public static WebDriver getDriver()
	{
		return myDriver;
	}

}
