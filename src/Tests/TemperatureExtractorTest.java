package Tests;

import Pages.BasePage;
import Steps.GoogleSteps;
import org.testng.annotations.Test;

@Test
public class TemperatureExtractorTest{

    public void test(){
        GoogleSteps steps = new GoogleSteps();
        steps.navigate();
        steps.inputCriteria("Weather in San Francisco, California");
        steps.arrayTemperature();
    }

}
