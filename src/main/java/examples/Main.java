package examples;

import examples.CustomHttpClient;
import examples.Reading;
import examples.Sensor;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static Reading lastReading;

    public static void main(String[] args) throws IOException, InterruptedException {
        long startTime = System.currentTimeMillis();
        String baseUrl = "http://localhost:8090";
        Random random = new Random();
        double randomValueLat = Math.round((15.87 + (random.nextDouble() * 0.13)) * 100.0) / 100.0;
        double randomValueLong = Math.round((45.75 + (random.nextDouble() * 0.1)) * 100.0) / 100.0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Please write your ip: ");
        String ip = sc.next();
        System.out.print("Please write your port: ");
        int port = Integer.parseInt(sc.next());

        CustomHttpClient myHttpClient = new CustomHttpClient(baseUrl);

        String response = myHttpClient.registerSensor(new Sensor(randomValueLat, randomValueLong, ip, port));
        if (response.equals("error")) System.exit(1);
        int id = Integer.parseInt(response.substring(response.length() -1));
        System.out.println("Response on sensor registration: " + response);

        SimpleUnaryRPCServer server = new SimpleUnaryRPCServer(new SensorService(), port);
        server.start();


        while(true) {

            Reading newReading = myHttpClient.getRandomReading(startTime);
            lastReading = newReading;
            Sensor close = myHttpClient.getClosestNeighbour(id);
            if(close == null) {
                System.out.println(myHttpClient.saveSensorReading(id, newReading));
            } else {
                SimpleUnaryRPCClient client = new SimpleUnaryRPCClient(close.getIp(), close.getPort());
                SensorData sd = client.requestSensorDataFromClosestSensor(id);
                if(sd != null) {
                    Reading closestReading = new Reading();
                    closestReading.setTemperature(sd.getTemperature());
                    closestReading.setHumidity(sd.getHumidity());
                    closestReading.setPressure(sd.getPressure());
                    closestReading.setCo(sd.getCo());
                    closestReading.setNo2(sd.getNo2());
                    closestReading.setSo2(sd.getSo2());
                    Reading rd = myHttpClient.colaborate(newReading, closestReading);
                    System.out.println(myHttpClient.saveSensorReading(id, rd));
                } else {
                    System.out.println(myHttpClient.saveSensorReading(id, newReading));
                }
            }

            Thread.sleep(9000);
        }
    }
}
