Feature: Cash Drawer Cash In

  #@smoke @sanity
  #Scenario: Open Chrome Browser
    #Given I open "Chrome" browser and "https://partner.easyeat.ai/login"
#@smoke @sanity
  #Scenario: Login with valid Credentials
    #When User is on Login Page
#		Then User enters "qa.automation@easyeat.ai" and "ajai1234"
    #And Click on Login button
    #Then User should get logged in
    #And Message displayed Login Successfully
    #Then user click  "1"  
    #Then click on SignIn button
    #Then it will redirect to the dashboard
	  
	Scenario: Cash Drawer Cash In
		
	
	 #Given user is on Dashboard
	    
	 
   When user click on Cash Drawer
   Then select Cash In 
   Then user enter name "Dilip" and amount "100" 
   And click on Cash In Done button