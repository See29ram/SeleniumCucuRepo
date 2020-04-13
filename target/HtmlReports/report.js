$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("yahoo.feature");
formatter.feature({
  "line": 2,
  "name": "This feature for yahoo",
  "description": "",
  "id": "this-feature-for-yahoo",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Yahoo"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "scenario for yahoo search",
  "description": "",
  "id": "this-feature-for-yahoo;scenario-for-yahoo-search",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am navigating to \"https://www.yahoo.com\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I look for \"Selenium\" and click Search",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.yahoo.com",
      "offset": 20
    }
  ],
  "location": "SearchStepDefn.i_am_navigating_to(String)"
});
formatter.result({
  "duration": 23480214700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Selenium",
      "offset": 12
    }
  ],
  "location": "SearchStepDefn.i_look_for_and_click_Search(String)"
});
formatter.result({
  "duration": 6589511000,
  "status": "passed"
});
});