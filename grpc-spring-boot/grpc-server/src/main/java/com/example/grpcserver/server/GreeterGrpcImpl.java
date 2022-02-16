package com.example.grpcserver.server;

import greeter.GreeterGrpc;
import greeter.Request;
import greeter.Response;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class GreeterGrpcImpl extends GreeterGrpc.GreeterImplBase {
    @Override
    public void sayHello(Request request, StreamObserver<Response> responseObserver) {
        String name = request.getName();
        Response resp = Response.newBuilder().setMessage("Hello" + name + "!").build();
        responseObserver.onNext(resp);
        responseObserver.onCompleted();
    }
}
