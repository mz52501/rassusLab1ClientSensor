package examples;

import examples.Reading;
import examples.Sensor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Objects;
import java.util.Set;

public class CustomHttpClient {

    private String baseUrl;
    private RestTemplate restTemplate;

    public CustomHttpClient(String baseUrl) {
        this.baseUrl = baseUrl;
        this.restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());

    }

    public Set<Reading> fetchSensorReadings(int id) {
        ResponseEntity<Set<Reading>> response = restTemplate.exchange(baseUrl + "/sensor/" + id, org.springframework.http.HttpMethod.GET, null, new ParameterizedTypeReference<Set<Reading>>() {});
        return response.getBody();
    }

    public String registerSensor(Sensor sensor) {
        ResponseEntity<String> response = restTemplate.postForEntity(baseUrl + "/sensors", sensor, String.class);
        if (response.getStatusCodeValue() != 201) return "error";
        else return response.getHeaders().getLocation().toString();
    }

    public String saveSensorReading(int id, Reading reading) {
        ResponseEntity<Reading> responseEntity= restTemplate.postForEntity(baseUrl + "/sensor/" + id + "/reading", reading, Reading.class);
        if (responseEntity.getStatusCodeValue() != 201) return responseEntity.getStatusCode().toString();
        else return Objects.requireNonNull(responseEntity.getHeaders().getLocation()).toString();
    }

    public List<Reading> getReadingList() {
        ResponseEntity<List<Reading>> readings = restTemplate.exchange(baseUrl + "/readings", org.springframework.http.HttpMethod.GET, null, new ParameterizedTypeReference<List<Reading>>() {});
        return readings.getBody();
    }

    public Set<Sensor> fetchAllSensors() {
        ResponseEntity<Set<Sensor>> response = restTemplate.exchange(baseUrl + "/sensors", org.springframework.http.HttpMethod.GET, null, new ParameterizedTypeReference<Set<Sensor>>() {});
        return response.getBody();
    }

    public Sensor getClosestNeighbour(int id) {
        ResponseEntity<Sensor> response = restTemplate.getForEntity(baseUrl + "/neighbour/" + id, Sensor.class);
        return response.getBody();
    }

    public Reading getRandomReading(long startTime) {
        List<Reading> readings = getReadingList();
        int elapsedTime = (int)((System.currentTimeMillis() - startTime ) / 1000);
        Reading reading = readings.get(elapsedTime % 100);
        return reading;
    }

    public Reading colaborate(Reading original, Reading neighbour) {
        Reading reading = new Reading();
        if(original.getTemperature().equals("") || original.getTemperature().equals("0")) {
            if(neighbour.getTemperature().equals("") || neighbour.getTemperature().equals("0")) {
                reading.setTemperature(null);
            } else {
                reading.setTemperature(neighbour.getTemperature());
            }
        } else {
            if(neighbour.getTemperature().equals("") || neighbour.getTemperature().equals("0")) {
                reading.setTemperature(original.getTemperature());
            } else {
                int org =  Integer.parseInt(original.getTemperature());
                int neb =  Integer.parseInt(neighbour.getTemperature());
                Double rdg = (double) (org + neb) / 2;
                reading.setTemperature(rdg.toString());
            }
        }
        if(original.getHumidity().equals("") || original.getHumidity().equals("0")) {
            if(neighbour.getHumidity().equals("") || neighbour.getHumidity().equals("0")) {
                reading.setHumidity(null);
            } else {
                reading.setTemperature(neighbour.getHumidity());
            }
        } else {
            if(neighbour.getHumidity().equals("") || neighbour.getHumidity().equals("0")) {
                reading.setHumidity(original.getHumidity());
            } else {
                int org =  Integer.parseInt(original.getHumidity());
                int neb =  Integer.parseInt(neighbour.getHumidity());
                Double rdg = (double) (org + neb) / 2;
                reading.setHumidity(rdg.toString());
            }
        }
        if(original.getPressure().equals("") || original.getPressure().equals("0")) {
            if(neighbour.getPressure().equals("") || neighbour.getPressure().equals("0")) {
                reading.setPressure(null);
            } else {
                reading.setPressure(neighbour.getPressure());
            }
        } else {
            if(neighbour.getPressure().equals("") || neighbour.getPressure().equals("0")) {
                reading.setPressure(original.getPressure());
            } else {
                int org =  Integer.parseInt(original.getPressure());
                int neb =  Integer.parseInt(neighbour.getPressure());
                Double rdg = (double) (org + neb) / 2;
                reading.setPressure(rdg.toString());
            }
        }
        if(original.getCo().equals("") || original.getCo().equals("0")) {
            if(neighbour.getCo().equals("") || neighbour.getCo().equals("0")) {
                reading.setCo(null);
            } else {
                reading.setCo(neighbour.getCo());
            }
        } else {
            if(neighbour.getCo().equals("") || neighbour.getCo().equals("0")) {
                reading.setCo(original.getCo());
            } else {
                int org =  Integer.parseInt(original.getCo());
                int neb =  Integer.parseInt(neighbour.getCo());
                Double rdg = (double) (org + neb) / 2;
                reading.setCo(rdg.toString());
            }
        }
        if(original.getNo2().equals("") || original.getNo2().equals("0")) {
            if(neighbour.getNo2().equals("") || neighbour.getNo2().equals("0")) {
                reading.setNo2(null);
            } else {
                reading.setNo2(neighbour.getNo2());
            }
        } else {
            if(neighbour.getNo2().equals("") || neighbour.getNo2().equals("0")) {
                reading.setNo2(original.getNo2());
            } else {
                int org =  Integer.parseInt(original.getPressure());
                int neb =  Integer.parseInt(neighbour.getPressure());
                Double rdg = (double) (org + neb) / 2;
                reading.setNo2(rdg.toString());
            }
        }
        if(original.getSo2().equals("") || original.getSo2().equals("0")) {
            if(neighbour.getSo2().equals("") || neighbour.getSo2().equals("0")) {
                reading.setSo2(null);
            } else {
                reading.setSo2(neighbour.getSo2());
            }
        } else {
            if(neighbour.getSo2().equals("") || neighbour.getSo2().equals("0")) {
                reading.setSo2(original.getSo2());
            } else {
                int org =  Integer.parseInt(original.getPressure());
                int neb =  Integer.parseInt(neighbour.getPressure());
                Double rdg = (double) (org + neb) / 2;
                reading.setSo2(rdg.toString());
            }
        }
        return reading;
    }
}
