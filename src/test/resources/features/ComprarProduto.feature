Feature: Comprar produto
    Como usuario do site SauceDemo
    Escolher o produto
    Realizar uma compra com sucesso

  Scenario Outline: Comprar um produto com sucesso
    Given que acesso o site "https://www.saucedemo.com/"
    When informo "<user>" e "<password>" validos
    And clico no botao Login
    Then sou redirecionado para a lista de produtos
    When seleciono o "produto"
    Then sou redirecionado para a pagina do produto
    When clico no botao Add to Cart
    And clico no botao Cart
    Then sou redirecionado para a pagina do carrinho
    When clico no botao Checkout
    Then sou redirecionado para a pagina de checkout
    When informo "<primeiroNome>", "<ultimoNome>" e "<cep>" nos campos
    And clico no botao Continue
    Then sou redirecionado para a pagina overview
    When clico no botao Finish
    Then sou redirecionado para a pagina de confirmacao de compra

    Examples:
      | user          | password     | primeiroNome | ultimoNome | cep        |
      | standard_user | secret_sauce | David        | Feijão     | 99999-888  |
