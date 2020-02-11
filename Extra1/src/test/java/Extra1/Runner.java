package Extra1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)
@CucumberOptions(
		dryRun     = false, 
		monochrome = true,
		features   = {"src/test/resources/"}, 
		glue       = {"Submarino/"},
		plugin     = {"pretty","html:target/relariosimples", 
				      "json:target/relatoriosimples.json",
				      "com.cucumber.listener.ExtentCucumberFormatter:target/relatoriodetalhado/dashboard.html"
				
				
				
				
                     }
		

		
		
		
		
)
public class Runner {

}
