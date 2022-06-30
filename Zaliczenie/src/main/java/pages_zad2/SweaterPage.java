package pages_zad2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SweaterPage {
    private WebDriver driver;

    public SweaterPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id='group_1']/option[2]")
    private WebElement sizeM;

    @FindBy(name = "qty")
    private WebElement quantity;

    @FindBy(className = "add")
    private WebElement addButton;

    @FindBy(xpath = "//*[@id='blockcart-modal']/div/div/div[2]/div/div[2]/div/div/a")
    private WebElement proceedButton;

    @FindBy(xpath = "//*[@id='main']/div/div[2]/div[1]/div[2]/div/a")
    private WebElement proceedAgain;



    public void chooseSizeM(){
        sizeM.click();
        quantity.clear();
        quantity.sendKeys("5");
        addButton.click();
        proceedButton.click();
        proceedAgain.click();

    }
}
