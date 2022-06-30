package pages_zad1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {

    private WebDriver driver;

    public AccountPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "addresses-link")
    private WebElement adressButton;

    @FindBy(css = "#content > div.addresses-footer > a > span")
    private WebElement plusAddress;

    public void clickAdressBut(){
        adressButton.click();
        plusAddress.click();
    }
}
