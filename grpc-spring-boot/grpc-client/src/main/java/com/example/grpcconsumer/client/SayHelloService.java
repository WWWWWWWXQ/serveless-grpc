package com.example.grpcconsumer.client;

import greeter.GreeterGrpc;
import greeter.Request;
import greeter.Response;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@Service
public class SayHelloService {

    @GrpcClient("grpc-server")
    private GreeterGrpc.GreeterBlockingStub stub;

    public String sayHello(String str) {
        Response response = stub.sayHello(Request.newBuilder().setName(str).build());
        return response.getMessage();
    }

}
