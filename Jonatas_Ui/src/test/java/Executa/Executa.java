package Executa;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import Pages.Browser;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions (
		
		features = "src/test/resources/Features",
		glue = "Steps",
		tags = "@Executa",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty", "html:target/report.html", "json:target/report.json"}
		
		)


public class Executa extends Browser {

	@AfterClass
	public static void fecharPagina () {
		adriver().quit();
	}

	
}
