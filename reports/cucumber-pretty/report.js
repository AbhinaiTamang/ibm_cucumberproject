$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/order.feature");
formatter.feature({
  "name": "verify order",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@order"
    }
  ]
});
formatter.background({
  "name": "Same cases",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is in application",
  "keyword": "Given "
});
formatter.match({
  "location": "orderstepdefinition.user_is_in_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"admin\" and \"Admin@123\"",
  "keyword": "When "
});
formatter.match({
  "location": "orderstepdefinition.user_enters_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on login",
  "keyword": "And "
});
formatter.match({
  "location": "orderstepdefinition.user_click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "verify login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@order"
    }
  ]
});
formatter.step({
  "name": "verify user is in dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "orderstepdefinition.verify_user_is_in_dashboard()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "Same cases",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is in application",
  "keyword": "Given "
});
formatter.match({
  "location": "orderstepdefinition.user_is_in_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"admin\" and \"Admin@123\"",
  "keyword": "When "
});
formatter.match({
  "location": "orderstepdefinition.user_enters_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on login",
  "keyword": "And "
});
formatter.match({
  "location": "orderstepdefinition.user_click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "verify order",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@order"
    }
  ]
});
formatter.step({
  "name": "clicks on orders",
  "keyword": "And "
});
formatter.match({
  "location": "orderstepdefinition.clicks_on_orders()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify user is on the orders section",
  "keyword": "Then "
});
formatter.match({
  "location": "orderstepdefinition.verify_user_is_on_the_orders_section()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "verify customer details in database",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user click order",
  "keyword": "And "
});
formatter.step({
  "name": "user enters \"\u003corder id\u003e\",\"\u003cdate added\u003e\",\"\u003ccustomer name\u003e\",\"\u003ctotal\u003e\",\"\u003cdate modified\u003e\" and order status",
  "keyword": "When "
});
formatter.step({
  "name": "clicks on filter",
  "keyword": "And "
});
formatter.step({
  "name": "verify a particular order is shown",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "order id",
        "date added",
        "customer name",
        "total",
        "date modified"
      ]
    },
    {
      "cells": [
        "599",
        "2022-02-18",
        "Krishna Mohan",
        "1110",
        "2022-02-18"
      ]
    }
  ]
});
formatter.background({
  "name": "Same cases",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is in application",
  "keyword": "Given "
});
formatter.match({
  "location": "orderstepdefinition.user_is_in_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"admin\" and \"Admin@123\"",
  "keyword": "When "
});
formatter.match({
  "location": "orderstepdefinition.user_enters_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on login",
  "keyword": "And "
});
formatter.match({
  "location": "orderstepdefinition.user_click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "verify customer details in database",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@order"
    }
  ]
});
formatter.step({
  "name": "user click order",
  "keyword": "And "
});
formatter.match({
  "location": "orderstepdefinition.user_click_order()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"599\",\"2022-02-18\",\"Krishna Mohan\",\"1110\",\"2022-02-18\" and order status",
  "keyword": "When "
});
formatter.match({
  "location": "orderstepdefinition.user_enters_and_order_status(String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on filter",
  "keyword": "And "
});
formatter.match({
  "location": "orderstepdefinition.clicks_on_filter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify a particular order is shown",
  "keyword": "Then "
});
formatter.match({
  "location": "orderstepdefinition.verify_a_particular_order_is_shown()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "verify view after a particular order is shown",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user click on order",
  "keyword": "When "
});
formatter.step({
  "name": "enter order details\"\u003corder id\u003e\",\"\u003cdate added\u003e\",\"\u003ccustomer name\u003e\",\"\u003ctotal\u003e\",\"\u003cdate modified\u003e\"and order status",
  "keyword": "And "
});
formatter.step({
  "name": "clicks onfilter button",
  "keyword": "When "
});
formatter.step({
  "name": "clicks on view",
  "keyword": "And "
});
formatter.step({
  "name": "verify  order details and customer details is shown",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "order id",
        "date added",
        "customer name",
        "total",
        "date modified"
      ]
    },
    {
      "cells": [
        "599",
        "2022-02-18",
        "Krishna Mohan",
        "1110",
        "2022-02-18"
      ]
    }
  ]
});
formatter.background({
  "name": "Same cases",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is in application",
  "keyword": "Given "
});
formatter.match({
  "location": "orderstepdefinition.user_is_in_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"admin\" and \"Admin@123\"",
  "keyword": "When "
});
formatter.match({
  "location": "orderstepdefinition.user_enters_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on login",
  "keyword": "And "
});
formatter.match({
  "location": "orderstepdefinition.user_click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "verify view after a particular order is shown",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@order"
    }
  ]
});
formatter.step({
  "name": "user click on order",
  "keyword": "When "
});
formatter.match({
  "location": "orderstepdefinition.user_click_on_order()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter order details\"599\",\"2022-02-18\",\"Krishna Mohan\",\"1110\",\"2022-02-18\"and order status",
  "keyword": "And "
});
formatter.match({
  "location": "orderstepdefinition.enter_order_details_and_order_status(String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks onfilter button",
  "keyword": "When "
});
formatter.match({
  "location": "orderstepdefinition.clicks_onfilter_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on view",
  "keyword": "And "
});
formatter.match({
  "location": "orderstepdefinition.clicks_on_view()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify  order details and customer details is shown",
  "keyword": "Then "
});
formatter.match({
  "location": "orderstepdefinition.verify_order_details_and_customer_details_is_shown()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "verify delete button after a particular order is shown",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user will click on order and enters order details\"\u003corder id\u003e\",\"\u003cdate added\u003e\",\"\u003ccustomer name\u003e\",\"\u003ctotal\u003e\",\"\u003cdate modified\u003e\"and order status",
  "keyword": "When "
});
formatter.step({
  "name": "user click on filter button",
  "keyword": "And "
});
formatter.step({
  "name": "user click on delete after result is shown",
  "keyword": "And "
});
formatter.step({
  "name": "verify validation message",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "order id",
        "date added",
        "customer name",
        "total",
        "date modified"
      ]
    },
    {
      "cells": [
        "599",
        "2022-02-18",
        "Krishna Mohan",
        "1110",
        "2022-02-18"
      ]
    }
  ]
});
formatter.background({
  "name": "Same cases",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is in application",
  "keyword": "Given "
});
formatter.match({
  "location": "orderstepdefinition.user_is_in_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"admin\" and \"Admin@123\"",
  "keyword": "When "
});
formatter.match({
  "location": "orderstepdefinition.user_enters_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on login",
  "keyword": "And "
});
formatter.match({
  "location": "orderstepdefinition.user_click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "verify delete button after a particular order is shown",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@order"
    }
  ]
});
formatter.step({
  "name": "user will click on order and enters order details\"599\",\"2022-02-18\",\"Krishna Mohan\",\"1110\",\"2022-02-18\"and order status",
  "keyword": "When "
});
formatter.match({
  "location": "orderstepdefinition.user_will_click_on_order_and_enters_order_details_and_order_status(String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on filter button",
  "keyword": "And "
});
formatter.match({
  "location": "orderstepdefinition.user_click_on_filter_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on delete after result is shown",
  "keyword": "And "
});
formatter.match({
  "location": "orderstepdefinition.user_click_on_delete_after_result_is_shown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify validation message",
  "keyword": "Then "
});
formatter.match({
  "location": "orderstepdefinition.verify_validation_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "verify edit button after a particular order is shown",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user click on order and enter order details\"\u003corder id\u003e\",\"\u003cdate added\u003e\",\"\u003ccustomer name\u003e\",\"\u003ctotal\u003e\",\"\u003cdate modified\u003e\"and order status",
  "keyword": "When "
});
formatter.step({
  "name": "user clicks on filter button",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks on edit after result is shown",
  "keyword": "When "
});
formatter.step({
  "name": "verify user is in edit page",
  "keyword": "Then "
});
formatter.step({
  "name": "enter details to be changed",
  "keyword": "And "
});
formatter.step({
  "name": "verify it is edited or not",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "order id",
        "date added",
        "customer name",
        "total",
        "date modified"
      ]
    },
    {
      "cells": [
        "599",
        "2022-02-18",
        "Krishna Mohan",
        "1110",
        "2022-02-18"
      ]
    }
  ]
});
formatter.background({
  "name": "Same cases",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is in application",
  "keyword": "Given "
});
formatter.match({
  "location": "orderstepdefinition.user_is_in_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"admin\" and \"Admin@123\"",
  "keyword": "When "
});
formatter.match({
  "location": "orderstepdefinition.user_enters_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on login",
  "keyword": "And "
});
formatter.match({
  "location": "orderstepdefinition.user_click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "verify edit button after a particular order is shown",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@order"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user click on order and enter order details\"599\",\"2022-02-18\",\"Krishna Mohan\",\"1110\",\"2022-02-18\"and order status",
  "keyword": "When "
});
formatter.match({
  "location": "orderstepdefinition.user_click_on_order_and_enter_order_details_and_order_status(String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on filter button",
  "keyword": "And "
});
formatter.match({
  "location": "orderstepdefinition.user_clicks_on_filter_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on edit after result is shown",
  "keyword": "When "
});
formatter.match({
  "location": "orderstepdefinition.user_clicks_on_edit_after_result_is_shown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify user is in edit page",
  "keyword": "Then "
});
formatter.match({
  "location": "orderstepdefinition.verify_user_is_in_edit_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter details to be changed",
  "keyword": "And "
});
formatter.match({
  "location": "orderstepdefinition.enter_details_to_be_changed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify it is edited or not",
  "keyword": "Then "
});
formatter.match({
  "location": "orderstepdefinition.verify_it_is_edited_or_not()"
});
formatter.result({
  "error_message": "junit.framework.AssertionFailedError: continue button is not working\r\n\tat junit.framework.Assert.fail(Assert.java:57)\r\n\tat stepdefinition.orderstepdefinition.verify_it_is_edited_or_not(orderstepdefinition.java:279)\r\n\tat ✽.verify it is edited or not(file:src/test/java/features/order.feature:54)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "verify add new order button",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user enters dashboard and clicks order",
  "keyword": "When "
});
formatter.step({
  "name": "clicks on add new button and enter customer details\"\u003cfirstname\u003e\",\"\u003clastname\u003e\",\"\u003ctelephone\u003e\",\"\u003cemail\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user clicks on continue and verify added or not",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname",
        "telephone",
        "email"
      ]
    },
    {
      "cells": [
        "Abhinai",
        "Tamang",
        "9735181764",
        "abhi@gmail.com"
      ]
    }
  ]
});
formatter.background({
  "name": "Same cases",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is in application",
  "keyword": "Given "
});
formatter.match({
  "location": "orderstepdefinition.user_is_in_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"admin\" and \"Admin@123\"",
  "keyword": "When "
});
formatter.match({
  "location": "orderstepdefinition.user_enters_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on login",
  "keyword": "And "
});
formatter.match({
  "location": "orderstepdefinition.user_click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "verify add new order button",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@order"
    }
  ]
});
formatter.step({
  "name": "user enters dashboard and clicks order",
  "keyword": "When "
});
formatter.match({
  "location": "orderstepdefinition.user_enters_dashboard_and_clicks_order()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on add new button and enter customer details\"Abhinai\",\"Tamang\",\"9735181764\",\"abhi@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "orderstepdefinition.clicks_on_add_new_button_and_enter_customer_details(String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on continue and verify added or not",
  "keyword": "Then "
});
formatter.match({
  "location": "orderstepdefinition.user_clicks_on_continue_and_verify_added_or_not()"
});
formatter.result({
  "error_message": "junit.framework.AssertionFailedError: continue button is not working\r\n\tat junit.framework.Assert.fail(Assert.java:57)\r\n\tat stepdefinition.orderstepdefinition.user_clicks_on_continue_and_verify_added_or_not(orderstepdefinition.java:363)\r\n\tat ✽.user clicks on continue and verify added or not(file:src/test/java/features/order.feature:63)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});