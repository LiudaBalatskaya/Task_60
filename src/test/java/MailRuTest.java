import base.TestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;


public class MailRuTest extends TestBase {
    @AfterMethod
    public void quit() {
        HomePage homePage = new HomePage();
        homePage.logout();
    }

    @Test
    public void gotoMailRu() {
        LoginPage loginPage = new LoginPage();
        loginPage.waitLoginPageAppear();
    }
}