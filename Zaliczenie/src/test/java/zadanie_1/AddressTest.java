package zadanie_1;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/cucumber/features/zadanie1/zad1.feature",
        plugin = {"pretty", "html:report/result.html"}
)
public class AddressTest {
}
