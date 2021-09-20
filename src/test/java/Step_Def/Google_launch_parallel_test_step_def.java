package Step_Def;

import io.cucumber.java.en.Given;

public class Google_launch_parallel_test_step_def {
    @Given("User launches google url {string}")
    public void user_launches_google_url(String string) {
        Common_Step_Def.getDriver().get(string);
        System.out.println("Google launched successfully");
    }
}
