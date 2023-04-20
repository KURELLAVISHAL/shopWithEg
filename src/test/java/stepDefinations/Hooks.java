package stepDefinations;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utility.DriverFactory;

public class Hooks {
	
	
	DriverFactory driverFactory=new DriverFactory();
	
	@Before
	public void beforeMethod()
	{
		driverFactory.init();
	}
	
	@After
	public void afterMethod()
	{
		DriverFactory.driver.quit();
	}

}
