package Step_Def;

import io.cucumber.java.en.Given;

public class Gmail_launch_parallel_test_step_def
{
    @Given("User launches gmail url {string}")
    public void user_launches_gmail_url(String string) {
        Common_Step_Def.getDriver().get(string);
        System.out.println("Gmail launched successfully");
    }
}
