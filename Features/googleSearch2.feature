Feature: Test Google

  Scenario Outline: Test Google Search
    Given Launch Browser
    Then Google is open
  When Searching "<First Name>" , "<Middle Name>" , "Last Name Hardcoded"
  Then Selenium is searched successfully

    Examples: 
      | First Name | Middle Name |
      | sh1   | ch1      |
      | sh2       | ch2     |
