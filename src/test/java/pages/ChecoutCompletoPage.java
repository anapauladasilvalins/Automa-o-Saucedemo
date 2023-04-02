package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChecoutCompletoPage {
	
	private WebDriver driver;
	
	public ChecoutCompletoPage(WebDriver driver) {
		this.driver = driver;
	}
	private By spanChecoutCompleto = By.xpath("//span[contains(text(), 'Checkout: Complete!')]");
	
	public boolean validarSpanChecoutCompleto(String texto) {
		try {
			Thread.sleep(2*1000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return texto.contentEquals(driver.findElement(spanChecoutCompleto).getText());
	}
	

}
