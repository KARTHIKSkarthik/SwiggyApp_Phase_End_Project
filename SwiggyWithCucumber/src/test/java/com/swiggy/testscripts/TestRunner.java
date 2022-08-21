package com.swiggy.testscripts;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "Features//order_food.feature"
, glue = "com.swiggy.testscripts"
, plugin = {"progress","html:target/Cucumber.html"}
, tags = "@SWIGGY"
//,dryRun = true
)
public class TestRunner extends AbstractTestNGCucumberTests 
{
	
	

}
