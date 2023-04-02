package steps;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CheckoutPage;
import pages.SeuCarrinhoPage;

public class SeuCarrinhoSteps {
		
		BaseSteps baseSteps = new BaseSteps();
		
		private SeuCarrinhoPage seuCarrinhoPage = new SeuCarrinhoPage(baseSteps.driver);
		private CheckoutPage checkoutPage;
		
		
		@Then("valido a tela your cart")
		public void valido_a_tela_your_cart() {
			assertTrue(seuCarrinhoPage.validarButtonCheckout("Checkout"));
		}
		
		@When("clico no botao checkout")
		public void clico_no_botao_checkout() {
			checkoutPage = seuCarrinhoPage.clicarButtonCheckout();
		}

}
