package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
	
	private WebDriver driver;

	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By spanTituloCheckout = By.xpath("//span[contains(text(), 'Checkout: Your Information')]");
	private By inputFirstName = By.id("first-name");
	private By inputLastName = By.id("last-name");
	private By inputPostalCode = By.id("postal-code");
	private By buttonContinue = By.id("continue");
	private By h3MensagemErro = By.xpath("//h3[contains(text(), 'Error: Last Name is required')]");
	
	public boolean validarSpanTituloCheckout(String texto) {
		try {
			Thread.sleep(2*1000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return texto.contentEquals(driver.findElement(spanTituloCheckout).getText());
	}
	
	public void preencherFormularioCheckout(String firstName, String lastName, String postalCode) {
		driver.findElement(inputFirstName).sendKeys(firstName);
		driver.findElement(inputLastName).sendKeys(lastName);
		driver.findElement(inputPostalCode).sendKeys(postalCode);
	}
	
	public FinalizarCompraPage clicarButtonContinue() {
		driver.findElement(buttonContinue).click();
		return new FinalizarCompraPage(driver);
	}
	
	public boolean validarH3MensagemErro(String texto) {
		try {
			Thread.sleep(2*1000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return texto.contentEquals(driver.findElement(h3MensagemErro).getText());
	}

}
