package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"D:\\Training\\ShopWithEG\\src\\test\\resources\\features\\login.feature"},
		glue= {"stepDefinations"},
		plugin= {"pretty","html:target/reports.html"}
		)

public class TestRunner {


}
