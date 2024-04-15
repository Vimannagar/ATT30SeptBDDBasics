package appfeatures;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"classpath:appfeatures"},
		
		glue = {"appfeatures"},
		
		plugin = {"pretty", "html:target/cucumber-reports/reports.html", 
				
				"json:target/cucumber-reports/report.json"	
					},
		
		tags = "@functional"
		
		
		
	)




public class MagnetoRunnerTest extends AbstractTestNGCucumberTests {

}
