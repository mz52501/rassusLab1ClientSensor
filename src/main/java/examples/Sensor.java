package examples;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Sensor {
    @JsonProperty("sensorId")
    private Long id;
    private Double latitude, longitude;
    private String ip;
    private Integer port;

    public Sensor() {
    }

    public Sensor(Double latitude, Double longitude, String ip, Integer port) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.ip = ip;
        this.port = port;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "Sensor{" +
            "id=" + id +
            ", latitude=" + latitude +
            ", longitude=" + longitude +
            ", ip='" + ip + '\'' +
            ", port=" + port +
            '}';
    }
}
