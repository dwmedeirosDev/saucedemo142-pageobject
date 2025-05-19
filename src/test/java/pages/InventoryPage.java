package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage extends CommonPage {

    // Elementos mapeados
    @FindBy(className = "title")
    WebElement tituloPageInventory;

    @FindBy(id = "item_4_title_link")
    WebElement produto;

    // Construtor
    public InventoryPage(WebDriver driver) {
        super(driver); // Herdado do CommonPage
        PageFactory.initElements(driver, this);
    }

    // Ações dos elementos
    public String lerTituloPageInventory() {
        return tituloPageInventory.getText();
    }

    public void selecionarProduto() {
        produto.click();
    }
}
