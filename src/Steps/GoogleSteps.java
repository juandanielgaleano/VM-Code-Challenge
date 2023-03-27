package Steps;

import Pages.BasePage;
import Pages.GooglePage;

import java.util.ArrayList;

public class GoogleSteps {

    GooglePage google = new GooglePage();
    public void navigate(){
        google.navigate();
    }

    public void inputCriteria(String criteria){
        google.writeInput(criteria);
    }

    public String googletemp(){
        return google.googleTemperature();
    }
    public void arrayTemperature(){
        ArrayList<String> temperature = new ArrayList<String>();
        temperature.add(googletemp());
        System.out.println(temperature);
    }
}
