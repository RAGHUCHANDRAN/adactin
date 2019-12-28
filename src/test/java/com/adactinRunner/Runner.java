package com.adactinRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\adactin\\feature",
						glue="com\\adactin\\StepDefinition",
                        plugin= "com.cucumber.listener.ExtentCucumberFormatter:Reports/reports.html",
                        monochrome = true,
                        dryRun = false,
                        strict = true
                        )
                        
public class Runner {
      
}
