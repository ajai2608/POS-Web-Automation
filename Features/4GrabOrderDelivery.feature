	Feature: Grab Delivery Type Order

#	 @smoke @sanity
  #Scenario: Open Chrome Browser
    #Given I open "Chrome" browser and "https://partner.easyeat.ai/login"
#	@smoke @sanity 
  #Scenario: Login with valid Credentials
    #When User is on Login Page
    #Then User enters "ajai@easyeat.ai" and "ajai1234"
    #And Click on Login button
    #Then User should get logged in
    #And Message displayed Login Successfully
    #Then user click  "1" 
    #Then user click  "2" 
    #Then user click  "4" 
    #Then user click  "1" 
    #Then click on SignIn button
    #Then it will redirect to the dashboard
    
    
     #@smoke @sanity
  #Scenario: Open Chrome Browser
    #Given I open "Chrome" browser and "https://partner.easyeat.id/login"
#@smoke @sanity 
  #Scenario: Login with valid Credentials
    #When User is on Login Page
    #Then User enters "ajaiindn@easyeat.ai" and "ajai1234"
    #And Click on Login button
    #Then User should get logged in
    #And Message displayed Login Successfully
    #Then user click  "1" 
    #Then click on SignIn button
    #Then it will redirect to the dashboard
    #When User clicks on AutomateSMS if available
    
   Scenario: User want to create GrabDelivery Order
   
   And user click on Create New Order button
   Then user will select Grab Order from Order Type Pop up
   Then User will select GrabPickType Order from pop up
   Then select Items A
   Then Click on Settle Bill button
   Then User will select payment option
   Then user will click on PayRM button
    #And Click on Next button
   # Then User will click on Done button on Pop up
    Then User will click on Done button and Order will be created
    Then User will click on Complete Order
    
    
    @smoke @sanity
   Scenario: User want to create GrabDelivery Order
   
   When user click on Create New Order button
   Then user will select Grab Order from Order Type Pop up
   Then User will select GrabDeliveryType Order from pop up
   Then select Items A
   Then Click on Settle Bill button
   Then User will select payment option
   Then user will click on PayRM button
   Then User will click on Done button and Order will be created
   Then User will click on Complete Order
   
	
 

   