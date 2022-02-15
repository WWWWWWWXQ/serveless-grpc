package com.example.provider;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class GrpcProvider {
    private final Server server;

    public GrpcProvider(int port) {
        server = ServerBuilder.forPort(port).addService(new GreeterRpcService()).build();
    }

    public void start() throws IOException {
        server.start();
    }

    public void shutdown() {
        server.shutdown();
    }
}
