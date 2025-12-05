package peticion.datos;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Peticion {

    String direccion = "https://v6.exchangerate-api.com/v6/4068694d72e3b8614c4e06fc/latest/USD";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
    try{

    } catch (IOException e){}


}
