@order
Feature: verify order

  Background: Same cases
    Given user is in application
    When user enters "admin" and "Admin@123"
    And user click on login

  Scenario: verify login
    Then verify user is in dashboard

  Scenario: verify order
    And clicks on orders
    Then verify user is on the orders section

  Scenario Outline: verify customer details in database
    And user click order
    When user enters "<order id>","<date added>","<customer name>","<total>","<date modified>" and order status
    And clicks on filter
    Then verify a particular order is shown

    Examples: 
      | order id | date added | customer name | total | date modified |
      |      599 | 2022-02-18 | Krishna Mohan |  1110 | 2022-02-18    |

  Scenario Outline: verify view after a particular order is shown
    When user click on order
    And enter order details"<order id>","<date added>","<customer name>","<total>","<date modified>"and order status
    When clicks onfilter button
    And clicks on view
    Then verify  order details and customer details is shown

    Examples: 
      | order id | date added | customer name | total | date modified |
      |      599 | 2022-02-18 | Krishna Mohan |  1110 | 2022-02-18    |

  Scenario Outline: verify delete button after a particular order is shown
    When user will click on order and enters order details"<order id>","<date added>","<customer name>","<total>","<date modified>"and order status
    And user click on filter button
    And user click on delete after result is shown
    Then verify validation message

    Examples: 
      | order id | date added | customer name | total | date modified |
      |      599 | 2022-02-18 | Krishna Mohan |  1110 | 2022-02-18    |

  @smoke
  Scenario Outline: verify edit button after a particular order is shown
    When user click on order and enter order details"<order id>","<date added>","<customer name>","<total>","<date modified>"and order status
    And user clicks on filter button
    When user clicks on edit after result is shown
    Then verify user is in edit page
    And enter details to be changed
    Then verify it is edited or not

    Examples: 
      | order id | date added | customer name | total | date modified |
      |      599 | 2022-02-18 | Krishna Mohan |  1110 | 2022-02-18    |

  Scenario Outline: verify add new order button
    When user enters dashboard and clicks order
    And clicks on add new button and enter customer details"<firstname>","<lastname>","<telephone>","<email>"
    Then user clicks on continue and verify added or not

    Examples: 
      | firstname | lastname | telephone  | email          |
      | Abhinai   | Tamang   | 9735181764 | abhi@gmail.com |
