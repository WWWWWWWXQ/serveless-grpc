package server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class ServerRPCRuntime {
    private final Server server;

    public ServerRPCRuntime(int port) {
        server = ServerBuilder.forPort(port).addService(new GoblinServiceImpl()).build();
    }

    public void start() throws IOException {
        server.start();
    }

    public void shutdown() {
        server.shutdown();
    }
}
