package com.example.grpcconsumer.client;

import greeter.GreeterGrpc;
import greeter.Request;
import greeter.Response;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GrpcClientController {
    @GrpcClient("GreeterGrpc")
    private GreeterGrpc.GreeterBlockingStub stub;

    @GetMapping("/grpc")
    public String grpc(){
        Response response = stub.sayHello(Request.newBuilder().setName(" World!").build());
        return response.getMessage();
    }
}
