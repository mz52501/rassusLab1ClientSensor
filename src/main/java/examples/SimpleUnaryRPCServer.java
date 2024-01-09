package examples;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class SimpleUnaryRPCServer {
    private static final Logger logger = Logger.getLogger(SimpleUnaryRPCServer.class.getName());
    private Server server;
    private final SensorService service;
    private final int port;

    public SimpleUnaryRPCServer(SensorService service, int port) {
        this.service = service;
        this.port = port;
    }

    public void start() throws IOException {
        //Register service
        server = ServerBuilder.forPort(port).addService(service).build().start();
        logger.info("Server started on " + port);
        // Clean shutdown of server in case of JVM shutdown
        Runtime.getRuntime().addShutdownHook(new Thread(() -> { System.err.println("Shutting down gRPC server since JVM is shutting down");
            try {
                SimpleUnaryRPCServer.this.stop();
            } catch (InterruptedException e) {
                e.printStackTrace(System.err);
            }
            System.err.println("Server shut down");
        }));
    }

    public void stop() throws InterruptedException {
        if(server != null) {
            server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
        }
    }

    public void blockUntilShutdown() throws InterruptedException {
        if(server != null) {
            server.awaitTermination();
        }
    }
}
