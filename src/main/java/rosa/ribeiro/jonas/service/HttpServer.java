package rosa.ribeiro.jonas.service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class HttpServer {

    private String uri;

    HttpRequest request = HttpRequest.newBuilder()
            .GET()
            .uri(URI.create(uri))
            .build();

    HttpClient client = HttpClient.newBuilder()
            .build();

    HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
}
