package pie.auto;

import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import helper.WebBrowser;

public class IAdminLogin {
	
	//public static ExtentReports report;
	//public static ExtentTest logger;
	//public  WebDriver myDriver;
	//public static WebDriverWait wait;
	//public static WebDriverWait wait =  new WebDriverWait(myDriver, 25);

	
	@Given("^I am at iAdmin Login page$")
	public void i_am_at_iAdmin_Login_page(){
		    
		try {
			System.out.println("aaaaaaaaaaaa");
			CommonValidation.getDriver();
			/*myDriver = WebBrowser.selectWebBrowser("firefox");			
			myDriver.get("http://81.22.17.146:8080/iAdmin/index_bankadmin.jsp");
			myDriver.manage().window().maximize();
			myDriver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS); 
			*/
			
			
			//report = new ExtentReports("E:\\Adeetha\\selenium\\Selenium generating reports\\project auto\\auto.html");
			//logger = report.startTest("iAdmin Login");
			//wait =  new WebDriverWait(myDriver, 25);
			
			//CommonValidation.myDriver = WebBrowser.selectWebBrowser("firefox");			
			//CommonValidation.myDriver.get("http://81.22.17.146:8080/iAdmin/index_bankadmin.jsp");
			//CommonValidation.myDriver.manage().window().maximize();
			//CommonValidation.myDriver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS); 
			//CommonValidation.report = new ExtentReports("E:\\Adeetha\\selenium\\Selenium generating reports\\project auto\\auto.html");
			//CommonValidation.logger = CommonValidation.report.startTest("iAdmin Login");
			
			
			
		    
		    //status = myDriver.findElement(By.xpath("//legend[contains(text(), 'User Login')]"));
		    //status = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//legend[contains(text(), 'User Login')]")));
		        
		    /*if(cv.elementPresent(By.xpath("//legend[contains(text(), 'User Login')]"),"User Login")){
		    	CommonValidation.logger.log(LogStatus.PASS, "success - app is up and running");
		    }else{
		    	CommonValidation.logger.log(LogStatus.FAIL, "fail - app is down");
		    	//CommonValidation.myDriver.quit();
		    }	*/	    
		    		    
		}catch(WebDriverException e){		    	
			/*if(cv.elementPresent(By.id("errorTitleText"), "The connection has timed out")){
				CommonValidation.logger.log(LogStatus.FAIL, "fail - app is down");
				//CommonValidation.myDriver.quit();
			}
			e.printStackTrace();*/
			
		} catch (Exception e) {
			//status  = myDriver.findElement(By.xpath("//id[contains(text(), 'Unable to connect')]"));
			/*if(cv.elementPresent(By.xpath("//id[contains(text(), 'Unable to connect')]") , "Unable to connect")){
				CommonValidation.logger.log(LogStatus.FAIL, "fail - app is down");
				//CommonValidation.myDriver.quit();
			}
			e.printStackTrace();		*/	
		}			
	}
		
	@When("^I should enter log in details$")
	public void i_should_enter_log_in_details(DataTable arg1){
		
	    List<List<String>> loginDet = arg1.raw();
	    for(int i = 0; i < loginDet.size(); i++){		    	
	    	//CommonValidation.myDriver.findElement(By.name(loginDet.get(i).get(0))).sendKeys(loginDet.get(i).get(1));	
	    	CommonValidation.getDriver().findElement(By.name(loginDet.get(i).get(0))).sendKeys(loginDet.get(i).get(1));	
	    	
	    }	    
	}
	
	@When("^I should click the Login button \"([^\"]*)\"$")
	public void i_should_click_the_Login_button(String arg1){
		
		
	   try {
		   WebElement submit = CommonValidation.getDriver().findElement(By.cssSelector(arg1));	
		    Thread.sleep(5000);
		    submit.click();
	} catch (Exception e) {
		e.printStackTrace();
	}
	    
	}
	
	@When("^I should see the password entering screen$")
	public void i_should_see_the_password_entering_screen(){
		
		try {
			/*if(cv.elementPresent(By.name("password"), "password")){
				CommonValidation.logger.log(LogStatus.PASS, "success - password entering screen is visible");
			}else{
				CommonValidation.logger.log(LogStatus.FAIL, "fail - password entering screen is not visible");
			}*/
			
			
		} catch (Exception e) {
			CommonValidation.logger.log(LogStatus.FAIL, "fail - password entering screen is not visible");
			e.printStackTrace();
		}		
	
	}
	
	@When("^I should enter the password$")
	public void i_should_enter_the_password(DataTable arg1){
		WebElement password = null;
		try {
			//CommonValidation.myDriver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS); 	
			//System.out.println("enter password");
			//password = myDriver.findElement(By.xpath("//label[contains(text(), 'Password']"));
			
			password = CommonValidation.getDriver().findElement(By.name("password"));
			password.sendKeys("PAsword21.");
			
			
		} catch (Exception e) {
			CommonValidation.logger.log(LogStatus.FAIL, "fail - password not entered");
			e.printStackTrace();
		}		
	    
	}
	
	@When("^I click the Login button \"([^\"]*)\"$")
	public void i_click_the_Login_button(String arg1) {
	    
		try {
			WebElement submit = CommonValidation.getDriver().findElement(By.cssSelector(arg1));
			System.out.println("element "+submit.getText());
			submit.click();
			
		} catch (Exception e) {
			CommonValidation.logger.log(LogStatus.FAIL, "fail - submit button is not visible");
			e.printStackTrace();
		}
	}
		

	@When("^I should see the application menu screen$")
	public void i_should_see_the_application_menu_screen(){
		
		try {			
			/*if(cv.elementPresent(By.cssSelector(".container>header>h1"), "Application Menu")){
				CommonValidation.logger.log(LogStatus.PASS, "success - Inside home page");
			}else{
				CommonValidation.logger.log(LogStatus.FAIL, "fail - Cannot locate home page");
			}*/
			
			/*String menu = CommonValidation.myDriver.getTitle();	
			if (menu.equalsIgnoreCase("Iswitch Admin Login")){
				System.out.println("Inside home page");
				CommonValidation.logger.log(LogStatus.PASS, "Inside home page");
				String screenshotPath = Utility.captureScreenshot(CommonValidation.myDriver, "Inside home page");
				String image = CommonValidation.logger.addScreenCapture(screenshotPath);
				CommonValidation.logger.log(LogStatus.PASS, "Inside home page", image);
						 
				
				
			}
			else{				
				System.out.println("Failed to locate home page");
				CommonValidation.logger.log(LogStatus.FAIL, "Failed to locate home page");
			}*/			
			
		} catch (WebDriverException e) {	
			System.out.println("Failed to locate home page");		
			CommonValidation.logger.log(LogStatus.FAIL, "Failed to locate home page");
			CommonValidation.getDriver().quit();
		} 
		
		//CommonValidation.report.endTest(CommonValidation.logger);
		//CommonValidation.report.flush();
		
		
	}
	
	

}
