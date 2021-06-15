package org.apache.karaf.examples.rest.api;

public class Weather {
    private int id;

    public double getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Weather() {
    }

    public Weather(int id) {
        this.id = id;
    }
}
