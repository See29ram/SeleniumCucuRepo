$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/com/webdriverlearn/pgfactory/BugCreation.feature");
formatter.feature({
  "line": 1,
  "name": "Bugzilla bug creation",
  "description": "",
  "id": "bugzilla-bug-creation",
  "keyword": "Feature"
});
formatter.before({
  "duration": 37710529100,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "Bug creating in Bugzilla",
  "description": "",
  "id": "bugzilla-bug-creation;bug-creating-in-bugzilla",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "Bugzilla_I am at Bugzilla Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Bugzilla_I click on file a bug and navigate to login page",
  "keyword": "Then "
});
formatter.step({
  "line": 5,
  "name": "Bugzilla_Page Title should be \"Log in to Bugzilla\"",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "Bugzilla_I enter login details and navigate to Product Selection",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Bugzilla_I Testng Product and navigate submit bug page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Bugzilla_I Enter Componente as \"Comp2\" Version as \"v1\" Sev as \"minor\" HW as \"Other\" Os as \"Linux\" Priority as \"Low\" Sum \"Summary Done\" Desc \"Description done\"",
  "keyword": "Then "
});
formatter.match({
  "location": "BugStepDefn.bugzilla_i_am_at_Bugzilla_Homepage()"
});
formatter.result({
  "duration": 11720366900,
  "status": "passed"
});
formatter.match({
  "location": "BugStepDefn.bugzilla_i_click_on_file_a_bug_and_navigate_to_login_page()"
});
formatter.result({
  "duration": 7155918000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Log in to Bugzilla",
      "offset": 31
    }
  ],
  "location": "BugStepDefn.bugzilla_page_Title_should_be(String)"
});
formatter.result({
  "duration": 7945400,
  "error_message": "java.lang.AssertionError: Title Failed\r\n\tat org.testng.Assert.fail(Assert.java:96)\r\n\tat com.webdriverlearn.pgfactory.BugStepDefn.bugzilla_page_Title_should_be(BugStepDefn.java:42)\r\n\tat ✽.And Bugzilla_Page Title should be \"Log in to Bugzilla\"(src/main/java/com/webdriverlearn/pgfactory/BugCreation.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "BugStepDefn.bugzilla_i_enter_login_details_and_navigate_to_Product_Selection()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BugStepDefn.bugzilla_i_Testng_Product_and_navigate_submit_bug_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Comp2",
      "offset": 32
    },
    {
      "val": "v1",
      "offset": 51
    },
    {
      "val": "minor",
      "offset": 63
    },
    {
      "val": "Other",
      "offset": 77
    },
    {
      "val": "Linux",
      "offset": 91
    },
    {
      "val": "Low",
      "offset": 111
    },
    {
      "val": "Summary Done",
      "offset": 121
    },
    {
      "val": "Description done",
      "offset": 141
    }
  ],
  "location": "BugStepDefn.bugzilla_i_Enter_Componente_as_Version_as_Sev_as_HW_as_Os_as_Priority_as_Sum_Desc(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 8456388400,
  "status": "passed"
});
formatter.before({
  "duration": 17286894100,
  "status": "passed"
});
formatter.before({
  "duration": 76400,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "TestProduct Bug Creation",
  "description": "",
  "id": "bugzilla-bug-creation;testproduct-bug-creation",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "Bugzilla_I am at Bugzilla Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "Bugzilla_I click on file a bug and navigate to login page",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Bugzilla_I enter login details and navigate to Product Selection",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "TestProduct Test Product and navigate submit bug page",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "TestProduct Enter Componente as \"Comp2\" Version as \"v1\" Sev as \"minor\" HW as \"Other\" Os as \"Linux\" Priority as \"Low\" Sum \"Summary Done\" Desc \"Description done\"",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "TestProduct click on Submit Bug",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "TestProduct am summary page and i logout",
  "keyword": "And "
});
formatter.match({
  "location": "BugStepDefn.bugzilla_i_am_at_Bugzilla_Homepage()"
});
formatter.result({
  "duration": 5440855400,
  "status": "passed"
});
formatter.match({
  "location": "BugStepDefn.bugzilla_i_click_on_file_a_bug_and_navigate_to_login_page()"
});
formatter.result({
  "duration": 3751932500,
  "status": "passed"
});
formatter.match({
  "location": "BugStepDefn.bugzilla_i_enter_login_details_and_navigate_to_Product_Selection()"
});
formatter.result({
  "duration": 3944247000,
  "status": "passed"
});
formatter.match({
  "location": "TestProductBugStepDefnOne.testproduct_Test_Product_and_navigate_submit_bug_page()"
});
formatter.result({
  "duration": 3084615600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Comp2",
      "offset": 33
    },
    {
      "val": "v1",
      "offset": 52
    },
    {
      "val": "minor",
      "offset": 64
    },
    {
      "val": "Other",
      "offset": 78
    },
    {
      "val": "Linux",
      "offset": 92
    },
    {
      "val": "Low",
      "offset": 112
    },
    {
      "val": "Summary Done",
      "offset": 122
    },
    {
      "val": "Description done",
      "offset": 142
    }
  ],
  "location": "TestProductBugsStepDefnTwo.testproduct_Enter_Componente_as_Version_as_Sev_as_HW_as_Os_as_Priority_as_Sum_Desc(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 1199833500,
  "status": "passed"
});
formatter.match({
  "location": "TestProductBugsStepDefnTwo.testproduct_click_on_Submit_Bug()"
});
formatter.result({
  "duration": 4753916200,
  "status": "passed"
});
formatter.match({
  "location": "TestProductBugsStepDefnTwo.testproduct_am_summary_page_and_i_logout()"
});
formatter.result({
  "duration": 2230598600,
  "status": "passed"
});
formatter.after({
  "duration": 4498685500,
  "status": "passed"
});
formatter.before({
  "duration": 7850422700,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "TestProduct2 Bug Creation",
  "description": "",
  "id": "bugzilla-bug-creation;testproduct2-bug-creation",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 21,
  "name": "Bugzilla_I am at Bugzilla Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "Bugzilla_I click on file a bug and navigate to login page",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Bugzilla_I enter login details and navigate to Product Selection",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "Bugzilla_I click on Home button",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "Bugzilla_I click on New Button",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "TestProduct Test Product and navigate submit bug page",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "TestProduct Enter Componente as \"Comp2\" Version as \"v1\" Sev as \"minor\" HW as \"Other\" Os as \"Linux\" Priority as \"Low\" Sum \"Summary Done\" Desc \"Description done\"",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "TestProduct click on Submit Bug",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "TestProduct am summary page and i logout",
  "keyword": "And "
});
formatter.match({
  "location": "BugStepDefn.bugzilla_i_am_at_Bugzilla_Homepage()"
});
formatter.result({
  "duration": 4724105300,
  "status": "passed"
});
formatter.match({
  "location": "BugStepDefn.bugzilla_i_click_on_file_a_bug_and_navigate_to_login_page()"
});
formatter.result({
  "duration": 2705318200,
  "status": "passed"
});
formatter.match({
  "location": "BugStepDefn.bugzilla_i_enter_login_details_and_navigate_to_Product_Selection()"
});
formatter.result({
  "duration": 3441500200,
  "status": "passed"
});
formatter.match({
  "location": "BugStepDefn.bugzilla_i_click_on_Home_button()"
});
formatter.result({
  "duration": 2349881100,
  "status": "passed"
});
formatter.match({
  "location": "BugStepDefn.bugzilla_i_click_on_New_Button()"
});
formatter.result({
  "duration": 3032609100,
  "status": "passed"
});
formatter.match({
  "location": "TestProductBugStepDefnOne.testproduct_Test_Product_and_navigate_submit_bug_page()"
});
formatter.result({
  "duration": 2732899400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Comp2",
      "offset": 33
    },
    {
      "val": "v1",
      "offset": 52
    },
    {
      "val": "minor",
      "offset": 64
    },
    {
      "val": "Other",
      "offset": 78
    },
    {
      "val": "Linux",
      "offset": 92
    },
    {
      "val": "Low",
      "offset": 112
    },
    {
      "val": "Summary Done",
      "offset": 122
    },
    {
      "val": "Description done",
      "offset": 142
    }
  ],
  "location": "TestProductBugsStepDefnTwo.testproduct_Enter_Componente_as_Version_as_Sev_as_HW_as_Os_as_Priority_as_Sum_Desc(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 1062496500,
  "status": "passed"
});
formatter.match({
  "location": "TestProductBugsStepDefnTwo.testproduct_click_on_Submit_Bug()"
});
formatter.result({
  "duration": 4058055400,
  "status": "passed"
});
formatter.match({
  "location": "TestProductBugsStepDefnTwo.testproduct_am_summary_page_and_i_logout()"
});
formatter.result({
  "duration": 4567532900,
  "status": "passed"
});
formatter.after({
  "duration": 3061160500,
  "status": "passed"
});
});