package Tests;

import Steps.GoogleSteps;
import Steps.OpenweatherSteps;
import org.testng.annotations.Test;

import java.io.IOException;

@Test
public class TemperatureExtractorTest{

    public void test() throws IOException {
        GoogleSteps websteps = new GoogleSteps();
        OpenweatherSteps apisteps = new OpenweatherSteps();
        websteps.navigate();
        websteps.inputCriteria("Weather in San Francisco, California");
        System.out.println(apisteps);
        System.out.println("Diference betwen google temperature: " + websteps.arrayTemperature() +" and api temperature: " + apisteps.getTemperature() +" is: " + (apisteps.getTemperature()- websteps.arrayTemperature()));
    }
}
