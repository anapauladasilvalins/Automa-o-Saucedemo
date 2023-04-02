package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeuCarrinhoPage {
private WebDriver driver;
	
	public SeuCarrinhoPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By buttonCheckout = By.id("checkout");
	
	public boolean validarButtonCheckout(String texto) {
		try {
			Thread.sleep(2*1000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return texto.contentEquals(driver.findElement(buttonCheckout).getText());
	}
	
	public CheckoutPage clicarButtonCheckout() {
		driver.findElement(buttonCheckout).click();
		return new CheckoutPage(driver);
	}
	
}
