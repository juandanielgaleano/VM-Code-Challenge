package test.java.steps;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

public class OpenweatherSteps {

    String apiKey = "8dc2254371b24fc061fc337af56d6bb9";
    String apiUrl = "http://api.openweathermap.org/data/2.5/weather?q=San+Francisco,California,US&units=metric&appid=" + apiKey;

    public int getTemperature() throws IOException {
        String apiResponse = test.java.utils.APIutils.sendGet(apiUrl);
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode rootNode = objectMapper.readTree(apiResponse);
        JsonNode mainNode = rootNode.get("main");
        int temperatureAPI = mainNode.get("temp").asInt();
        return temperatureAPI;

    }

}
