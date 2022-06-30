package pages_zad2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClothesPage {
    private WebDriver driver;

    public ClothesPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id='js-product-list']/div[1]/article[2]/div/div[1]/h2/a")
    private WebElement sweater;

    public void chooseSweater(){
        sweater.click();
    }
}
