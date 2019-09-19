$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test1.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 20,
  "name": "Test petclicnic website",
  "description": "",
  "id": "test-petclicnic-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 19,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 22,
  "name": "launch petclinic website",
  "description": "",
  "id": "test-petclicnic-website;launch-petclinic-website",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 23,
  "name": "Open chrome and start application",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "I click on  home_button",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "user should be able to see welcome on page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepTest.open_chrome_and_start_application()"
});
formatter.result({
  "duration": 7273457511,
  "status": "passed"
});
formatter.match({
  "location": "StepTest.i_click_on_home_button()"
});
formatter.result({
  "duration": 3236947872,
  "status": "passed"
});
formatter.match({
  "location": "StepTest.user_should_be_able_to_see_welcome_on_page()"
});
formatter.result({
  "duration": 19194369,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Adding owner",
  "description": "",
  "id": "test-petclicnic-website;adding-owner",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 29,
  "name": "on Find owners tab",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "I click on Findowners_link",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "user should be able to see Findowners_text on page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepTest.on_Find_owners_tab()"
});
formatter.result({
  "duration": 17740880,
  "status": "passed"
});
formatter.match({
  "location": "StepTest.i_click_on_Findowners_link()"
});
formatter.result({
  "duration": 391412923,
  "status": "passed"
});
formatter.match({
  "location": "StepTest.user_should_be_able_to_see_Findowners_text_on_page()"
});
formatter.result({
  "duration": 26147628,
  "status": "passed"
});
formatter.scenario({
  "line": 34,
  "name": "Adding owner",
  "description": "",
  "id": "test-petclicnic-website;adding-owner",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 35,
  "name": "on Find owners page",
  "keyword": "Given "
});
formatter.step({
  "line": 36,
  "name": "I click on Addowner_button",
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "user should be able to see NewOwner_text on page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepTest.on_Find_owners_page()"
});
formatter.result({
  "duration": 117774,
  "status": "passed"
});
formatter.match({
  "location": "StepTest.i_click_on_Addowner_button()"
});
formatter.result({
  "duration": 5523150029,
  "status": "passed"
});
formatter.match({
  "location": "StepTest.user_should_be_able_to_see_NewOwner_text_on_page()"
});
formatter.result({
  "duration": 21533278,
  "status": "passed"
});
formatter.scenario({
  "line": 39,
  "name": "Enter owner details",
  "description": "",
  "id": "test-petclicnic-website;enter-owner-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 41,
  "name": "on NewOwner page",
  "keyword": "Given "
});
formatter.step({
  "line": 42,
  "name": "I enter \"heena\" on firstname_textbox",
  "keyword": "When "
});
formatter.step({
  "line": 43,
  "name": "I enter \"mehra\" on lastname_textbox",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "I enter \"kondapur flat 202\" on Address_textbox",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "I enter \"hyderabad\" on city_textbox",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "I enter \"123465\" on telephone_textbox",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "I click on AddOwner_button",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "user should be able to see OwnerInformation_text on page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepTest.on_NewOwner_page()"
});
formatter.result({
  "duration": 102964,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "heena",
      "offset": 9
    }
  ],
  "location": "StepTest.i_enter_on_firstname_textbox(String)"
});
formatter.result({
  "duration": 5079769431,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mehra",
      "offset": 9
    }
  ],
  "location": "StepTest.i_enter_on_lastname_textbox(String)"
});
formatter.result({
  "duration": 5067919022,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "kondapur flat 202",
      "offset": 9
    }
  ],
  "location": "StepTest.i_enter_on_Address_textbox(String)"
});
formatter.result({
  "duration": 5090813404,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "hyderabad",
      "offset": 9
    }
  ],
  "location": "StepTest.i_enter_on_city_textbox(String)"
});
formatter.result({
  "duration": 5061397718,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123465",
      "offset": 9
    }
  ],
  "location": "StepTest.i_enter_on_telephone_textbox(String)"
});
formatter.result({
  "duration": 5082577322,
  "status": "passed"
});
formatter.match({
  "location": "StepTest.i_click_on_AddOwner_button()"
});
formatter.result({
  "duration": 7036857672,
  "status": "passed"
});
formatter.match({
  "location": "StepTest.user_should_be_able_to_see_OwnerInformation_text_on_page()"
});
formatter.result({
  "duration": 22839725,
  "status": "passed"
});
});