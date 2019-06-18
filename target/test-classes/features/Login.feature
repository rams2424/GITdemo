Feature: Application Login

Scenario Outline: Home page default Login
Given  User is on salesforce login page
When User login into application with <Username> and <Password>
Then User is on field service page
And All the tabs will be displayed

Examples:
|Username                            |Password |
|icc.wholesale08@accenture.sitiw08   |12345$INS|
|customer.advisor08@accenture.sitca08|12345$INS|




