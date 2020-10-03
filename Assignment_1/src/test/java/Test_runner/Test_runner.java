package Test_runner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\features\\elearning.feature",glue= {"stepdefinition"},
tags="@Landingpagevalidation",
plugin = {"html:testoutput/testoutput.html","junit:testoutput/junit_xml/cucumber.xml","json:testoutput/json_output/cucumber.json"})

public class Test_runner {

}
