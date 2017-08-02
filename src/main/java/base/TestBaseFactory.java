package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;

public class TestBaseFactory {
    protected static WebDriver driver;
    protected static final String BASE_URL = "https://mail.ru/";
    private static String URL_MATCH = "registration";
    final int MAXIMUM_WAIT_TIME = 120;
    private static final int DEFAULT_TIME_OUT = 50;
    public void driverWait() {
        WebDriverWait wait = new WebDriverWait(driver, MAXIMUM_WAIT_TIME);
    }
    public static WebDriverWait getWaiter() {
        return new WebDriverWait(driver, DEFAULT_TIME_OUT);
    }
    public static void waitShouldAppear(String title) {
        getWaiter().until(ExpectedConditions.titleIs(title));
    }
    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
// driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(BASE_URL);
        driverWait();
    }
    @AfterClass
    public void exit(){
        driver.close();
    }

}
