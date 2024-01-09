package examples;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Reading {
    @JsonProperty("readingId")
    private Long id;
    private String temperature, humidity, pressure, co, no2, so2;

    public Reading() {
    }

    public Reading(String temperature, String humidity, String pressure, String co, String no2, String so2) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.co = co;
        this.no2 = no2;
        this.so2 = so2;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public String getCo() {
        return co;
    }

    public void setCo(String co) {
        this.co = co;
    }

    public String getNo2() {
        return no2;
    }

    public void setNo2(String no2) {
        this.no2 = no2;
    }

    public String getSo2() {
        return so2;
    }

    public void setSo2(String so2) {
        this.so2 = so2;
    }

    @Override
    public String toString() {
        return "Reading{" +
            "id=" + id +
            ", temperature='" + temperature + '\'' +
            ", humidity='" + humidity + '\'' +
            ", pressure='" + pressure + '\'' +
            ", co='" + co + '\'' +
            ", no2='" + no2 + '\'' +
            ", so2='" + so2 + '\'' +
            '}';
    }
}
