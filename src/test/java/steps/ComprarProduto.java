package steps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Base;
import pages.CartPage;
import pages.CheckoutPage;
import pages.CompletePage;
import pages.InventoryItemPage;
import pages.InventoryPage;
import pages.LoginPage;
import pages.OverviewPage;

public class ComprarProduto {

    // Atributos da classe
    final WebDriver driver;
    private LoginPage loginPage;
    private InventoryPage inventoryPage;
    private InventoryItemPage inventoryItemPage;
    private CartPage cartPage;
    private CheckoutPage checkoutPage;
    private OverviewPage overviewPage;
    private CompletePage completePage;

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

    @When("seleciono o produto de sku {string}")
    public void seleciono_o_produto_de_sku(String skuProduto) {
        inventoryPage.selecionarProdutoSku(skuProduto);
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

    @Then("valido o nome do produto {string} e preço {string} do sku {string}")
    public void valido_o_nome_do_produto_e_preco_do_sku(String nomeProduto, String valorProduto, String skuProduto) {

        assertEquals(nomeProduto, cartPage.lerTituloProduto(skuProduto));
        assertEquals(valorProduto, cartPage.lerValorProduto());
    }

    @When("clico no botao Checkout")
    public void clico_no_botao_checkout() {

        cartPage.clicarBotaoCheckout();
    }

    @Then("sou redirecionado para a pagina de checkout")
    public void sou_redirecionado_para_a_pagina_de_checkout() {
        checkoutPage = new CheckoutPage(driver);

        assertEquals("Checkout: Your Information", checkoutPage.lerTituloPageCheckout());
    }

    @When("informo {string}, {string} e {string} nos campos")
    public void informo_e_nos_campos(String primeiroNome, String ultimoNome, String cep) {

        checkoutPage.preencherPrimeiroNome(primeiroNome);
        checkoutPage.preencherUltimoNome(ultimoNome);
        checkoutPage.preencherCep(cep);
    }

    @When("clico no botao Continue")
    public void clico_no_botao_continue() {

        checkoutPage.clicarContinue();
    }

    @Then("sou redirecionado para a pagina overview")
    public void sou_redirecionado_para_a_pagina_overview() {
        overviewPage = new OverviewPage(driver);

        // overviewPage.lerTituloPageOverview();
        overviewPage.lerInformacaoPagamento();
        overviewPage.lerInformacaoEnvio();
        overviewPage.lerPrecoTotal();
    }

    @When("clico no botao Finish")
    public void clico_no_botao_finish() {

        overviewPage.clicarBotaoFinish();
    }

    @Then("sou redirecionado para a pagina de confirmacao de compra")
    public void sou_redirecionado_para_a_pagina_de_confirmacao_de_compra() {
        completePage = new CompletePage(driver);

        completePage.lerTituloCompraCompleta();
    }
}
