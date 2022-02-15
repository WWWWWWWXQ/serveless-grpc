package com.example.consumer;

import greeter.GreeterGrpc;
import greeter.Request;
import greeter.Response;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcConsumer {
    private final GreeterGrpc.GreeterBlockingStub blockingStub;

    public GrpcConsumer(String host, int port) {
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
        this.blockingStub = GreeterGrpc.newBlockingStub(managedChannel);
    }

    public String sayHello(String name) {
        Request greeting = Request.newBuilder().setName(name).build();
        Response response = blockingStub.sayHello(greeting);
        return response.getMessage();
    }
}
