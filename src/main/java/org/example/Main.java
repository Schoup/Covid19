package org.example;

import org.example.endpoints.Statistics;

import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) {
        try {
            Statistics stats = new Statistics();
            var statsObj = stats.getData();
            statsObj.response().forEach(System.out::println);
        } catch (URISyntaxException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
