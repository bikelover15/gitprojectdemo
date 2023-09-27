package cucumber_runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import cucumber_baseclass.Baseclass;
import manager_class.pagemanagers;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\featureclass\\cucumber_scenario.feature", glue = "step_defination")
public class Test_runner_class {
	public static WebDriver driver;

	@BeforeClass
	public static  void set_up() {
		driver = Baseclass.browserlaunch();

	}

	@AfterClass
	public static void teardown() {
		driver.close();

	}
}
