Feature: Delete Past Order

 #@smoke @sanity
  #Scenario: Open Chrome Browser
    #Given I open "Chrome" browser and "https://partner.easyeat.ai/login"
#@smoke @sanity
  #Scenario: Login with valid Credentials
    #When User is on Login Page
    #Then User enters "ajai@easyeat.ai" and "ajai1234"
    #And Click on Login button
    #Then User should get logged in
    #And Message displayed Login Successfully
    #Then user click  "1" 
    #Then click on SignIn button
    #Then it will redirect to the dashboard
    
     #@smoke @sanity
#	  Scenario: Open Chrome Browser
#	    Given I open "Chrome" browser and "https://partner.easyeat.id/login"
#	@smoke @sanity 
#	  Scenario: Login with valid Credentials
#	    When User is on Login Page
#	    Then User enters "ajaiindn@easyeat.ai" and "ajai1234"
#	    And Click on Login button
#	    Then User should get logged in
#	    And Message displayed Login Successfully
#	    Then user click  "1" 
#	    Then click on SignIn button
#	    Then it will redirect to the dashboard
#	    When User clicks on AutomateSMS if available
	
	@smoke	
	Scenario: Delete Order From Past OrderDashboard

	 #Given user is on Dashboard	    
   When user click on Create New Order button
   Then select DineIn
   Then select Items A
   And Click on Create Order button
   Then select table  
   Then Click on Settle Bill from dashboard button
   Then User will select payment option Master Card
   And Click on Paid button
   Then user will click on done button
   Then User will click on Complete button
    When user click on Past Orders tab
   Then Click on Delete order button
   And Click on yes Delete button