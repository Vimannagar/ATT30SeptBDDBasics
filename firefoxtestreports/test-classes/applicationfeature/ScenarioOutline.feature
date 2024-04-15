Feature: Signup functionality

Background:
Given user is at signup page

Scenario Outline: Signup to application
When user enters "<name>" inside form
And user enters age as <age>
And user confirms "<gender>" checkbox
Then user gets created

Examples:
| name | age | gender |
| Eder | 23 | Male |
| Ron | 36 | Male |
| Daniel | 40 | Male |
| Diana |	45 | Female |

Scenario: url verification
Given user is at signup page
Then url of should contains "login" 