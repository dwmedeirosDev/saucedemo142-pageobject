package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverviewPage extends CommonPage {

    // Elementos mapeados
    @FindBy(css = "[data-test='title']")
    WebElement tituloPageOverview;

    @FindBy(css = "[data-test='payment-info-label']")
    WebElement informacaoPagamento;

    @FindBy(css = "[data-test='shipping-info-label']")
    WebElement informacaoEnvio;

    @FindBy(css = "[data-test='total-info-label']")
    WebElement precoTotal;

    // Construtor
    public OverviewPage(WebDriver driver) {
        super(driver); // Herdado do CommonPage
        PageFactory.initElements(driver, this);
    }

    // Ações dos elementos
    public String lerTituloPageOverview() {
        return tituloPageOverview.getText();
    }

    public String lerInformacaoPagamento() {
        return informacaoPagamento.getText();
    }

    public String lerInformacaoEnvio() {
        return informacaoEnvio.getText();
    }

    public String lerPrecoTotal() {
        return precoTotal.getText();
    }
}
