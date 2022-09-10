package org.example.endpoints;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.example.RecordTypeAdapterFactory;
import org.example.config.Endpoints;
import org.example.domain.CountriesResponse;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpResponse;

public class Countries extends Covid<CountriesResponse> {

    public Countries() throws URISyntaxException {
        this.uri = new URI(Endpoints.COUNTRIES.getUrl());
    }

    @Override
    protected CountriesResponse convertToResponse(HttpResponse<String> response, RecordTypeAdapterFactory factory) {
        try{
            TypeToken<CountriesResponse> responseTypeToken = new TypeToken<>() {};
            var respObj = factory.create(new Gson(), responseTypeToken);
            return  respObj.fromJson(response.body());
        } catch (IOException ex) {}
        return null;
    }
}
