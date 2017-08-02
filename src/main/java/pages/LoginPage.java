package pages;

import helpers.Waiter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private static final String BASE_USER = "seleniumtests10";
    private static final String PASSWORD = "060788avavav";
    private static final By USER_NAME = By.xpath(".//*[@id='mailbox__login']");
    private static final By PASSWORD_INPUT = By.xpath(".//*[@id='mailbox__password']");
    private static final By SIGN_IN = By.xpath(".//*[@id='mailbox__auth__button']");
    private static final By MAIL_RU = By.cssSelector("#cnJ1y-uP");
    public static void enterUserName(WebDriver driver) {
        driver.findElement(USER_NAME).sendKeys(BASE_USER);
    }
    public static void enterPassword(WebDriver driver){
        driver.findElement(PASSWORD_INPUT).sendKeys(PASSWORD);
    }
    public static void submit(WebDriver driver){
        driver.findElement(SIGN_IN).click();
    }
    public static void loginWaitShouldAppear(WebDriver driver) {
        enterUserName(driver);
        enterPassword(driver);
        submit(driver);
        Waiter.waitShouldAppear("(3) Входящие - Почта Mail.Ru");
    }

}
