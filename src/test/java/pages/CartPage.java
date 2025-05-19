package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends CommonPage {

    // Elementos mapeados
    @FindBy(className = "title")
    WebElement tituloCartPage;

    @FindBy(id = "item_4_title_link")
    WebElement tituloProduto;

    @FindBy(id = "checkout")
    WebElement botaoCheckout;

    // Construtor
    public CartPage(WebDriver driver) {
        super(driver); // Herdado do CommonPage
        PageFactory.initElements(driver, this);
    }

    // Ações dos elementos
    public String lerTituloCartPage() {
        return tituloCartPage.getText();
    }

    public String lerTituloProduto() {
        return tituloProduto.getText();
    }

    public void clicarBotaoCheckout(){
        botaoCheckout.click();
    }
}
