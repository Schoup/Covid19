package org.example.domain;

import java.util.List;

public record CountriesResponse(String get, List<String> parameters, List<String> errors, int results, List<String> response) {

}
