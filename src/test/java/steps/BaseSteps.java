package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseSteps {
	
	public static WebDriver driver;
	
	@Before
	public static void inicializar() {
		System.setProperty("webdriver.chrome.driver", "C:\\DriversWeb\\ChromeDriver-111.055\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
//	@After
//	public static void finlizar() {
//		driver.quit();
//	}
	

}
