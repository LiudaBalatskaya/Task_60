package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static base.TestBase.getWebDriver;

public class Waiter {

    private static final int DEFAULT_TIME_OUT = 50;

    public static WebDriverWait getWaiter() {
           return new WebDriverWait( getWebDriver(), DEFAULT_TIME_OUT);
    }

    public static void waitForLoadPage(By page) {
            getWaiter().until(ExpectedConditions.elementToBeClickable(page));
    }

    public static void waitAppearing(String title) {
            getWaiter().until(ExpectedConditions.titleIs(title));
    }


}
