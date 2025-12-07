package conexion.api;

import com.google.gson.Gson;
import tasa.cambio.TasaR;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConexionApi {

    public double conexion(String monedaBase, String monedaObjetivo) {

        Gson gson = new Gson();

        TasaR req = null;
        double rate = 0;
        try {

            HttpClient cliente = HttpClient.newHttpClient();

            HttpRequest solicitud = HttpRequest.newBuilder()
                    .uri(URI.create("https://v6.exchangerate-api.com/v6/4068694d72e3b8614c4e06fc/pair/" + monedaBase + "/" + monedaObjetivo))
                    .build();

            HttpResponse<String> respuesta = cliente.send(solicitud, HttpResponse.BodyHandlers.ofString());

            String json = respuesta.body();

            //TasaCambio req = gson.fromJson(json, TasaCambio.class);
            req = gson.fromJson(json, TasaR.class);

            rate = Double.parseDouble(req.conversion_rate());
            //System.out.println(req);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return rate;
    }

}
