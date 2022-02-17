package com.example.grpcconsumer.client;

import greeter.GreeterGrpc;
import greeter.Request;
import greeter.Response;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GrpcClientController {

    @Autowired
    private SayHelloService sayHelloService;

    @GetMapping("/grpc/{str}")
    public String grpc(@PathVariable("str") String str){
        return sayHelloService.sayHello(str);
    }
}
