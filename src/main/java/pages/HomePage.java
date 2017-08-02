package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private static final By LOGOUT = By.xpath(".//*[@id='PH_logoutLink']");
    public static void logout(WebDriver driver){
        driver.findElement(LOGOUT).click();
    }

}
