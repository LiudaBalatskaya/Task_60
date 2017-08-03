import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;


public class MailRuTest extends TestBase{
    @BeforeMethod
    public void gotoPage(){
        gotoPage(driver);
    }

    @AfterMethod
    public void quit(){
        HomePage homePage = new HomePage();
        homePage.logout(driver);
    }

    @Test
    public void gotoMailRu(){
        LoginPage loginPage = new LoginPage();
        loginPage.waitLoginPageAppear(driver);
        Assert.assertTrue(true);
    }
}