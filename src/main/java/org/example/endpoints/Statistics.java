package org.example.endpoints;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.example.RecordTypeAdapterFactory;
import org.example.config.Endpoints;
import org.example.domain.StatisticsResponse;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Statistics extends Covid<StatisticsResponse> {
    public Statistics() throws URISyntaxException {
        this.uri = new URI(Endpoints.STATISTICS.getUrl());
    }

    @Override
    protected StatisticsResponse convertToResponse(HttpResponse<String> response, RecordTypeAdapterFactory factory) {
        try {
            TypeToken<StatisticsResponse> responseTypeToken = new TypeToken<>() {
            };
            var respObj = factory.create(new Gson(), responseTypeToken);
            return respObj.fromJson(response.body());
        } catch (IOException ex) {
        }
        return null;
    }

    @Override
    protected void addHeaders(HttpRequest.Builder requestBuilder) {
        requestBuilder.header("country", Endpoints.BELGIUM.getUrl());
    }
}
