package pages;

import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static helpers.Waiter.getWaiter;

public class LoginPage {
    private final String BASE_USER = "seleniumtests10";
    private final String PASSWORD = "060788avavav";

    private final By USER_NAME = By.id("mailbox__login");
    private final By PASSWORD_INPUT = By.id("mailbox__password");
    private final By SIGN_IN = By.id("mailbox__auth__button");
    private final By MAIL_RU = By.id("#cnJ1y-uP");
    WebDriver driver;

    public LoginPage() {
        this.driver = Driver.driver;
    }

    public void enterUserName() {
        driver.findElement(USER_NAME).sendKeys(BASE_USER);
    }

    public void enterPassword() {
        driver.findElement(PASSWORD_INPUT).sendKeys(PASSWORD);
    }

    public void submit() {
        driver.findElement(SIGN_IN).click();
    }

    public void waitLoginPageAppear() {
        enterUserName();
        enterPassword();
        submit();
        getWaiter().until(ExpectedConditions.titleIs("(3) Входящие - Почта Mail.Ru"));
    }

}
