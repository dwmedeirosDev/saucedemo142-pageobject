package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage extends CommonPage {

    // Elementos mapeados
    @FindBy(className = "title")
    WebElement tituloPageInventory;

    public By byProdutoSku(String skuProduto) {
        return By.id("item_" + skuProduto + "_title_link");
    }

    // Construtor
    public InventoryPage(WebDriver driver) {
        super(driver); // Herdado do CommonPage
        PageFactory.initElements(driver, this);
    }

    // Ações dos elementos
    public String lerTituloPageInventory() {
        return tituloPageInventory.getText();
    }

    public void selecionarProdutoSku(String skuProduto) {
        driver.findElement(byProdutoSku(skuProduto)).click();
    }
}
