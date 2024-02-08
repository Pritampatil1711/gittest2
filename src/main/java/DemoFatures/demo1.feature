Feature: Login in function 
Scenario: verify Login functionality

Given  User navigate to the website "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
When  user logs in through valid username and password  "Admin" and "admin123"
Then   login must be succesful.  "Dashboard"