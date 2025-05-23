Feature: Comprar produto
    Como usuario do site SauceDemo
    Escolher o produto
    Realizar uma compra com sucesso

  Scenario Outline: Comprar um produto com sucesso
    Given que acesso o site "https://www.saucedemo.com/"
    When informo "<user>" e "<password>" validos
    And clico no botao Login
    Then sou redirecionado para a lista de produtos
    When seleciono o produto de sku "<skuProduto>"
    Then sou redirecionado para a pagina do produto
    When clico no botao Add to Cart
    And clico no botao Cart
    Then sou redirecionado para a pagina do carrinho
    And valido o nome do produto "<nomeProduto>" e preço "<valorProduto>" do sku "<skuProduto>"
    When clico no botao Checkout
    Then sou redirecionado para a pagina de checkout
    When informo "<primeiroNome>", "<ultimoNome>" e "<cep>" nos campos
    And clico no botao Continue
    Then sou redirecionado para a pagina overview
    When clico no botao Finish
    Then sou redirecionado para a pagina de confirmacao de compra

    Examples:
      | skuProduto | nomeProduto                       | valorProduto | user          | password     | primeiroNome | ultimoNome | cep       |
      |          0 | Sauce Labs Bike Light             | $9.99        | standard_user | secret_sauce | David        | Feijão     | 99999-888 |
      |          1 | Sauce Labs Bolt T-Shirt           | $15.99       | standard_user | secret_sauce | Fernanda     | Flores     | 88888-777 |
      |          2 | Sauce Labs Onesie                 | $7.99        | standard_user | secret_sauce | Blaze        | Demo       | 77777-666 |
      |          3 | Test.allTheThings() T-Shirt (Red) | $15.99       | standard_user | secret_sauce | Sauce        | Demo       | 66666-555 |
      |          4 | Sauce Labs Backpack               | $29.99       | standard_user | secret_sauce | Teste        | Teste      | 55555-444 |
