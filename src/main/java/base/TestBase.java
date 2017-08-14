package base;

import Utilities.Driver;
import helpers.Waiter;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import static Utilities.Driver.driver;

public class TestBase {

    protected static final String BASE_URL = "https://mail.ru/";

    public static WebDriver getWebDriver() {
        return driver;
    }

    @BeforeClass
    public void setup() {
        Driver.Initialize();
    }

    @AfterClass
    public void exit() {
        Driver.close();
    }

    @BeforeMethod
    public void gotoPage() {
        driver.get(BASE_URL);
        Waiter.waitAppearing("Mail.Ru: почта, поиск в интернете, новости, игры");
    }
}
