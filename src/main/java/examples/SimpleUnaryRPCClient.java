package examples;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class SimpleUnaryRPCClient {
    private static final Logger logger = Logger.getLogger(SimpleUnaryRPCClient.class.getName());
    private final ManagedChannel channel;
    private final SensorServiceGrpc.SensorServiceBlockingStub sensorServiceBlockingStub;

    public SimpleUnaryRPCClient(String host, int port) {
        this.channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
        this.sensorServiceBlockingStub = SensorServiceGrpc.newBlockingStub(channel);
    }

    public void stop() throws InterruptedException {
        // Initiates an orderly shutdown in which preexisting calls continue but new calls are
        // immediately cancelled. Waits for the channel to become terminated, giving up if the
        // timeout is reached.
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public SensorData requestSensorDataFromClosestSensor(long currentSensorId) {
        SensorRequest request = SensorRequest.newBuilder()
            .setSensorId(currentSensorId)
            .build();
        logger.info("Sending: " + request.getSensorId());
        try {
            SensorData sensorData = sensorServiceBlockingStub.requestSensorData(request);
            logger.info("Received: " + sensorData.toString());
            return sensorData;
        }  catch (StatusRuntimeException e) {
            logger.info("RPC failed: " + e.getMessage());
            return null;
        }
    }
}
