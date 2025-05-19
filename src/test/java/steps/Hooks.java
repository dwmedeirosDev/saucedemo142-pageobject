package steps;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Base;

public class Hooks {
    Base base; // Instanciado a Base

    public Hooks(Base base) {
        this.base = base;
    }

    @Before
    public void iniciar() {
        WebDriverManager.chromedriver().setup();

        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        prefs.put("profile.password_manager_leak_detection_enabled", false);
        prefs.put("password_manager_enabled", false);
        prefs.put("safebrowsing.enabled", false);

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);

        options.addArguments("--disable-save-password-bubble");
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-autofill-keyboard-accessory-view");
        options.addArguments("--password-leak-detection-enabled=false");
        options.addArguments("--safebrowsing-disable-auto-update");
        options.addArguments("--safebrowsing-disable-download-protection");
        options.addArguments("--incognito");

        base.driver = new ChromeDriver(options);
        base.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(60000));
        base.driver.manage().window().maximize();
    }

    @After
    public void encerrar() {
        base.driver.quit();
    }

}
