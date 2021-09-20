package Step_Def;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_launch_parallel_test_step_def
{
    /*Scenario scenario;
    @Before
    public void printScenarios(Scenario sc)
    {
        scenario=sc;
    }*/

    @Given("User launches amazon url {string}")
    public void user_launches_amazon_url(String string) {
        Common_Step_Def.getDriver().get(string);
        System.out.println("Amazon launched successfully");
    }
}
