package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DetalhesProdutoPage {
	
	private WebDriver driver;

	public DetalhesProdutoPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By divTituloProduto = By.xpath("//div[contains(text(), 'Sauce Labs Bike Light')]");
	private By buttonAddToCart = By.id("add-to-cart-sauce-labs-bike-light");
	private By aIconeCarrinho = By.xpath("//a[@class='shopping_cart_link']");
	
	public boolean validardivTituloProduto (String texto) {
		try {
			Thread.sleep(2*1000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return texto.contentEquals(driver.findElement(divTituloProduto).getText());
	}
	
	public void clicarButtonAddToCart() {
		try {
			Thread.sleep(2*1000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(buttonAddToCart).click();
	}
	
	public SeuCarrinhoPage clicarAIconeCarrinho() {
		try {
			Thread.sleep(2*1000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(aIconeCarrinho).click();
		
		return new SeuCarrinhoPage(driver);
	}
	
	

}
