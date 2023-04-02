package steps;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CheckoutPage;
import pages.FinalizarCompraPage;

public class CheckoutSteps {
	
	BaseSteps baseSteps = new BaseSteps();
	
	private CheckoutPage checkoutPage = new CheckoutPage(baseSteps.driver);
	private FinalizarCompraPage finalizarCompraPage;
	
	@Then("valido a tela de checkout")
	public void valido_a_tela_de_checkout() {
		assertTrue(checkoutPage.validarSpanTituloCheckout("Checkout: Your Information"));
	}

	@When("preencho o formulario")
	public void preencho_o_formulario() {
	    checkoutPage.preencherFormularioCheckout("Ana", "Lins", "13186642");
	}
	
	@When("clico no botao continue")
	public void clico_no_botao_continue() {
	   finalizarCompraPage = checkoutPage.clicarButtonContinue();
	}
	
	@Then("valido mensagem de erro")
	public void valido_mensagem_de_erro() {
		assertTrue(checkoutPage.validarH3MensagemErro("Error: Last Name is required"));
	}
}
