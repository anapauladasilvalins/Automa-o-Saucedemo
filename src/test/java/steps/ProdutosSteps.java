package steps;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DetalhesProdutoPage;
import pages.ProdutosPage;
import pages.SeuCarrinhoPage;

public class ProdutosSteps {
	
	BaseSteps baseSteps = new BaseSteps();
	
	private ProdutosPage produtosPage = new ProdutosPage(baseSteps.driver);
	
	private DetalhesProdutoPage detalhesProdutoPage;
	private SeuCarrinhoPage seuCarrinhoPage;
	@Then("valido a tela de produtos")
	public void valido_a_tela_de_produtos() {
		assertTrue(produtosPage.validarSpanProdutos("Products"));
		
	}
	
	@When("seleciono a opcao z to a")
	public void seleciono_a_opcao_z_to_a() {
		produtosPage.escolhoSelectFiltro("Name (Z to A)");
	}

	
	@When("clico no produto escolhido")
	public void clico_no_produto_escolhido() {
	    detalhesProdutoPage = produtosPage.clicarDivProduto();
	}
	
	@When("clico no botao add to cart da tela produtos")
	public void clico_no_botao_add_to_cart_da_tela_produtos() {
	    produtosPage.clicarButtonAddToCart();
	}

	@When("clico no icone carrinho da tela de produtos")
	public void clico_no_icone_carrinho_da_tela_de_produtos() {
	    seuCarrinhoPage = produtosPage.clicarSpanCarrinho();
	}

}
