package RunnerPackage;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src//test//resources//parallenFeatures",
        glue = "ParallelDemo_Step_Def",
        dryRun = false,
        monochrome = true
)

public class RunnerParallelSingle_DefTest {
}
