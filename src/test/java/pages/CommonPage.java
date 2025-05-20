package pages;

import org.openqa.selenium.WebDriver;

public class CommonPage {

    public WebDriver driver;

    // Construtor
    public CommonPage(WebDriver driver) {
        this.driver = driver;
    }

    // Métodos ou funções em comum
    public String lerNomeGuia() {
        return driver.getTitle();
    }
}
