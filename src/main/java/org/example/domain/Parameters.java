package org.example.domain;

public class Parameters {
    private String country;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Parameters{" +
                "country='" + country + '\'' +
                '}';
    }
}
