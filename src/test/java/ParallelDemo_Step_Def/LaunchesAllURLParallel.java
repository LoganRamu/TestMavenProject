package ParallelDemo_Step_Def;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchesAllURLParallel
{
    @Given("User launches url {string}")
    public void user_launches_url(String string) {
        WebDriver driver=new ChromeDriver();
        driver.get(string);

    }

}
