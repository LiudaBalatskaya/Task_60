import base.TestBaseFactory;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.HomePageFactory;
import pages.LoginPageFactory;

public class MailRuTestFactory extends TestBaseFactory {

    @Test
    public void gotoMailRu(){
        LoginPageFactory LoginPF = PageFactory.initElements(driver, LoginPageFactory.class);
        LoginPF.login();
        waitShouldAppear("Mail.Ru: почта, поиск в интернете, новости, игры");
        HomePageFactory HomePF = PageFactory.initElements(driver, HomePageFactory.class);
        waitShouldAppear("(3) Входящие - Почта Mail.Ru");
        HomePF.logout();
    }
}