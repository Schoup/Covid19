package org.example.domain;

import java.util.List;

public record StatisticsResponse(String get,
                                 List<Parameters> parameters,
                                 List<String> errors,
                                 int results,
                                 List<StatisticsBody> response){
/*public class StatisticsResponse{
    private String get;
    private List<Parameters> parameters;
    private List<String> errors;
    private int results;
    private List<StatisticsBody> response;

    public String getGet() {
        return get;
    }

    public void setGet(String get) {
        this.get = get;
    }

    public List<Parameters> getParameters() {
        return parameters;
    }

    public void setParameters(List<Parameters> parameters) {
        this.parameters = parameters;
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }

    public int getResults() {
        return results;
    }

    public void setResults(int results) {
        this.results = results;
    }

    public List<StatisticsBody> getResponse() {
        return response;
    }

    public void setResponse(List<StatisticsBody> response) {
        this.response = response;
    }*/
}
