import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {

    public Monedas buscarMoneda(String monedaBase, String monedaDestino) {

        URI url = URI.create("https://v6.exchangerate-api.com/v6/41c70302b86fe1b778ca4b52/pair/" + monedaBase + "/" + monedaDestino);

       HttpClient client = HttpClient.newHttpClient();
        HttpRequest request= HttpRequest.newBuilder()
                .uri(url)
                .build();

   try {
       HttpResponse<String> response = client
               .send(request, HttpResponse.BodyHandlers.ofString());
       return new Gson().fromJson(response.body(),  Monedas.class);

      }catch (Exception e){

       throw new RuntimeException("Moneda no encontrada");
     }
    }
}