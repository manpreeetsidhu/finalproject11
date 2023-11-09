package finalprojecttestrunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import finalprojectutility.parent111;

//cucumber options 
@CucumberOptions(features={"/src/test/resources/Feature_File11"},
plugin= {"json:target/cucumber.json"},
glue="finalprojectstepdefination")


public class testrunfinalproject extends AbstractTestNGCucumberTests {
	
	@BeforeTest
	public void metasetup1() {
		parent111 test1 = new parent111();
		test1.metaBrowser1();
		
	}
	@AfterTest
	public void closeurl1() {
		parent111 test1 = new parent111(); {
			test1.driver.quit();
		}

	}
}
