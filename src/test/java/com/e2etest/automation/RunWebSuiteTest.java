package com.e2etest.automation;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;
@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"srcc/spec/features"},
		plugin = {"pretty", "html:target/cucumber-report.html"},
		tags = ("@"),
		monochrome = true, 
		snippets = CAMELCASE
		)
public class RunWebSuiteTest {

}
