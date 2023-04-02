@saucedemo
Feature: Fluxo de Compra Completo
  Eu quero realizar um fluxo de compra no site saucedemo

  @comprasucesso
  Scenario: Realizar fluxo de compra
    Given que estou no site
    When preencho o campo username
    And preencho o campo password
    When clico no botao login
    Then valido a tela de produtos 
    When seleciono a opcao z to a
    And clico no produto escolhido
    Then valido a tela do produto
  	When clico no botao add to cart
  	And clico no icone carrinho
  	Then valido a tela your cart
  	When clico no botao checkout
  	Then valido a tela de checkout
  	When preencho o formulario
  	And clico no botao continue
  	Then valido tela de finalizar compra
  	When clico no botao finish
  	Then valido tela de checkout completo
  	
  	@problemacompra
  	Scenario: Fluxo com problema
  		Given que estou no site
  		When preencho o campo username problema
   		And preencho o campo password
    	When clico no botao login
    	Then valido a tela de produtos
    	When clico no botao add to cart da tela produtos
    	And clico no icone carrinho da tela de produtos
    	Then valido a tela your cart
    	When clico no botao checkout
  		Then valido a tela de checkout
  		When preencho o formulario
  		And clico no botao continue
  		Then valido mensagem de erro
  		