import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {

       String apiKey = "4d043b4acb24b5a9329cd5a98de02fa7";
       String cidade = "Mossoro"; //Aqui a gente adiciona a cidade que a gente quer

        try {
            String cidadeCodificada = URLEncoder.encode(cidade, StandardCharsets.UTF_8.toString());

            String url = "http://api.weatherstack.com/current?access_key=" + apiKey + "&query=" + cidadeCodificada;

                        HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("Resposta da API: " + response.body());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}