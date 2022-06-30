package zadanie_2;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages_zad1.LoginPage;
import pages_zad1.MailPaige;
import pages_zad2.*;

import java.io.File;
import java.time.Duration;

public class StepDefs2 {

    private WebDriver driver;

    @Given("open a starting site")
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://mystore-testlab.coderslab.pl");

    }

    @And("sign in")
    public void logIn() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickLogIn();
    }

    @And("login as {word} and {word}")
    public void log(String email, String pass) {
        MailPaige mailPaige = new MailPaige(driver);
        mailPaige.loginAs(email, pass);
    }
    @And("go to clothes")
    public void clothes(){
        GoToClothes goToClothes = new GoToClothes(driver);
        goToClothes.goClothes();
    }
    @When("you choose a sweater")
    public void chooseProduct(){
        ClothesPage clothesPage = new ClothesPage(driver);
        clothesPage.chooseSweater();
    }
    @And("choose a size and quantity")
    public void chooseSpecification(){
        SweaterPage sweaterPage = new SweaterPage(driver);
        sweaterPage.chooseSizeM();
    }
    @And("choose shipping specification")
    public void chooseShipSpec(){
        ShippingPage shippingPage = new ShippingPage(driver);
        shippingPage.shipSpec();
    }
    @Then("you will see confirmation")
    public void confirmation(){
        ConfirmationPage confirmationPage = new ConfirmationPage(driver);
        Assert.assertTrue(confirmationPage.getTextCon().contains("YOUR ORDER IS CONFIRMED"));
    }
    @And("take a screenshot")
    public void screen()throws Exception {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("target/main_page.png"));
}
    @And("close brows")
    public void closeBro(){
        driver.quit();
    }
}