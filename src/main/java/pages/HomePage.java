package pages;

import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    public final By LOGOUT = By.id("PH_logoutLink");
    WebDriver driver;

    public HomePage() {
        this.driver = Driver.driver;
    }

    public void logout() {
        driver.findElement(LOGOUT).click();
    }
}
