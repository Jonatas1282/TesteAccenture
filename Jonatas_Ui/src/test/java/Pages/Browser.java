package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	
	private static WebDriver driver;
	
	public static WebDriver adriver () {
		return getDriver();
	}

	public void abrirNavegador (String site) {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver ();
		getDriver().get(site);
		getDriver().manage().window().maximize();
		
	}

	public static WebDriver getDriver() {
		return driver;
	}
	
}
