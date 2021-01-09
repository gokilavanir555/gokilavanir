Feature: Google page test
Scenario: Google search text
Given User Login
| |admin|
|admin| | |
|admin|admin|
When User entered valid credentials
|Benjamin|
|Franklin|
|aa|abc123@gmail.com |
|1790|98765432|9876543210|
|Wagamon street, Chennai - 6000097 |
|Chennai|
|Tamilnadu|
|6|
|Benjamin Franklin|
|7439237282834008|
|345|
|11|
|2035|
Then Success

