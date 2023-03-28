import org.testng.annotations.Test;
import test.java.steps.GoogleSteps;
import test.java.steps.OpenweatherSteps;

import java.io.IOException;

@Test(testName = "Navigate and obtain data from api")
public class TemperatureExtractorTest{

    public void getTemperature() throws IOException {
        GoogleSteps websteps = new GoogleSteps();
        OpenweatherSteps apisteps = new OpenweatherSteps();
        websteps.navigate();
        websteps.inputCriteria("Weather in San Francisco, California");
        System.out.println(apisteps);
        System.out.println("Diference between google temperature: " + websteps.arrayTemperature() +" and api temperature: " + apisteps.getTemperature() +" is: " + (apisteps.getTemperature()- websteps.arrayTemperature()));
        websteps.closeWindow();
    }
}
