package pages_zad1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class MyAddressPage {

    private WebDriver driver;

    public MyAddressPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getPageText() {
        WebElement pageText = driver.findElement(By.xpath("//*[@id='notifications']/div/article/ul/li"));
        return pageText.getText();
    }
}
