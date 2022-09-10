package org.example.domain;

public class StatisticsBody {
    private String continent;
    private String country;
    private int population;
    private Cases cases;
    private Deaths deaths;
    private Tests tests;

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public Cases getCases() {
        return cases;
    }

    public void setCases(Cases cases) {
        this.cases = cases;
    }

    public Deaths getDeaths() {
        return deaths;
    }

    public void setDeaths(Deaths deaths) {
        this.deaths = deaths;
    }

    public Tests getTests() {
        return tests;
    }

    public void setTests(Tests tests) {
        this.tests = tests;
    }

    @Override
    public String toString() {
        return "StatisticsBody{" +
                "continent='" + continent + '\'' +
                ", country='" + country + '\'' +
                ", population=" + population +
                ", cases=" + cases +
                ", deaths=" + deaths +
                ", tests=" + tests +
                '}';
    }

    /*Example:
     "continent": "Europe",
            "country": "Belgium",
            "population": 11694286,
            "cases": {
                "new": null,
                "active": 163373,
                "critical": 115,
                "recovered": 4218654,
                "1M_pop": "377471",
                "total": 4414255
            },
            "deaths": {
                "new": null,
                "1M_pop": "2756",
                "total": 32228
            },
            "tests": {
                "1M_pop": "2992695",
                "total": 34997435
            },
            "day": "2022-08-01",
            "time": "2022-08-01T09:00:03+00:00"*/
}
