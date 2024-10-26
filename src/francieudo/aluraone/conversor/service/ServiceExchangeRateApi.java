package francieudo.aluraone.conversor.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import francieudo.aluraone.conversor.modelos.Moeda;
import francieudo.aluraone.conversor.modelos.PairMoeda;
import io.github.cdimascio.dotenv.Dotenv;

public class ServiceExchangeRateApi {

    private Dotenv dotenv;

    public ServiceExchangeRateApi(){
        dotenv = Dotenv.load();
    }

    public double getConversionrate(Moeda base, Moeda target){

        URI endereco = URI.create("https://v6.exchangerate-api.com/v6/" + 
                dotenv.get("EXCHANGE_RATE_API") + "/pair/" + base + "/" + target);
        
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(endereco).build();

        Gson gson = new GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
            .setPrettyPrinting()
            .create();
        
        PairMoeda moeda = null;
        
         try {

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            
            moeda = gson.fromJson(response.body(), PairMoeda.class);

            
            
        } catch (IOException | InterruptedException e) {
            
            e.printStackTrace();
        }

        return moeda.conversionRate();
        
    }

}
