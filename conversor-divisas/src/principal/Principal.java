package principal;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException{

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();


        try {

            HttpClient cliente = HttpClient.newHttpClient();

            HttpRequest solicitud = HttpRequest.newBuilder()
                    .uri(URI.create("https://v6.exchangerate-api.com/v6/4068694d72e3b8614c4e06fc/pair/EUR/GBP"))
                    .GET()
                    .build();

            HttpResponse<String> respuesta = cliente.send(solicitud, HttpResponse.BodyHandlers.ofString());

            System.out.println(respuesta.body());

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
