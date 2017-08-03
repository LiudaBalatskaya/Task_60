package pages;

import helpers.Waiter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private final String BASE_USER = "seleniumtests10";
    private final String PASSWORD = "060788avavav";

    private final By USER_NAME = By.id("mailbox__login");
    private final By PASSWORD_INPUT = By.id("mailbox__password");
    private final By SIGN_IN = By.id("mailbox__auth__button");
    private final By MAIL_RU = By.cssSelector("#cnJ1y-uP");

    public void enterUserName(WebDriver driver) {
        driver.findElement(USER_NAME).sendKeys(BASE_USER);
    }

    public void enterPassword(WebDriver driver){
        driver.findElement(PASSWORD_INPUT).sendKeys(PASSWORD);
    }

    public void submit(WebDriver driver){
        driver.findElement(SIGN_IN).click();
    }

    public void waitLoginPageAppear(WebDriver driver) {
        enterUserName(driver);
        enterPassword(driver);
        submit(driver);
        Waiter.waitAppearing("(3) Входящие - Почта Mail.Ru");
    }

}
