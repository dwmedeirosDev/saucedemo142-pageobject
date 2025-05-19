package steps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Base;
import pages.CartPage;
import pages.InventoryItemPage;
import pages.InventoryPage;
import pages.LoginPage;

public class ComprarProduto {

    // Atributos da classe
    final WebDriver driver;
    private LoginPage loginPage;
    private InventoryPage inventoryPage;
    private InventoryItemPage inventoryItemPage;
    private CartPage cartPage;

    // Construtor
    public ComprarProduto(Base base) {
        this.driver = base.driver;
    }

    @Given("que acesso o site {string}")
    public void que_acesso_o_site(String url) {
        loginPage = new LoginPage(driver); // Instanciando a página LoginPage

        loginPage.acessarLoginPage(url);
        assertEquals("Swag Labs", loginPage.lerNomeGuia());
        assertEquals("Swag Labs", loginPage.lerTituloPageLogin());
    }

    @When("informo {string} e {string} validos")
    public void informo_e_validos(String user, String password) {

        loginPage.preencherUser(user);
        loginPage.preencherPassword(password);
    }

    @When("clico no botao Login")
    public void clico_no_botao_login() {

        loginPage.clicarLogin();
    }

    @Then("sou redirecionado para a lista de produtos")
    public void sou_redirecionado_para_a_lista_de_produtos() {
        inventoryPage = new InventoryPage(driver);

        assertEquals("Products", inventoryPage.lerTituloPageInventory());
    }

    @When("seleciono o {string}")
    public void seleciono_o(String string) {

        inventoryPage.selecionarProduto();
    }

    @Then("sou redirecionado para a pagina do produto")
    public void sou_redirecionado_para_a_pagina_do_produto() {
        inventoryItemPage = new InventoryItemPage(driver);

        assertEquals("Back to products", inventoryItemPage.LerTituloPageInventoryItem());
    }

    @When("clico no botao Add to Cart")
    public void clico_no_botao_add_to_cart() {

        inventoryItemPage.clicarAddToCart();
    }

    @When("clico no botao Cart")
    public void clico_no_botao_cart() {

        inventoryItemPage.clicarCart();
    }

    @Then("sou redirecionado para a pagina do carrinho")
    public void sou_redirecionado_para_a_pagina_do_carrinho() {
        cartPage = new CartPage(driver);

        assertEquals("Your Cart", cartPage.lerTituloCartPage());
    }

    @When("clico no botao Checkout")
    public void clico_no_botao_checkout() {

        cartPage.clicarBotaoCheckout();
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
