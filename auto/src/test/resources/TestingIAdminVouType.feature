Feature: Testing iAdmin Voucher Type Management

  #Scenario: Create / Update Voucher Type
    #Given I Click iAdmin button "iAdmin"
    #When I should see the iAdmin Main Menu page
    #And I should Click Maintainance button "IA-MF-00-00-0" 
    #And I should see the Maintainance page
    #And I should Click Voucher Management button "IA-VM-00-00-0"
    #And I should see the Voucher Management page
    #And I should Click Voucher Type Management button "IA-VTM-00-00-0"
    #And I should see the Voucher Type Management page
    #And I should Click Create Voucher Type button "IA-VTM-00-00-1"
    #And I should see the Create Voucher Type Management page
    #And I fill the Voucher Type fields
      #| Prov_Id    | Mobitel       |
      #| Vou_Typ    | abcMobi       |
    #And I click create voucher type button "Submit"
    #And I should see the successfully created voucher type message
    #And I should click Voucher Type Management button in the menu "IA-VTM-00-00-0"
        
    
  #Scenario: Approve Voucher Type
    #Given I click Approve Voucher Type button "IA-VTM-00-00-2"
    #When I should see the Approve Voucher Type page
    #And I fill search data for Voucher Type fields
      #| Prov_ID    | Mobitel       |
    #And I click search button "Search"
    #And I should see the searched voucher type results
    #And I click the details link ".main_content>table>tbody>tr" ,"abcMobi"
    #And I should see the comments entering page
    #And I should fill comments
      #| user_comment    | voucher type is approved   |
    #And I click approve voucher type button "approve"
    #And I should see the successfully approved voucher type message
    #And I should click Voucher Type Management button in the menu "IA-VTM-00-00-0"
    #And I should see the Voucher Type Management page
    

 #Scenario: Modify Voucher Type 
    #Given I click Modify Voucher Type button "IA-VTM-00-00-5"
    #When I should see the Modify Voucher Type page
    #And I fill the Voucher Type fields
      #| Prov_ID    | Mobitel       |
      #| Vou_Typ    | testMobi      |
    #And I click search button "Search"
    #And I should see the searched voucher type results
    #And I click the details link "html/body/div[2]/div[3]/table/tbody/tr[1]/td[5]/a" 
    #And I should see the Modify Voucher Type page
    #And I fill the Voucher Type fields
      #| vou_typ_new    | testMobiEdited           |
      #| user_comment   | voucher type is edited   |
    #And I click modify voucher type button "Submit" 
    #And I should see the successfully modified voucher type message
    #And I should click Voucher Type Management button in the menu "IA-VTM-00-00-0"
    #And I should see the Voucher Type Management page
    
 
 #Scenario: Reject Voucher Type
    #Given I click Approve Voucher Type button "IA-VTM-00-00-2"
    #When I should see the Approve Voucher Type page
    #And I fill the Voucher Type fields
      #| Prov_ID    | Mobitel         |
      #| Vou_Typ    | testMobiEdited  |
    #And I click search button "Search"
    #And I should see the searched voucher type results
    #And I click the details link "html/body/div[2]/div[3]/table/tbody/tr[1]/td[5]/a" 
    #And I should see the Approve Voucher Type page
    #And I should fill comments    
      #| user_comment    | voucher type is rejected   |
    #And I click reject voucher type button "reject"
    #And I should see the successfully rejected voucher type message
    #And I should click Voucher Type Management button in the menu "IA-VTM-00-00-0"
    #And I should see the Voucher Type Management page
    
    
  #Scenario: Reapply Voucher Type
    #Given I click Reapply Voucher Type button "IA-VTM-00-00-3"
    #When I should see the Reapply Voucher Type page
    #And I fill the Voucher Type fields
      #| Prov_ID    | Mobitel         |
      #| Vou_Typ    | testMobiEdited  |
    #And I click search button "Search"
    #And I should see the searched voucher type results 
    #And I click the details link "html/body/div[2]/div[3]/table/tbody/tr[1]/td[5]/a" 
    #And I should see the Reapply Voucher Type page
    #And I should fill comments    
      #| vou_typ_new     | reTestMobi                  |
      #| user_comment    | voucher type is reapplied   |
    #And I click reapply voucher type button "Submit"
    #And I should see the successfully reapplied voucher type message
    #And I should click Voucher Type Management button in the menu "IA-VTM-00-00-0"
    #And I should see the Voucher Type Management page
    
    
 #Scenario: Approve Voucher Type
    #Given I click Approve Voucher Type button "IA-VTM-00-00-2"
    #When I should see the Approve Voucher Type page
    #And I fill the Voucher Type fields
      #| Prov_ID    | Mobitel       |
      #| Vou_Typ    | reTestMobi      |
    #And I click search button "Search"
    #And I should see the searched voucher type results
    #And I click the details link "html/body/div[2]/div[3]/table/tbody/tr[1]/td[5]/a" 
    #And I should see the Approve Voucher Type page
    #And I should fill comments
      #| user_comment    | voucher type is approved   |
    #And I click approve voucher type button "approve"
    #And I should see the successfully approved voucher type message
    #And I should click Voucher Type Management button in the menu "IA-VTM-00-00-0"
    #And I should see the Voucher Type Management page   
    

 #Scenario: Suspend Voucher Type
    #Given I click Suspend Voucher Type button "IA-VTM-00-00-4"
    #When I should see the Suspend Voucher Type page
    #And I fill the Voucher Type fields
      #| Prov_ID    | Mobitel       |
      #| Vou_Typ    | reTestMobi    |
    #And I click search button "Search"
    #And I should see the searched voucher type results 
    #And I click the details link "html/body/div[2]/div[3]/table/tbody/tr[1]/td[5]/a" 
    #And I should see the Suspend Voucher Type page
    #And I should fill comments    
      #| user_comment    | voucher type is suspended   |
    #And I click suspend voucher type button "Submit"
    #And I should see the successfully suspended voucher type message
    #And I should click Voucher Type Management button in the menu "IA-VTM-00-00-0"
    #And I should see the Voucher Type Management page
    #
    
 #Scenario: Revoke Voucher Type
    #Given I click Revoke Voucher Type button "IA-VTM-00-00-8"
    #When I should see the Revoke Voucher Type page
    #And I fill the Voucher Type fields
      #| Prov_ID    | Mobitel       |
      #| Vou_Typ    | reTestMobi    |
    #And I click search button "Search"
    #And I should see the searched voucher type results 
    #And I click the details link "html/body/div[2]/div[3]/table/tbody/tr[1]/td[5]/a" 
    #And I should see the Revoke Voucher Type page
    #And I should fill comments    
      #| user_comment    | voucher type is revoked   |
    #And I click revoke voucher type button "Submit"
    #And I should see the successfully revoked voucher type message
    #And I should click Voucher Type Management button in the menu "IA-VTM-00-00-0"
    #And I should see the Voucher Type Management page
    #
 
 #Scenario: Approve Voucher Type
    #Given I click Approve Voucher Type button "IA-VTM-00-00-2"
    #When I should see the Approve Voucher Type page
    #And I fill the Voucher Type fields
      #| Prov_ID    | Mobitel       |
      #| Vou_Typ    | reTestMobi    |
    #And I click search button "Search"
    #And I should see the searched voucher type results
    #And I click the details link "html/body/div[2]/div[3]/table/tbody/tr[1]/td[5]/a" 
    #And I should see the Approve Voucher Type page
    #And I should fill comments
      #| user_comment    | voucher type is approved   |
    #And I click approve voucher type button "approve"
    #And I should see the successfully approved voucher type message
    #And I should click Voucher Type Management button in the menu "IA-VTM-00-00-0"
    #And I should see the Voucher Type Management page  
    
    
 #Scenario: Suspend Voucher Type
    #Given I click Suspend Voucher Type button "IA-VTM-00-00-4"
    #When I should see the Suspend Voucher Type page
    #And I fill the Voucher Type fields
      #| Prov_ID    | Mobitel       |
      #| Vou_Typ    | reTestMobi    |
    #And I click search button "Search"
    #And I should see the searched voucher type results 
    #And I click the details link "html/body/div[2]/div[3]/table/tbody/tr[1]/td[5]/a" 
    #And I should see the Suspend Voucher Type page
    #And I should fill comments    
      #| user_comment    | voucher type is suspended   |
    #And I click suspend voucher type button "Submit"
    #And I should see the successfully suspended voucher type message
    #And I should click Voucher Type Management button in the menu "IA-VTM-00-00-0"
    #And I should see the Voucher Type Management page  
    
    
 #Scenario: Delete Voucher Type
    #Given I click Delete Voucher Type button "IA-VTM-00-00-6"
    #When I should see the Delete Voucher Type page
    #And I fill the Voucher Type fields
      #| Prov_ID    | Mobitel       |
      #| Vou_Typ    | reTestMobi    |
    #And I click search button "Search"
    #And I should see the searched voucher type results 
    #And I click the details link "html/body/div[2]/div[3]/table/tbody/tr[1]/td[5]/a" 
    #And I should see the Delete Voucher Type page
    #And I should fill comments    
      #| user_comment    | voucher type is deleted   |
    #And I click suspend voucher type button "Submit"
    #And I should see the successfully deleted voucher type message
    #And I should click Voucher Type Management button in the menu "IA-VTM-00-00-0"
    #And I should see the Voucher Type Management page
      
      
 #Scenario: Create / Update Voucher Type
    #Given I Click iAdmin button "iAdmin"
    #When I should see the iAdmin Main Menu page
    #And I should Click Maintainance button "IA-MF-00-00-0"
    #And I should see the Maintainance page
    #And I should Click Voucher Management button "IA-VM-00-00-0"
    #And I should see the Voucher Management page
    #And I should Click Voucher Type Management button "IA-VTM-00-00-0"
    #And I should see the Voucher Type Management page
    #And I should Click Create Voucher Type button "IA-VTM-00-00-1"
    #And I should see the Voucher Type Management page
    #And I fill the Voucher Type fields
      #| Prov_Id    | Airtel       |
      #| Vou_Typ    | airType      |
    #And I click create voucher type button "Submit"
    #And I should see the successfully created voucher type message
    #And I should click Voucher Type Management button in the menu "IA-VTM-00-00-0"
    #And I should see the Voucher Type Management page    
      
      
      