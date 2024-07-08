package moeda.conversor.modelos;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConverteAPI {

    public double conversor(String moeda1, String moeda2, double valor) {
        String key = "e6f8522db9ac7cd083847346";
        String url = "https://v6.exchangerate-api.com/v6/" + key + "/latest/" + moeda1;

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

            try {

                HttpResponse<String> response  = client.send(request, HttpResponse.BodyHandlers.ofString());
                JsonObject jsonObject = JsonParser.parseString(response.body()).getAsJsonObject();
                double converter = jsonObject.getAsJsonObject("conversion_rates").get(moeda2).getAsDouble();
                return valor * converter;


            } catch (IOException | InterruptedException e) {
                throw new RuntimeException("Erro na conversao");

            }
    }
}
