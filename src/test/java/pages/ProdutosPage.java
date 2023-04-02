package pages;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProdutosPage {
	
	private WebDriver driver;
	
	public ProdutosPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By spanProdutos = By.xpath("//span[contains(text(),'Products')]");
	private By divProduto = By.xpath("//div[contains(text(),'Sauce Labs Bike Light')]");
	private By selectFiltro = By.xpath("//select[@class='product_sort_container']");
	private By buttonAddToCart = By.id("add-to-cart-sauce-labs-backpack");
	private By spanCarrinho = By.xpath("//span[contains(text(), '1')]");
	
	public boolean validarSpanProdutos(String texto) {
		try {
			Thread.sleep(2*1000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return texto.contentEquals(driver.findElement(spanProdutos).getText());
	}
	
	public DetalhesProdutoPage clicarDivProduto() {
		try {
			Thread.sleep(2*1000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//Rolagem para cima
		JavascriptExecutor rolagem = (JavascriptExecutor) driver;
		rolagem.executeScript("scroll(0, -250);");
		
		try {
			Thread.sleep(2*1000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//Rolagem para baixo
		rolagem.executeScript("scroll(0, 950)", "");
		
		try {
			Thread.sleep(2*1000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(divProduto).click();
		return new DetalhesProdutoPage(driver);
	}
	
	public void escolhoSelectFiltro(String texto) {
		WebElement comboBoxElemento = driver.findElement(selectFiltro);
		try {
			Thread.sleep(2*1000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		comboBoxElemento.sendKeys(texto);
	}
	
	public void clicarButtonAddToCart() {
		driver.findElement(buttonAddToCart).click();
	}
	
	public SeuCarrinhoPage clicarSpanCarrinho() {
		try {
			Thread.sleep(2*1000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(spanCarrinho).click();
		
		return new SeuCarrinhoPage(driver);
	}

}
