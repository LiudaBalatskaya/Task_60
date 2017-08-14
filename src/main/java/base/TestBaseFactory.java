package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class TestBaseFactory {

    private static final int DEFAULT_TIME_OUT = 50;
    protected static final String BASE_URL = "https://mail.ru/";
    protected WebDriver driver;

    public WebDriverWait getWaiter() {
        return new WebDriverWait(driver, DEFAULT_TIME_OUT);
    }

    public void waitAppearPage(String title) {
        getWaiter().until(ExpectedConditions.titleIs(title));
    }

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(BASE_URL);
    }

    @AfterClass
    public void exit() {
        driver.close();
    }

}
