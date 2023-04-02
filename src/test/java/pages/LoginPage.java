package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By inputUsername = By.id("user-name");
	private By inputPassword = By.id("password");
	private By inputBotaoLogin = By.xpath("//input[@class='submit-button btn_action']");
	
	public void carregarPaginaInicial() {
		driver.get("https://www.saucedemo.com/");
		
		try {
			Thread.sleep(2*1000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void preencherInputUsername(String texto) {
		driver.findElement(inputUsername).sendKeys(texto);
	}
	
	public void preencherInputPassword(String texto) {
		driver.findElement(inputPassword).sendKeys(texto);
	}
	public ProdutosPage clicarInputBotaoLogin() {
		driver.findElement(inputBotaoLogin).click();
		return new ProdutosPage(driver);
	}
}
