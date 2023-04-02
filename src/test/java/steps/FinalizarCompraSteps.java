package steps;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ChecoutCompletoPage;
import pages.FinalizarCompraPage;

public class FinalizarCompraSteps {
	
	BaseSteps baseSteps = new BaseSteps();
	
	private FinalizarCompraPage finalizarCompraPage = new FinalizarCompraPage(baseSteps.driver);
	private ChecoutCompletoPage checoutCompletoPage;
	
	
	@Then("valido tela de finalizar compra")
	public void valido_tela_de_finalizar_compra() {
		assertTrue(finalizarCompraPage.validarDivPaymentInformation("Payment Information"));
	}
	
	@When("clico no botao finish")
	public void clico_no_botao_finish() {
	    checoutCompletoPage = finalizarCompraPage.clicarButtonFinish();
	}

}
