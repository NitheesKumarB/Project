Feature: Book rooms in adactin application
@smokeTest
Scenario: User Login Into the Web Application
Given user Login Into The Adactin Application
When user Enter The Username In The Username Field
And user Enter The Password In The Password Field
Then user Click On Login Button And It Navigates To The Search Hotel Page  

@snirityTest
Scenario: User Search A Hotel In Search Hotel Page
    When user Select The Location In The Location Field
And user Select The Hotels In The Hotels Field
And user Select The Room Type In The Room Type Field
And user Select The Number Of Rooms In The Number Of Rooms Field
And user Select The Number of Adults Per Room In The Adults Per Room Field
And user Select The Number of Children Per Room In The Children Per Room Field
Then user Click On The Search Button And It Navigates To Select Hotel Page

