package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompletePage extends CommonPage {

    // Elementos mapeados
    @FindBy(className = "complete-header")
    WebElement tituloCompraCompleta;

    // Construtor
    public CompletePage(WebDriver driver) {
        super(driver); // Herdado do CommonPage
        PageFactory.initElements(driver, this);
    }

    // Ações dos elementos
    public String lerTituloCompraCompleta() {
        return tituloCompraCompleta.getText();
    }
}
