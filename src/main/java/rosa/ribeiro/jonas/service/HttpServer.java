package rosa.ribeiro.jonas.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class HttpServer {
    private static HttpClient client = null;

    public HttpServer() {
        client = HttpClient.newBuilder()
                .connectTimeout(Duration.ofSeconds(10))
                .build();
    }

    public static String UriCreate(String usuario){
        return "https://api.github.com/users/" + usuario + "/events";
    }

    public static String getBody(String usuario) throws IOException, InterruptedException {


            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(UriCreate(usuario)))
                    .timeout(Duration.ofSeconds(5))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            int status = response.statusCode();
            if(!(response.body().equalsIgnoreCase("[]"))) {
                if (status >= 200 && status < 300) {
                    return response.body();
                } else {
                    throw new IOException("Erro: " + status);
                }
            } else {
                return "Não há resultado";
            }
    }
}
