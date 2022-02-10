@LeadScenarios
Feature: Leaftabs Login Funcationality

Scenario Outline: TC001_Login to application-positive

Given Enter username as <userName>
And Enter Password as <password> 
When Click on login button
Then Homepage should be displayed

Examples:
|userName|password|
|'DemoSalesManager'|'crmsfa'|
