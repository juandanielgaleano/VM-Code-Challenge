package test.java.utils;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class APIutils {
    public static String sendGet(String url) throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(url);
        CloseableHttpResponse httpResponse = httpClient.execute(httpGet);
        try {
            HttpEntity entity = httpResponse.getEntity();
            if (entity != null) {
                InputStream inputStream = entity.getContent();
                try {
                    Scanner scanner = new Scanner(inputStream);
                    scanner.useDelimiter("\\A");
                    return scanner.hasNext() ? scanner.next() : "";
                } finally {
                    inputStream.close();
                }
            } else {
                return "";
            }
        } finally {
            httpResponse.close();
        }
    }

}
