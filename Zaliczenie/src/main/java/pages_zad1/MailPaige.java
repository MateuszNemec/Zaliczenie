package pages_zad1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MailPaige {

    private WebDriver driver;

    public MailPaige(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "email")
    private WebElement mailInput;

    @FindBy(name = "password")
    private WebElement passw;

    @FindBy(id = "submit-login")
    private WebElement button;

    public void loginAs(String email, String pass){
        mailInput.sendKeys(email);
        passw.sendKeys(pass);
        button.click();
    }

}
