#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Test petclicnic website

  Scenario: launch petclinic website
    Given Open chrome and start application
  	When I click on  home_button
  	Then user should be able to see welcome on page
  	

  Scenario: Adding owner 
    Given on Find owners tab
  	When I click on Findowners_link
  	Then user should be able to see Findowners_text on page	


Scenario: Adding owner 
    Given on Find owners page
  	When I click on Addowner_button
  	Then user should be able to see NewOwner_text on page	
  	
 Scenario: Enter owner details
 
 Given on NewOwner page
 When I enter "heena" on firstname_textbox
 And I enter "mehra" on lastname_textbox
 And I enter "kondapur flat 202" on Address_textbox
 And I enter "hyderabad" on city_textbox
 And I enter "123465" on telephone_textbox
 And I click on AddOwner_button 
 Then user should be able to see OwnerInformation_text on page
