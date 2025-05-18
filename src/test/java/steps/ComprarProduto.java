package steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Base;
import pages.LoginPage;

public class ComprarProduto {

    // Atributos da classe
    final WebDriver driver;
    private LoginPage loginPage;

    // Construtor
    public ComprarProduto(Base base){
        this.driver = base.driver;
    }

    @Given("que acesso o site {string}")
    public void que_acesso_o_site(String string) {

    }

    @When("informo {string} e {string} validos")
    public void informo_e_validos(String string, String string2) {

    }

    @When("clico no botao Login")
    public void clico_no_botao_login() {

    }

    @Then("sou redirecionado para a lista de produtos")
    public void sou_redirecionado_para_a_lista_de_produtos() {

    }

    @When("seleciono o {string}")
    public void seleciono_o(String string) {

    }

    @Then("sou redirecionado para a pagina do produto")
    public void sou_redirecionado_para_a_pagina_do_produto() {

    }

    @When("clico no botao Add to Cart")
    public void clico_no_botao_add_to_cart() {

    }

    @When("clico no botao Cart")
    public void clico_no_botao_cart() {

    }

    @Then("sou redirecionado para a pagina do carrinho")
    public void sou_redirecionado_para_a_pagina_do_carrinho() {

    }

    @When("clico no botao Checkout")
    public void clico_no_botao_checkout() {

    }

    @Then("sou redirecionado para a pagina de checkout")
    public void sou_redirecionado_para_a_pagina_de_checkout() {

    }

    @When("informo {string}, {string} e {string} nos campos")
    public void informo_e_nos_campos(String string, String string2, String string3) {

    }

    @When("clico no botao Continue")
    public void clico_no_botao_continue() {

    }

    @Then("sou redirecionado para a pagina overview")
    public void sou_redirecionado_para_a_pagina_overview() {

    }

    @When("clico no botao Finish")
    public void clico_no_botao_finish() {

    }

    @Then("sou redirecionado para a pagina de confirmacao de compra")
    public void sou_redirecionado_para_a_pagina_de_confirmacao_de_compra() {

    }
}
