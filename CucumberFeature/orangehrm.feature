Feature: orange hrm login page 

@Smoke
Scenario: verify that after user enter the valid credential the orange hrm dashboard should be visible 

Given oranghrm browser should be launch  
When Enter the username as "Admin" and the password as "admin123"
And Click on the login btn of orangehrm
Then user should be on the orange hrm dashboard