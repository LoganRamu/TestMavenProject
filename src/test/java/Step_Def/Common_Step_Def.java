package Step_Def;

import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Common_Step_Def {
    private static WebDriver driver = null;

    @Before
    public void beforeScenario() {


            loadBrowser();


    }

    private static void loadBrowser() {
        try {
            switch ("chrome") {
                case "chrome":
                    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\IdeaProjects\\Drivers-Jars\\chromedriver.exe");
                    driver = new ChromeDriver();
                    break;

                default:
                    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\IdeaProjects\\Drivers-Jars\\chromedriver.exe");
                    driver = new ChromeDriver();
                    break;
            }


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static WebDriver getDriver()
    {
        return driver;
    }
}
