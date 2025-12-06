package principal;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import tasa.cambio.TasaCambio;
import tasa.cambio.TasaR;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException{

        Gson gson = new Gson();



        try {

            HttpClient cliente = HttpClient.newHttpClient();

            HttpRequest solicitud = HttpRequest.newBuilder()
                    .uri(URI.create("https://v6.exchangerate-api.com/v6/4068694d72e3b8614c4e06fc/pair/USD/MXN"))
                    .build();

            HttpResponse<String> respuesta = cliente.send(solicitud, HttpResponse.BodyHandlers.ofString());

            String json = respuesta.body();

            //TasaCambio req = gson.fromJson(json, TasaCambio.class);
            TasaR req = gson.fromJson(json,TasaR.class);

            //System.out.println(req.target_code());
            System.out.println(req);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("""
                ************************************
                Bienvenido/a al conversor de Monedas
                
                1)Dòlar ---------> Peso Mexicano
                
                """);

    }
}
