Feature: Swaglab website login logout check

Scenario: verify that the login and logout successfully
 
 Given launch the swaglab website 
 When Enter the username as "username"  and password "password"
  And click on login button
   And Logout Successfully
 Then Logout the Swaglab website successfully  and expected_result as "expectedresult"
 
 Example:
        |username               |password    |expectedresult|
        |standard_user          |secret_sauce|Success       |
        |problem_user           |secret_sauce|Success       |
        |performance_glitch_user|secret_sauce|Success       |
        |error_user             |secret_sauce|Success       |
        |visual_user            |secret_sauce|Success       |
        |locked_out_user        |secret_sauce|Fail          |