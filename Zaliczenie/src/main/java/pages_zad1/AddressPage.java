package pages_zad1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressPage {

    private WebDriver driver;

    public AddressPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "alias")
    private WebElement aliasInput;

    @FindBy(name = "address1")
    private WebElement addressInput;

    @FindBy(name = "city")
    private WebElement cityInput;

    @FindBy(name = "postcode")
    private WebElement codeInput;

    @FindBy(name = "phone")
    private WebElement phoneInput;

    @FindBy(xpath = "//*[@id='content']/div/div/form/footer/button")
    private WebElement subButton;

    public void enterAddress(String alias, String address, String city, String postcode, String phone){

        aliasInput.sendKeys(alias);
        addressInput.sendKeys(address);
        cityInput.sendKeys(city);
        codeInput.sendKeys(postcode);
        phoneInput.sendKeys(phone);
        subButton.click();
    }
}
