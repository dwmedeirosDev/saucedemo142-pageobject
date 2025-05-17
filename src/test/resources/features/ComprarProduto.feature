Feature: Comprar produto
    Como usuario do site SauceDemo
    Escolher o produto
    Realizar uma compra com sucesso

  Scenario: Comprar um produto com sucesso
    Given que acesso o site "https://www.saucedemo.com/"
    
    When informo "user" e "password" validos
    And clico no botao "login"
    Then sou redirecionado para a lista de produtos

    When seleciono o "produto"
    Then sou redirecionado para a pagina do produto

    When clico no botao "add to cart"
    And clico no botao "cart"
    Then sou redirecionado para a pagina do carrinho

    When clico no botao "checkout"
    Then sou redirecionado para a pagina de checkout

    When informo "primeiro nome", "ultimo nome" e "cep" nos campos
    And clico no botao "Continue"
    Then sou redirecionado para a pagina overview

    When clico no botao "finish"
    Then sou redirecionado para a pagina de confirmacao de compra
