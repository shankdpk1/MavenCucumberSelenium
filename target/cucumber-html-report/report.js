$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test.feature");
formatter.feature({
  "line": 1,
  "name": "Test",
  "description": "",
  "id": "test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Test11",
  "description": "",
  "id": "test;test11",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "print msg",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.printMsg()"
});
formatter.result({
  "duration": 103287500,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 6,
      "value": "#    Then print msg1"
    }
  ],
  "line": 9,
  "name": "Test12",
  "description": "",
  "id": "test;test12",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "print msg",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.printMsg()"
});
formatter.result({
  "duration": 555300,
  "status": "passed"
});
});