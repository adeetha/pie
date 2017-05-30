Feature: Log into iAdmin application through iAdmin Log in page

Scenario: Log into iAdmin application
Given I am at iAdmin Login page
When I should enter log in details
	| user_id 		| bsuper1 |
	| user_suffix | 00000 	|
	| user_bank 	| 0001 		|
	And I should click the Login button ".frmbtn.submit"
	And I should see the password entering screen
	And I should enter the password
	| password | PAsword21. |
	And I click the Login button ".frmbtn.submit"
	And I should see the application menu screen
