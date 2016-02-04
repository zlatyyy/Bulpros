Feature: Load left navigation menu

In order to sure that all tabs can be loaded,
I want to click on each of them to verify that this functionality is working.

@smokeTest
Scenario: NavigationMenu Functionality

Given the system knows about the following card parameters
|id|quantity|opts
|1|1|[]
When the user click POST updateCart
Then the response should be
'''[{"id":"1","quantity":"1","opts":[]}]''' 