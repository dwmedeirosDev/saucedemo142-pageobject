package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommonPage {

    // Elementos mapeados
    @FindBy(className = "login_logo")
    WebElement tituloPageLogin;

    @FindBy(id = "user-name")
    WebElement campoUser;

    @FindBy(id = "password")
    WebElement campoPassword;

    @FindBy(id = "login-button")
    WebElement botaoLogin;

    // Construtor
    public LoginPage(WebDriver driver) {
        super(driver); // Herdado do CommonPage
        PageFactory.initElements(driver, this);
    }

    // Ações dos elementos
    public void acessarLoginPage(String url) {
        driver.get(url);
    }

    public String lerTituloPageLogin() {
        return tituloPageLogin.getText();
    }

    public void preencherUser(String user) {
        campoUser.sendKeys(user);
    }

    public void preencherPassword(String password) {
        campoPassword.sendKeys(password);
    }

    public void clicarLogin() {
        botaoLogin.click();
    }
}