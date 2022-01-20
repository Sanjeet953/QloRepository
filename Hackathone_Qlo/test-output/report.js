$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("qlo.feature");
formatter.feature({
  "line": 1,
  "name": "qloApplication TestCases (End to End validation)",
  "description": "",
  "id": "qloapplication-testcases-(end-to-end-validation)",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "TC001 Account Login",
  "description": "",
  "id": "qloapplication-testcases-(end-to-end-validation);tc001-account-login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user should open link",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "click on account and enter credentials \"\u003cSheetName\u003e\" and \u003cRowNumber\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "click on submit",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Click on your personal Information",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Modify your \"\u003cname\u003e\" and DOB",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Enter \"\u003cCurrent_Password\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Click on Save",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I am logging out",
  "keyword": "And "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "qloapplication-testcases-(end-to-end-validation);tc001-account-login;",
  "rows": [
    {
      "cells": [
        "SheetName",
        "RowNumber",
        "Current_Password"
      ],
      "line": 14,
      "id": "qloapplication-testcases-(end-to-end-validation);tc001-account-login;;1"
    },
    {
      "cells": [
        "Accountcreation",
        "0",
        "Test@123"
      ],
      "line": 15,
      "id": "qloapplication-testcases-(end-to-end-validation);tc001-account-login;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 26403800,
  "status": "passed"
});
formatter.before({
  "duration": 62437541300,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "TC001 Account Login",
  "description": "",
  "id": "qloapplication-testcases-(end-to-end-validation);tc001-account-login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user should open link",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "click on account and enter credentials \"Accountcreation\" and 0",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "click on submit",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Click on your personal Information",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Modify your \"\u003cname\u003e\" and DOB",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Enter \"Test@123\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Click on Save",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I am logging out",
  "keyword": "And "
});
formatter.match({
  "location": "QloStepdefinition.user_should_open_link()"
});
formatter.result({
  "duration": 17226266200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Accountcreation",
      "offset": 40
    },
    {
      "val": "0",
      "offset": 61
    }
  ],
  "location": "QloStepdefinition.click_on_accountand_enter_credentials_and(String,int)"
});
formatter.result({
  "duration": 27751263100,
  "status": "passed"
});
formatter.match({
  "location": "QloStepdefinition.click_on_submit()"
});
formatter.result({
  "duration": 5158099000,
  "status": "passed"
});
formatter.match({
  "location": "QloStepdefinition.click_on_your_personal_Information()"
});
formatter.result({
  "duration": 9791854000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cname\u003e",
      "offset": 13
    }
  ],
  "location": "QloStepdefinition.modify_your_and_DOB(String)"
});
formatter.result({
  "duration": 11784466100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test@123",
      "offset": 7
    }
  ],
  "location": "QloStepdefinition.enter_Current_Password_with(String)"
});
formatter.result({
  "duration": 5609171700,
  "status": "passed"
});
formatter.match({
  "location": "QloStepdefinition.click_on_Save()"
});
formatter.result({
  "duration": 2710747900,
  "status": "passed"
});
formatter.match({
  "location": "QloStepdefinition.i_am_logging_out()"
});
formatter.result({
  "duration": 5266441700,
  "status": "passed"
});
formatter.after({
  "duration": 427700,
  "status": "passed"
});
formatter.after({
  "duration": 66400,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 17,
  "name": "TC002 Contact us",
  "description": "",
  "id": "qloapplication-testcases-(end-to-end-validation);tc002-contact-us",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 19,
  "name": "User enters the URL",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "User Click on the Menu",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "Click on Contact",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Select the Subject as Customer Service",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Enter the valid \"\u003cEmail\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Enter the Message",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Click on Send Message button",
  "keyword": "And "
});
formatter.examples({
  "line": 26,
  "name": "",
  "description": "",
  "id": "qloapplication-testcases-(end-to-end-validation);tc002-contact-us;",
  "rows": [
    {
      "cells": [
        "Email"
      ],
      "line": 27,
      "id": "qloapplication-testcases-(end-to-end-validation);tc002-contact-us;;1"
    },
    {
      "cells": [
        "aerosanjeet8122@gmail.com"
      ],
      "line": 28,
      "id": "qloapplication-testcases-(end-to-end-validation);tc002-contact-us;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 55509700,
  "status": "passed"
});
formatter.before({
  "duration": 15189512700,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "TC002 Contact us",
  "description": "",
  "id": "qloapplication-testcases-(end-to-end-validation);tc002-contact-us;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 19,
  "name": "User enters the URL",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "User Click on the Menu",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "Click on Contact",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Select the Subject as Customer Service",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Enter the valid \"aerosanjeet8122@gmail.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Enter the Message",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Click on Send Message button",
  "keyword": "And "
});
formatter.match({
  "location": "QloStepdefinition.user_enters_the_URL()"
});
formatter.result({
  "duration": 5252796000,
  "status": "passed"
});
formatter.match({
  "location": "QloStepdefinition.user_Click_on_the_Menu()"
});
formatter.result({
  "duration": 790554900,
  "status": "passed"
});
formatter.match({
  "location": "QloStepdefinition.click_on_Contact()"
});
formatter.result({
  "duration": 3605063400,
  "status": "passed"
});
formatter.match({
  "location": "QloStepdefinition.select_the_Subject_as_Customer_Service()"
});
formatter.result({
  "duration": 930222700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "aerosanjeet8122@gmail.com",
      "offset": 17
    }
  ],
  "location": "QloStepdefinition.enter_the_valid(String)"
});
formatter.result({
  "duration": 629868600,
  "status": "passed"
});
formatter.match({
  "location": "QloStepdefinition.enter_the_Message()"
});
formatter.result({
  "duration": 291379300,
  "status": "passed"
});
formatter.match({
  "location": "QloStepdefinition.click_on_Send_Message_button()"
});
formatter.result({
  "duration": 5199016700,
  "status": "passed"
});
formatter.after({
  "duration": 70200,
  "status": "passed"
});
formatter.after({
  "duration": 47800,
  "status": "passed"
});
formatter.before({
  "duration": 122892500,
  "status": "passed"
});
formatter.before({
  "duration": 19197230300,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "TC003 Verify if the user is able to remove selected Room from the cart",
  "description": "",
  "id": "qloapplication-testcases-(end-to-end-validation);tc003-verify-if-the-user-is-able-to-remove-selected-room-from-the-cart",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 32,
  "name": "User able to launch chrome browser sucessfully",
  "keyword": "Given "
});
formatter.step({
  "line": 33,
  "name": "Search for room based on location type and dates",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "Select Hotel as The Hotel Prime",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "Select Check In Date as 9th June From Calendar",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "Select Check Out Date as 11th June From Calendar",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "Click on Search Now",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "Go to Executive Rooms and click on Book Now",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "Click on Proceed to checkout on pop up window",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "Mouse over the order basket from the top and click to remove the product from my cart button",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "Make sure you cart is empty",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "Take a screenshot of the  YOUR BOOKING CART page with the success message Till now you did not added any room in your cart",
  "keyword": "And "
});
formatter.match({
  "location": "QloStepdefinition.user_able_to_launch_chrome_browser_sucessfully()"
});
formatter.result({
  "duration": 7262943800,
  "status": "passed"
});
formatter.match({
  "location": "QloStepdefinition.search_for_room_based_on_location_type_and_dates()"
});
formatter.result({
  "duration": 1209759400,
  "status": "passed"
});
formatter.match({
  "location": "QloStepdefinition.select_Hotel_as_The_Hotel_Prime()"
});
formatter.result({
  "duration": 1350171200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "9",
      "offset": 24
    }
  ],
  "location": "QloStepdefinition.select_Check_In_Date_as_th_June_From_Calendar(int)"
});
formatter.result({
  "duration": 1907922400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "11",
      "offset": 25
    }
  ],
  "location": "QloStepdefinition.select_Check_Out_Date_as_th_June_From_Calendar(int)"
});
formatter.result({
  "duration": 654082000,
  "status": "passed"
});
formatter.match({
  "location": "QloStepdefinition.click_on_Search_Now()"
});
formatter.result({
  "duration": 7762446400,
  "status": "passed"
});
formatter.match({
  "location": "QloStepdefinition.go_to_Executive_Rooms_and_click_on_Book_Now()"
});
formatter.result({
  "duration": 865331800,
  "status": "passed"
});
formatter.match({
  "location": "QloStepdefinition.click_on_Proceed_to_checkout_on_pop_up_window()"
});
formatter.result({
  "duration": 6229215000,
  "status": "passed"
});
formatter.match({
  "location": "QloStepdefinition.mouse_over_the_order_basket_from_the_top_and_click_to_remove_the_product_from_my_cart_button()"
});
formatter.result({
  "duration": 4565933700,
  "status": "passed"
});
formatter.match({
  "location": "QloStepdefinition.make_sure_you_cart_is_empty()"
});
formatter.result({
  "duration": 506398600,
  "status": "passed"
});
formatter.match({
  "location": "QloStepdefinition.take_a_screenshot_of_the_YOUR_BOOKING_CART_page_with_the_success_message_Till_now_you_did_not_added_any_room_in_your_cart()"
});
formatter.result({
  "duration": 7794112900,
  "status": "passed"
});
formatter.after({
  "duration": 173200,
  "status": "passed"
});
formatter.after({
  "duration": 59100,
  "status": "passed"
});
formatter.before({
  "duration": 746200,
  "status": "passed"
});
formatter.before({
  "duration": 108073048000,
  "status": "passed"
});
formatter.scenario({
  "line": 44,
  "name": "TC004 Verify Working with Links",
  "description": "",
  "id": "qloapplication-testcases-(end-to-end-validation);tc004-verify-working-with-links",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 45,
  "name": "Visit http://newtours/demoaut.com",
  "keyword": "Given "
});
formatter.step({
  "line": 46,
  "name": "Validate sign-on link is working?",
  "keyword": "Then "
});
formatter.step({
  "line": 47,
  "name": "Validate register link is working?",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "Validate support link is working?",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "Validate contact link is working?",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "Validate title check after login and search flight",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "Validate sign-in feature is working?",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "Validate sign-in, searching, buying ticket flow is working?",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "perform sign-in and logout testcase, login-searching and logout, login searching, book a flight and logout in one test case with different valid usernames and valid passwords. Just think how can we use store command???",
  "keyword": "And "
});
formatter.match({
  "location": "QloStepdefinition.visit_http_newtours_demoaut_com()"
});
formatter.result({
  "duration": 60403662500,
  "status": "passed"
});
formatter.match({
  "location": "QloStepdefinition.validate_sign_on_link_is_working()"
});
formatter.result({
  "duration": 28291502500,
  "status": "passed"
});
formatter.match({
  "location": "QloStepdefinition.validate_register_link_is_working()"
});
formatter.result({
  "duration": 10056386800,
  "status": "passed"
});
formatter.match({
  "location": "QloStepdefinition.validate_support_link_is_working()"
});
formatter.result({
  "duration": 3380062200,
  "status": "passed"
});
formatter.match({
  "location": "QloStepdefinition.validate_contact_link_is_working()"
});
formatter.result({
  "duration": 3182849900,
  "status": "passed"
});
formatter.match({
  "location": "QloStepdefinition.validate_title_check_after_login_and_search_flight()"
});
formatter.result({
  "duration": 6363310800,
  "status": "passed"
});
formatter.match({
  "location": "QloStepdefinition.validate_sign_in_feature_is_working()"
});
formatter.result({
  "duration": 9773221600,
  "status": "passed"
});
formatter.match({
  "location": "QloStepdefinition.validate_sign_in_searching_buying_ticket_flow_is_working()"
});
formatter.result({
  "duration": 13046823700,
  "status": "passed"
});
formatter.match({
  "location": "QloStepdefinition.perform_sign_in_and_logout_testcase_login_searching_and_logout_login_searching_book_a_flight_and_logout_in_one_test_case_with_different_valid_usernames_and_valid_passwords_Just_think_how_can_we_use_store_command()"
});
formatter.result({
  "duration": 2597791200,
  "status": "passed"
});
formatter.after({
  "duration": 97900,
  "status": "passed"
});
formatter.after({
  "duration": 37300,
  "status": "passed"
});
});