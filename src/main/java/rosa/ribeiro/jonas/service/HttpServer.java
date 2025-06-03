package rosa.ribeiro.jonas.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class HttpServer {
    private final HttpClient client;

    public HttpServer() {
        this.client = HttpClient.newBuilder()
                .connectTimeout(Duration.ofSeconds(10))
                .build();
    }

    public String getBody(String usuario) throws IOException, InterruptedException {

            String uri = "https://api.github.com/users/" + usuario + "/events";
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(uri))
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
