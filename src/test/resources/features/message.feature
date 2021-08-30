@wip
Feature: Message feature`s functionality


  Scenario Outline: Sending message as "<user>"
    Given the user is on the homepage with valid "<userName>" and "<password>" as "<user>"
    When the user clicks on the Send message box under the MESSAGE feature
    And the user types "<message>" in the message typing box
    And the user clicks on upload files icon at the bottom left of the message typing box
    And the user clicks on Add more icon which located in the to box
    And the user clicks on All employees icon then clicks on Employees and departments icon from opening popup
    And the user choose "<employee 1>" and "<employee 2>" by clicking on employees from opening list
    And the user clicks on link icon and adds "<link>" and "<text>" to the boxes and clicks save icon
    And the user clicks on Add mention icon at the bottom of the message typing box
    And the user clicks on Employees and departments icon form opening popup and choose "<employee 1>" by clicking on
    And the user creates a Quote by clicking on the Quote icon at the bottom of the message typing box
    And the user clicks on send icon at the bottom lef of the general message box
    Then the user should see forwarded message under Activity Stream title with visible sender as "<userName>"


    Examples:
      | user | userName                | password | message        | employee 1                    | employee 2                   | link                                              | text       |
      | HR12 | hr12@cybertekschool.com | UserUser | Recommendation | marketing1@cybertekschool.com | helpdesk1@cybertekschool.com | https://www.youtube.com/watch?v=6xLxF8Rh6Rs&t=21s | Experience |


  Scenario Outline: Sending message with uploaded video from vimeo
    Given the user is on the homepage with valid "<userName>" and "<password>" as "<user>"
    When the user clicks on the Send message box under the MESSAGE feature
    And the user click on Insert video icon at the bottom of the message typing box
    And the user puts in video link from "<vimeo>" in the opening Video source box
    Then the user should not see any error message like "<vimeoError>"

    Examples:
      | user | userName                | password | vimeoError                                | vimeo                       |
      | HR12 | hr12@cybertekschool.com | UserUser | [FVID403] Access to video file was denied | https://vimeo.com/577635596 |


  Scenario Outline: Sending message with uploaded video from youtube
    Given the user is on the homepage with valid "<userName>" and "<password>" as "<user>"
    When the user clicks on the Send message box under the MESSAGE feature
    And the user click on Insert video icon at the bottom of the message typing box
    And the user puts in video link from "<youtube>" in the opening Video source box
    Then the user should not see any error message like "<youtubeError>"


    Examples:
      | user | userName                | password | youtubeError                      | youtube                                           |
      | HR12 | hr12@cybertekschool.com | UserUser | [FVID404] The video was not found | https://www.youtube.com/watch?v=KlEPI_jV5iA&t=18s |

