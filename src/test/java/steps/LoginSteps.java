package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.ProdutosPage;

public class LoginSteps {
	
	BaseSteps baseSteps = new BaseSteps();
	
	private LoginPage loginPage = new LoginPage(baseSteps.driver);
	
	private ProdutosPage produtosPage;

	@Given("que estou no site")
	public void que_estou_no_site() {
		loginPage.carregarPaginaInicial();
	}
	
	@When("preencho o campo username")
	public void preencho_o_campo_username() {
	    loginPage.preencherInputUsername("performance_glitch_user");
	}
	
	@When("preencho o campo password")
	public void preencho_o_campo_password() {
	    loginPage.preencherInputPassword("secret_sauce");
	}
	
	@When("clico no botao login")
	public void clico_no_botao_login() {
	   produtosPage = loginPage.clicarInputBotaoLogin();
	}
	
	@When("preencho o campo username problema")
	public void preencho_o_campo_username_problema() {
	   loginPage.preencherInputUsername("problem_user");
	}


}
