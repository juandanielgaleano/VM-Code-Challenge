package test.java.pages;

public class GooglePage extends BasePage {
    public String searchbox = "q";
    public String temperaturespan = "//*[@id=\"wob_tm\"]";

    public void navigate(){
        navigateTo("https://www.google.com/");
    }

    public void writeInput(String criteria){
        FindByName(searchbox).sendKeys(criteria);
        FindByName(searchbox).submit();
    }

    public String googleTemperature(){
        String googletemp = FindById(temperaturespan).getText();
        return googletemp;
    }

}
