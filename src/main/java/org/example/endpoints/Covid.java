package org.example.endpoints;

import org.example.RecordTypeAdapterFactory;
import org.example.config.Endpoints;

import java.net.ProxySelector;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

public abstract class Covid<T> {

    protected URI uri;
    protected T responseObj;

    public T getData() {
        try {
            HttpRequest.Builder requestBuilder = HttpRequest.newBuilder()
                    .uri(uri)
                    .header("Accept", Endpoints.ACCEPT.getUrl())
                    .header("X-RapidAPI-Key", Endpoints.ACCEPT.getRapidApiKey())
                    .header("X-RapidAPI-Host", Endpoints.ACCEPT.getRapidApiHost());

            addHeaders(requestBuilder);

            HttpRequest request = requestBuilder
                    .timeout(Duration.of(3, ChronoUnit.SECONDS))
                    .GET()
                    .build();

            HttpClient client = HttpClient.newBuilder()
                    .followRedirects(HttpClient.Redirect.ALWAYS)
                    .proxy(ProxySelector.getDefault())
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                RecordTypeAdapterFactory factory = new RecordTypeAdapterFactory();
                responseObj = convertToResponse(response, factory);
            }
        } catch (Exception ex) {
            System.err.println(ex.getLocalizedMessage());
        }
        return responseObj;
    }

    protected void addHeaders(HttpRequest.Builder requestBuilder) {
    }

    protected abstract T convertToResponse(HttpResponse<String> response, RecordTypeAdapterFactory factory);
}
