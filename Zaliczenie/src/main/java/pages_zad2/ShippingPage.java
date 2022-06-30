package pages_zad2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShippingPage {
    private WebDriver driver;

    public ShippingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='Dom']")
    private WebElement chooseAddress;

    @FindBy(xpath = "//*[@id='checkout-delivery-step']/h1/span[1]")
    private WebElement shipMeth;

    @FindBy(xpath = "//*[@id='js-delivery']/div/div[1]/div[1]/label/div/div[1]/div/div/span")
    private WebElement prestaDel;

    @FindBy(xpath = "//*[@id='checkout-payment-step']/h1/span[1]")
    private WebElement payM;

    @FindBy(id="payment-option-1")
    private WebElement payCheck;

    @FindBy(id="conditions_to_approve[terms-and-conditions]")
    private WebElement acceptInput;

    @FindBy(id="payment-confirmation")
    private WebElement payConf;

    public void shipSpec() {

        chooseAddress.click();
        shipMeth.click();
        prestaDel.click();
        payM.click();
        payCheck.click();
        acceptInput.click();
        payConf.click();
    }
}