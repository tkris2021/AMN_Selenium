#Author: Krishna


Feature: verify user successfully launched amazon portal
  

  Scenario Outline: verify user successfully launched amazon portal
    
    Then user launches chrome browse and provide url as "<url>"
    Then user asserts the links displayed on the page 
    Then user validate default country is US

    Examples: 
      | url            | 
      | https://www.amazon.com/ | 
      
