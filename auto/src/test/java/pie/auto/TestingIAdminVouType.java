package pie.auto;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class TestingIAdminVouType {
		

	/*@Given("^I Click iAdmin button \"([^\"]*)\"$")
public void i_Click_iAdmin_button(String arg1) throws Throwable {
	
	try {
		WebElement frame = IAdminLogin.myDriver.findElement(By.name("topFrame"));	
		IAdminLogin.myDriver.switchTo().frame(frame);
	    Thread.sleep(3000);	    
	    IAdminLogin.myDriver.findElement(By.className("description")).click();
        Thread.sleep(2000);
	    
	} catch (Exception e) {
		System.out.println("exceptionnn");
		e.printStackTrace();
	}
}

@When("^I should see the iAdmin Main Menu page$")
public void i_should_see_the_iAdmin_Main_Menu_page() throws Throwable {
	
    try {
		String menu = IAdminLogin.myDriver.getTitle();
		if(menu.equalsIgnoreCase("Bank Home Page")){
			System.out.println("Inside iAdmin menu");
		    Thread.sleep(3000);
		}else{
			System.out.println("cannot locate iAdmin");
		}
		
	} catch (Exception e) {	    
		logoutCalled();
	}    
    
}

@When("^I should Click Maintainance button \"([^\"]*)\"$")
public void i_should_Click_Maintainance_button(String arg1) throws Throwable {
	
	try {  
		//WebElement path = IAdminLogin.myDriver.findElement(By.xpath("//a[contains(@onclick, 'IA-MF-00-00-0')]"));
		//WebElement maintainance = IAdminLogin.myDriver.findElement(By.xpath("//label[contains(text(),'Maintainance')]"));
		WebElement maintainance = IAdminLogin.myDriver.findElement(By.xpath("//label[contains(text(),'Maintenance')]"));
		
		Thread.sleep(2000);
		maintainance.click();
		
		
	} catch (WebDriverException e) {
		System.out.println("error");
		e.printStackTrace();
	}
	
}


@When("^I should see the Maintainance page$")
public void i_should_see_the_Maintainance_page() throws Throwable {
	
	try {
		WebElement voucher = IAdminLogin.myDriver.findElement(By.xpath("//label[contains(text(),'Voucher Management')]"));
		Thread.sleep(2000);
		System.out.println("voucher ************* "+voucher.getText());
		if(voucher.toString().contains("Voucher Management")){
			System.out.println("Success - Inside Maintainance");
		}else{
			System.out.println("Error - Failed to locate Maintainance");
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
		
}


@When("^I should Click Voucher Management button \"([^\"]*)\"$")
public void i_should_Click_Voucher_Management_button(String arg1) throws Throwable {
	
    try {
		WebElement voucher = IAdminLogin.myDriver.findElement(By.xpath("//label[contains(text(),'Voucher Management')]"));
		Thread.sleep(2000);
		voucher.click();
		Thread.sleep(2000);
		
	} catch (Exception e) {
		e.printStackTrace();
	}
}


@When("^I should see the Voucher Management page$")
public void i_should_see_the_Voucher_Management_page() throws Throwable {
    
	try {
		WebElement header = IAdminLogin.myDriver.findElement(By.xpath("//h1[contains(text(),'Voucher Management')]"));
		if(header.toString().contains("Voucher Management")){
			System.out.println("Success - Inside voucher management");
		}else{
			System.out.println("Error - Failed to locate voucher management");
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
}


@When("^I should Click Voucher Type Management button \"([^\"]*)\"$")
public void i_should_Click_Voucher_Type_Management_button(String arg1) throws Throwable {

	try {
		WebElement voucher = IAdminLogin.myDriver.findElement(By.xpath("//label[contains(text(),'Voucher Type Management')]"));
		Thread.sleep(2000);
		voucher.click();
		Thread.sleep(2000);
	} catch (Exception e) {
		e.printStackTrace();
	}
	
}


@When("^I should see the Voucher Type Management page$")
public void i_should_see_the_Voucher_Type_Management_page() throws Throwable {
    
	try {
		WebElement header = IAdminLogin.myDriver.findElement(By.xpath("//h1[contains(text(),'Voucher Type Management')]"));
		
		if(header.toString().contains("Voucher Type Management")){
			System.out.println("Success - Inside voucher type management");
		}else{
			System.out.println("Error - Failed to locate voucher type management");
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
}


@When("^I should Click Create Voucher Type button \"([^\"]*)\"$")
public void i_should_Click_Create_Voucher_Type_button(String arg1) throws Throwable {
    
	try {
		WebElement voucher = IAdminLogin.myDriver.findElement(By.xpath("//label[contains(text(),'Create Voucher Type')]"));
		Thread.sleep(2000);
		voucher.click();
		Thread.sleep(2000);
	} catch (Exception e) {
		e.printStackTrace();
	}
}




@When("^I should see the Create Voucher Type Management page$")
public void i_should_see_the_Create_Voucher_Type_Management_page() throws Throwable {
    
	try {
		WebElement header = IAdminLogin.myDriver.findElement(By.xpath("//h1[contains(text(),'Create Voucher Type')]"));
		if(header.toString().contains("Create Voucher Type")){
			System.out.println("Success - Inside Create Voucher Type");
		}else{
			System.out.println("Error - Failed to locate Create Voucher Type");
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
}


@When("^I fill the Voucher Type fields$")
public void i_fill_the_Voucher_Type_fields(DataTable arg1) throws Throwable {
	try {
		List<List<String>> vouType = arg1.raw();
		for(int i = 0; i < vouType.size(); i++){
			IAdminLogin.myDriver.findElement(By.name(vouType.get(i).get(0))).sendKeys(vouType.get(i).get(1));
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}	
	
}


@When("^I click create voucher type button \"([^\"]*)\"$")
public void i_click_create_voucher_type_button(String arg1) throws Throwable {

	try {
		IAdminLogin.myDriver.findElement(By.name(arg1)).click();
		Thread.sleep(2000);
		
	} catch (Exception e) {
		e.printStackTrace();
	}
}



@When("^I should see the successfully created voucher type message$")
public void i_should_see_the_successfully_created_voucher_type_message() {

	WebElement message = null;
	try {

		message = IAdminLogin.myDriver.findElement(By.className("msg_list"));		
		//message = IAdminLogin.myDriver.findElement(By.xpath("//li[contains(text(),'Voucher Type Successfully Created')]"));
		Thread.sleep(5000);
		System.out.println("element captured");
		String value = message.getText();
		System.out.println("value "+value);
		if(value.equalsIgnoreCase(("Voucher Type Successfully Created"))){
			System.out.println("success - voucher type is saved successfully");
		}else if(value.equalsIgnoreCase("Voucher Type All Ready Exist")){
			System.out.println("fail - voucher type already exists");
		}

		
	} catch (Exception e) {
		System.out.println("catch");
		e.printStackTrace();
	}
}



@When("^I should click Voucher Type Management button in the menu \"([^\"]*)\"$")
public void i_should_click_Voucher_Type_Management_button_in_the_menu(String arg1) throws Throwable {
	
   try {
	   WebElement vouTypMgt = IAdminLogin.myDriver.findElement(By.id(arg1));
	   Thread.sleep(2000);
	   vouTypMgt.click();
	
	} catch (Exception e) {
		e.printStackTrace();
	}
}


@Given("^I click Approve Voucher Type button \"([^\"]*)\"$")
public void i_click_Approve_Voucher_Type_button(String arg1) throws Throwable {
	
	try {
		WebElement approveVouType = IAdminLogin.myDriver.findElement(By.xpath("//label[contains(text(),'Approve / Reject Voucher Type')]"));
		Thread.sleep(2000);
		approveVouType.click();
		
	} catch (Exception e) {
			e.printStackTrace();
	}
	
	
}


@When("^I should see the Approve Voucher Type page$")
public void i_should_see_the_Approve_Voucher_Type_page() throws Throwable {
	
    try {
		   WebElement header = IAdminLogin.myDriver.findElement(By.xpath("//h1[contains(text(),'Approve / Reject Voucher Type')]"));
		   Thread.sleep(2000);
		   if(header.toString().contains("Approve / Reject Voucher Type")){
				System.out.println("Success - Inside Approve / Reject Voucher Type");
		   }else{
				System.out.println("Error - Failed to locate Approve / Reject Voucher Type");
		   }
		
	} catch (Exception e) {
		e.printStackTrace();
	}
}


@When("^I fill search data for Voucher Type fields$")
public void i_fill_search_data_for_Voucher_Type_fields(DataTable arg1) throws Throwable {

	try {
		List<List<String>> vouType = arg1.raw();
		for(int i = 0; i < vouType.size(); i++){
			IAdminLogin.myDriver.findElement(By.name(vouType.get(i).get(0))).sendKeys(vouType.get(i).get(1));
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
}



@When("^I click search button \"([^\"]*)\"$")
public void i_click_search_button(String arg1) throws Throwable {
    
	try {
		System.out.println("inside search");
		WebElement searchForm = IAdminLogin.myDriver.findElement(By.name("formsearchterm"));
		Thread.sleep(2000);
		WebElement search = searchForm.findElement(By.cssSelector(".frmbtn.search"));
		WebElement search = IAdminLogin.myDriver.findElement(By.cssSelector(".frmbtn.search"));
		Thread.sleep(2000);
		System.out.println("click search button");
		search.click();				
				
	} catch (Exception e) {
		e.printStackTrace();
	}
}


@When("^I should see the searched voucher type results$")
public void i_should_see_the_searched_voucher_type_results() throws Throwable {
	
	try {
		WebElement table = IAdminLogin.myDriver.findElement(By.cssSelector(".main_content>table>thead>tr>td"));
	    Thread.sleep(2000);
	    String tableHeader = table.getText();
	    System.out.println("table value "+tableHeader);
	    if(tableHeader.equalsIgnoreCase("Provider Id")){    	
	    	System.out.println("records exist");
	    	
	    }else if(tableHeader.equalsIgnoreCase("No Records Found")){
	    	System.out.println("no records found");
	    	logoutCalled();
	    }
	} catch (Exception e) {
		e.printStackTrace();
	}
    
    
}

@When("^I click the details link \"([^\"]*)\" ,\"([^\"]*)\"$")
public void i_click_the_details_link(String arg1, String arg2) throws Throwable {
	
    try {
    	System.out.println("inside link click");
    	//WebElement tableRow = IAdminLogin.myDriver.findElement(By.cssSelector(arg1));
    	List<WebElement> vouType = IAdminLogin.myDriver.findElements(By.cssSelector(arg1));
    	for(int i = 0; i < vouType.size(); i++){
    		
    		System.out.println("td "+i+" value "+vouType.get(i).getText());
    		
    		if(vouType.get(i).getText().contains(arg2)){
    			//String[] record = vouType.get(i).getText().split(" ");   
    			
    			vouType.get(i).findElement(By.linkText("Details")).click();
    			break;
    			
    			
        		for(int x = 0; x < record.length; x++){
        			
    				System.out.println("array "+record[x]);
    				if(record[x].equalsIgnoreCase("Details")){
    					//print geti value
    					vouType.get(i).findElement(By.linkText(record[x])).click();
    					Thread.sleep(2000);
    					break;
    				}
    			} 
    		}	
    	}
    	
	} catch (Exception e) {
		e.printStackTrace();
	}
}


@When("^I should see the comments entering page$")
public void i_should_see_the_comments_entering_page() throws Throwable {
	
    try {
		WebElement page = IAdminLogin.myDriver.findElement(By.xpath("//legend[contains(text(),'Voucher Type Profile')]"));
		if(page.getText().equalsIgnoreCase("Voucher Type Profile")){
			System.out.println("success - comments entering page is loaded");
		}
		
    	
	} catch (Exception e) {
		e.printStackTrace();
		logoutCalled();
	}
}



@When("^I should fill comments$")
public void i_should_fill_comments(DataTable arg1) throws Throwable {
	
    try {
    	
    	List<List<String>> comment = arg1.raw();
    	System.out.println("aaaaaa");
    	for(int i = 0; i < comment.size(); i++){
    		System.out.println("inside for");
    		IAdminLogin.myDriver.findElement(By.name(comment.get(i).get(0))).sendKeys(comment.get(i).get(1));
    		System.out.println("element identified");
    		
    	}
   
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}
}


@When("^I click approve voucher type button \"([^\"]*)\"$")
public void i_click_approve_voucher_type_button(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^I should see the successfully approved voucher type message$")
public void i_should_see_the_successfully_approved_voucher_type_message() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Given("^I click Modify Voucher Type button \"([^\"]*)\"$")
public void i_click_Modify_Voucher_Type_button(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^I should see the Modify Voucher Type page$")
public void i_should_see_the_Modify_Voucher_Type_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^I click modify voucher type button \"([^\"]*)\"$")
public void i_click_modify_voucher_type_button(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^I should see the successfully modified voucher type message$")
public void i_should_see_the_successfully_modified_voucher_type_message() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^I click reject voucher type button \"([^\"]*)\"$")
public void i_click_reject_voucher_type_button(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^I should see the successfully rejected voucher type message$")
public void i_should_see_the_successfully_rejected_voucher_type_message() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Given("^I click Reapply Voucher Type button \"([^\"]*)\"$")
public void i_click_Reapply_Voucher_Type_button(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^I should see the Reapply Voucher Type page$")
public void i_should_see_the_Reapply_Voucher_Type_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^I click reapply voucher type button \"([^\"]*)\"$")
public void i_click_reapply_voucher_type_button(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^I should see the successfully reapplied voucher type message$")
public void i_should_see_the_successfully_reapplied_voucher_type_message() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Given("^I click Suspend Voucher Type button \"([^\"]*)\"$")
public void i_click_Suspend_Voucher_Type_button(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^I should see the Suspend Voucher Type page$")
public void i_should_see_the_Suspend_Voucher_Type_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^I click suspend voucher type button \"([^\"]*)\"$")
public void i_click_suspend_voucher_type_button(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^I should see the successfully suspended voucher type message$")
public void i_should_see_the_successfully_suspended_voucher_type_message() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Given("^I click Revoke Voucher Type button \"([^\"]*)\"$")
public void i_click_Revoke_Voucher_Type_button(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^I should see the Revoke Voucher Type page$")
public void i_should_see_the_Revoke_Voucher_Type_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^I click revoke voucher type button \"([^\"]*)\"$")
public void i_click_revoke_voucher_type_button(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^I should see the successfully revoked voucher type message$")
public void i_should_see_the_successfully_revoked_voucher_type_message() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Given("^I click Delete Voucher Type button \"([^\"]*)\"$")
public void i_click_Delete_Voucher_Type_button(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^I should see the Delete Voucher Type page$")
public void i_should_see_the_Delete_Voucher_Type_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^I should see the successfully deleted voucher type message$")
public void i_should_see_the_successfully_deleted_voucher_type_message() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}


public void logoutCalled(){
	
	try {
		System.out.println("going to call logout");
	    IAdminLogin.myDriver.findElement(By.className("text")).click();
	    System.out.println("logout identified");
	    Thread.sleep(5000);
	    System.out.println("going to close browser");
	    IAdminLogin.myDriver.quit();
	} catch (Exception e) {
		e.printStackTrace();
	}
	
}*/


}
