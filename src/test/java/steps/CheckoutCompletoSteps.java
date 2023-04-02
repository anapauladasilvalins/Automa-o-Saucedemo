package steps;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Then;
import pages.ChecoutCompletoPage;

public class CheckoutCompletoSteps {
	
	BaseSteps baseSteps = new BaseSteps();
	
	private ChecoutCompletoPage checoutCompletoPage = new ChecoutCompletoPage(baseSteps.driver);
	
	@Then("valido tela de checkout completo")
	public void valido_tela_de_checkout_completo() {
		assertTrue(checoutCompletoPage.validarSpanChecoutCompleto("Checkout: Complete!"));
	}

}
