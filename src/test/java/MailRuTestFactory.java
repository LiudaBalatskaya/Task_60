import base.TestBaseFactory;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.HomePageFactory;
import pages.LoginPageFactory;

public class MailRuTestFactory extends TestBaseFactory {

    @Test
    public void gotoMailRu() {
        LoginPageFactory login = PageFactory.initElements(driver, LoginPageFactory.class);
        login.login();
        HomePageFactory home = PageFactory.initElements(driver, HomePageFactory.class);
        waitAppearPage("(3) Входящие - Почта Mail.Ru");
        home.logout();

    }
}