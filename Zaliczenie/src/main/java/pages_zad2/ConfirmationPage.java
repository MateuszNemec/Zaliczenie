package pages_zad2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationPage {
    private WebDriver driver;

    public ConfirmationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getTextCon(){
        WebElement pageText = driver.findElement(By.xpath("//*[@id='content-hook_order_confirmation']/div/div/div/h3"));
        return pageText.getText();
    }
}

