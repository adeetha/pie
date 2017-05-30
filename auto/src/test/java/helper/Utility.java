package helper;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pie.auto.IAdminLogin;

public class Utility {
	
	public static String captureScreenshot(WebDriver driver, String screenshotName){
		
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			String dest = "E:\\Adeetha\\selenium\\Selenium generating reports\\screenshots\\"+screenshotName+".png";
			File destination = new File(dest);
			FileUtils.copyFile(source, destination);
			return dest;			
			
		} catch (Exception e) {
			System.out.println("exception while taking screenshot "+e.getMessage());
			return e.getMessage();
		}	
		
	}
	
}
