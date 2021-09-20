package Step_Def;

import io.cucumber.java.en.Given;

public class Flipkart_launch_parallel_test_step_def
{
    @Given("User launches flipkart url {string}")
    public void user_launches_flipkart_url(String string) {
        Common_Step_Def.getDriver().get(string);
        System.out.println("Flipkart launched successfully");
    }
}
