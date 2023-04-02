package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FinalizarCompraPage {
	
	private WebDriver driver;
	
	public FinalizarCompraPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By divPaymentInformation = By.xpath("//div[contains(text(), 'Payment Information')]");
	private By buttonFinish = By.id("finish");
	
	public boolean validarDivPaymentInformation(String texto) {
		try {
			Thread.sleep(2*1000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return texto.contentEquals(driver.findElement(divPaymentInformation).getText());
	}
		
	public ChecoutCompletoPage clicarButtonFinish() {
		driver.findElement(buttonFinish).click();
		return new ChecoutCompletoPage(driver);
	}
	

}
