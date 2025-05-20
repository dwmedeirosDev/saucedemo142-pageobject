package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage extends CommonPage {

    // Elementos mapeados
    @FindBy(css = "span.title")
    WebElement tituloPageCheckout;

    @FindBy(id = "first-name")
    WebElement campoPrimeiroNome;

    @FindBy(id = "last-name")
    WebElement campoUltimoNome;

    @FindBy(id = "postal-code")
    WebElement campoCep;

    @FindBy(id = "continue")
    WebElement botaoContinue;

    // Construtor
    public CheckoutPage(WebDriver driver) {
        super(driver); // Herdado do CommonPage
        PageFactory.initElements(driver, this);
    }

    public String lerTituloPageCheckout() {
        return tituloPageCheckout.getText();
    }

    public void preencherPrimeiroNome(String primeiroNome) {
        campoPrimeiroNome.sendKeys(primeiroNome);
    }

    public void preencherUltimoNome(String ultimoNome) {
        campoUltimoNome.sendKeys(ultimoNome);
    }

    public void preencherCep(String cep) {
        campoCep.sendKeys(cep);
    }

    public void clicarContinue() {
        botaoContinue.click();
    }
}