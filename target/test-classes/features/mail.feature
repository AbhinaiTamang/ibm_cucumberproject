@mail
Feature: verify mail

  Background: in every scenario
    Given user enters the application
    When user enter "admin" and "Admin@123" in the application
    And clicks on login button

  
  Scenario: verify  user login
    Then verify user is in the dashboard

  Scenario: verify mail section
    When user clicks on mail
    Then verify user is in mail

  Scenario Outline: verify send button
    When user clicks mail
    And enters To, "<subject>" and "<message>"
    Then verify send button

    Examples: 
      | subject | message         |
      | Hello   | Have a good day |

  Scenario Outline: verify cancel button
    When clicks mail and enters mail section
    And Enters To,"<subject>","<message>"
    Then verify cancel button

    Examples: 
      | subject | message         |
      | Hello   | Have a good day |

  Scenario Outline: verify insert link
    And enters mail section after clicking mail
    When user cliks on insert button
    And enters "<text>" and "<link>"
    When cliks on insert button
    Then verify link is added or not

    Examples: 
      | text            | link                               |
      | Uniform Website | http://uniformm1.upskills.in/admin |

  Scenario Outline: verify underline text
    And click on mail
    When user clicks on bold text button
    And enter "<text>"
    Then verify wether underlined or not

    Examples: 
      | text           |
      | underlinedtext |

  Scenario: verify fullscreen button in message
    And user clicks and enter mail
    When clicks on full screen
    Then verify full screen view
