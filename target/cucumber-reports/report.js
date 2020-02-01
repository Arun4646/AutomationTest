$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("MyTest.feature");
formatter.feature({
  "line": 1,
  "name": "My feature tests are described here",
  "description": "",
  "id": "my-feature-tests-are-described-here",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4073318572,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "CommBank Test",
  "description": "",
  "id": "my-feature-tests-are-described-here;commbank-test",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@RunCommBank"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I choose configurations from config file",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I open Commbank Page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I navigate to the Travel money overseas section",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I verify whether the subtopic exists",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I scroll down and click on NetBank login",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "NetBank page should be opened up",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "CommBankSteps.i_choose_configurations_from_config_file()"
});
formatter.result({
  "duration": 163862128,
  "status": "passed"
});
formatter.match({
  "location": "CommBankSteps.i_open_Commbank_Page()"
});
formatter.result({
  "duration": 1632208944,
  "status": "passed"
});
formatter.match({
  "location": "CommBankSteps.i_navigate_to_the_Travel_money_overseas_section()"
});
formatter.result({
  "duration": 1397329068,
  "status": "passed"
});
formatter.match({
  "location": "CommBankSteps.i_verify_whether_the_subtopic_exists()"
});
formatter.result({
  "duration": 34088885,
  "status": "passed"
});
formatter.match({
  "location": "CommBankSteps.i_scroll_down_and_click_on_NetBank_login()"
});
formatter.result({
  "duration": 1297987016,
  "status": "passed"
});
formatter.match({
  "location": "CommBankSteps.netbank_page_should_be_opened_up()"
});
formatter.result({
  "duration": 189137707,
  "status": "passed"
});
formatter.match({
  "location": "CommBankSteps.i_close_the_browser()"
});
formatter.result({
  "duration": 1324045757,
  "status": "passed"
});
formatter.after({
  "duration": 49014,
  "status": "passed"
});
});