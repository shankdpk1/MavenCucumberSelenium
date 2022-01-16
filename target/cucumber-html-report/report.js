$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/shash/Maven/MavenCucumberSelenium/Features/googleSearch.feature");
formatter.feature({
  "line": 1,
  "name": "Test Google",
  "description": "",
  "id": "test-google",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8943331100,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Test Google Seaerch",
  "description": "",
  "id": "test-google;test-google-seaerch",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Launch Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Google is open",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Searching Selenium",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Selenium is searched successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.Launch_Browser()"
});
formatter.result({
  "duration": 356458600,
  "status": "passed"
});
formatter.match({
  "location": "Steps.Google_is_open()"
});
formatter.result({
  "duration": 2587978300,
  "status": "passed"
});
formatter.match({
  "location": "Steps.Searching_Selenium()"
});
formatter.result({
  "duration": 1849807500,
  "status": "passed"
});
formatter.match({
  "location": "Steps.Selenium_is_searched_successfully()"
});
formatter.result({
  "duration": 10479300,
  "status": "passed"
});
formatter.after({
  "duration": 1719887600,
  "status": "passed"
});
});