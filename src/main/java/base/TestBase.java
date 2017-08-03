package base;

import helpers.Waiter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver driver;
    protected static final String BASE_URL = "https://mail.ru/";
    public static void gotoPage(WebDriver driver) {
            driver.get(BASE_URL);
            Waiter.waitAppearing("Mail.Ru: почта, поиск в интернете, новости, игры");
    }

    public static WebDriver getWebDriver(){ return driver; }

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterClass
    public void exit(){
            driver.close();
    }

}
