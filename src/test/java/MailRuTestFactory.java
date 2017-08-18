import base.TestBaseFactory;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePageFactory;
import pages.LoginPageFactory;

public class MailRuTestFactory extends TestBaseFactory {

    @Test
    public void gotoMailRu() {
        LoginPageFactory login = PageFactory.initElements(driver, LoginPageFactory.class);
        login.login();
        getWaiter().until(ExpectedConditions.visibilityOf(login.menu));
        HomePageFactory home = PageFactory.initElements(driver, HomePageFactory.class);
        Assert.assertEquals(home.portalMenu(), "portal-menu");

    }
}