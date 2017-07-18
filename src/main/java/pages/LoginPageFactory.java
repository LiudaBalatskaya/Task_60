package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageFactory {

    private static final String BASE_USER = "seleniumtests10";
    private static final String PASSWORD = "060788avavav";

    @FindBy(id = "mailbox__login")
    private WebElement user_login;

    @FindBy(id = "mailbox__password")
    private WebElement password_login;

    @FindBy(id = "mailbox__auth__button")
    private WebElement button_login;

    public void login(){
        user_login.sendKeys(BASE_USER);
        password_login.sendKeys(PASSWORD);
        button_login.click();
    }

}
