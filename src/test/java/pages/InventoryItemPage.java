package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryItemPage extends CommonPage {

    // Elementos mapeados
    @FindBy(id = "back-to-products")
    WebElement tituloPageInventoryItem;

    @FindBy(id = "add-to-cart")
    WebElement botaoAddToCart;

    @FindBy(className = "shopping_cart_link")
    WebElement botãoCart;

    public InventoryItemPage(WebDriver driver) {
        super(driver); // Herdado do CommonPage
        PageFactory.initElements(driver, this);
    }

    // Ações dos elementos
    public String LerTituloPageInventoryItem() {
        return tituloPageInventoryItem.getText();
    }

    public void clicarAddToCart() {
        botaoAddToCart.click();
    }

    public void clicarCart(){
        botãoCart.click();
    }

}
