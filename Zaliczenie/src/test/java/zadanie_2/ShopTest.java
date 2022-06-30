package zadanie_2;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/cucumber/features/zadanie2/zad2.feature",
        plugin = {"pretty", "html:report/result2.html"}
)

public class ShopTest {
}
