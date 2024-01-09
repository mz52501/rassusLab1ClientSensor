package examples;

import com.google.protobuf.Message;
import io.grpc.stub.StreamObserver;

import java.util.Locale;
import java.util.logging.Logger;

public class SensorService extends SensorServiceGrpc.SensorServiceImplBase {
    private static final Logger logger = Logger.getLogger(SensorService.class.getName());

    @Override
    public void requestSensorData(SensorRequest request, StreamObserver<SensorData> responseObserver) {
        logger.info("Got a new message from sensor id: " + request.getSensorId());


        SensorData sensorData = SensorData.newBuilder()
            .setTemperature(Main.lastReading.getTemperature())
            .setHumidity(Main.lastReading.getHumidity())
            .setPressure(Main.lastReading.getPressure())
            .setCo(Main.lastReading.getCo())
            .setNo2(Main.lastReading.getNo2())
            .setSo2(Main.lastReading.getSo2())
            .build();

        responseObserver.onNext(sensorData);

        logger.info("Responding with: " + sensorData);
        // Send a notification of successful stream completion.
        responseObserver.onCompleted();
    }
}
