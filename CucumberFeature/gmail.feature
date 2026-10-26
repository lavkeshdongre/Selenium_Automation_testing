Feature: Gmail Login

Scenario: Verify that Ater entering valid email and password gmail login successfully

Given User Should be ragistered
When Open Gamil login page , enter valid credentials
Then Gmail login should be successfully