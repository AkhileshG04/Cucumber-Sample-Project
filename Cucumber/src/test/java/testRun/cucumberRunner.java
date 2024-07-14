package testRun;


import io.cucumber.junit.CucumberOptions;


//@CucumberOptions(features = "./Features/SampleFeature1.feature"
//,glue={"com.src.test.stepDefinitions"},tags="@GoogleRun")
//public class cucumberRunner {
//}

@CucumberOptions(features = "./Features/PdfRead.feature"
,glue={"com.src.test.stepDefinitions"},tags="@ValidatePdf")
public class cucumberRunner {
}

//@RunWith(Cucumber.class)
//@CucumberOptions(features = "./Features/SampleFeature1.feature"
//,glue={"com.src.test.stepDefinitions"},tags="@GoogleRun")
//public class cucumberRunner {
//}