package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageFactory {
    @FindBy(id = "ScrollBodyInner")
    public WebElement letters;

    @FindBy(id = "PH_logoutLink")
    private WebElement logout;

    public void displayedPage(){ letters.isDisplayed();}

    public void logout(){ logout.click();}
}
