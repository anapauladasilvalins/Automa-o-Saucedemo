package steps;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DetalhesProdutoPage;
import pages.SeuCarrinhoPage;

public class DetalhesProdutoSteps {
	
	BaseSteps baseSteps = new BaseSteps();
	
	private DetalhesProdutoPage detalhesProdutoPage = new DetalhesProdutoPage(baseSteps.driver);
	private SeuCarrinhoPage seuCarrinhoPage;
	
	@Then("valido a tela do produto")
	public void valido_a_tela_do_produto() {
		assertTrue(detalhesProdutoPage.validardivTituloProduto("Sauce Labs Bike Light"));
	}
	
	@When("clico no botao add to cart")
	public void clico_no_botao_add_to_cart() {
		detalhesProdutoPage.clicarButtonAddToCart();
	}
	
	@When("clico no icone carrinho")
	public void clico_no_icone_carrinho() {
	    seuCarrinhoPage = detalhesProdutoPage.clicarAIconeCarrinho();
	}
	
}
