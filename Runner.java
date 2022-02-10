package testcase;

import base.BaseClass;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(features = "src/main/java/features"
				, glue = "pages"
				, monochrome = true
				, dryRun = false
				, snippets = SnippetType.CAMELCASE
				, tags = "@LeadScenarios"
				, publish = true)
public class Runner extends BaseClass {

}
