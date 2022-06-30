package zadanie_1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import pages_zad1.*;

import java.time.Duration;

public class StepDefs {
    private WebDriver driver;

    @Given("open a browser to starting site")
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://mystore-testlab.coderslab.pl");
    }

    @And("click sign in")
    public void logIn(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickLogIn();
    }

    @And("login as {word} and {word}, click sign in")
    public void log(String email, String pass){
        MailPaige mailPaige = new MailPaige(driver);
        mailPaige.loginAs(email, pass);
    }
    @And("click add first address")
    public void clickAdress(){
        AccountPage accountPage = new AccountPage(driver);
        accountPage.clickAdressBut();

        }
    @When("add new address with {word} and {string} and {word} and {word} and {word}")
    public void createNewAddress(String alias, String address, String city, String postcode, String phone){
        AddressPage addressPage = new AddressPage(driver);
        addressPage.enterAddress(alias, address, city, postcode, phone);
    }

    @Then("user will see proper comment")
    public void newAddressAdded() {
        MyAddressPage myAddressPage = new MyAddressPage(driver);
        Assert.assertTrue(myAddressPage.getPageText().contains("Address successfully added!"));
    }
    @And("close browser")
    public void closeBrowser() {
        driver.quit();
    }


    }

