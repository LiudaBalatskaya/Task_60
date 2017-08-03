package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    public final By LOGOUT = By.id("PH_logoutLink");

    public void logout(WebDriver driver){
        driver.findElement(LOGOUT).click();
    }
}
