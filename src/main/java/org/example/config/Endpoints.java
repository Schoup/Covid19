package org.example.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public enum Endpoints {
    COUNTRIES ( "https://covid-193.p.rapidapi.com/countries" ),
    STATISTICS ( "https://covid-193.p.rapidapi.com/statistics" ),
    BELGIUM ( "Belgium" ),
    ACCEPT ( "application/json" );

    private final String url;
    private final String rapidApiKey;
    private final String rapidApiHost;

    Endpoints(String url) {
        this.url = url;
        var prop = readProperties();
        this.rapidApiHost = prop.getProperty("rapid.api.host");
        this.rapidApiKey = prop.getProperty("rapid.api.key");
    }

    public String getUrl() {
        return this.url;
    }

    public String getRapidApiKey() {
        return rapidApiKey;
    }

    public String getRapidApiHost() {
        return rapidApiHost;
    }

    private Properties readProperties() {
        Properties prop = new Properties();
        String fileName = "app.config";
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        try(InputStream in = classloader.getResourceAsStream(fileName)) {
            prop.load(in);
        } catch (IOException ex) {
            System.err.println(
                    """
                        You will need to create a file app.config in the resources directory and add the following properties:
                        rapid.api.host=covid-193.p.rapidapi.com
                        rapid.api.key=EnterYourPersonalKeyHere
                    """);
            ex.printStackTrace(System.err);
        }
        return prop;
    }
}
