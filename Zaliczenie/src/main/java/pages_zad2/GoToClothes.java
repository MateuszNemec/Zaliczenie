package pages_zad2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoToClothes {
    private WebDriver driver;

    public GoToClothes(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "category-3")
    private WebElement category;

    public void goClothes(){
        category.click();
    }

}
