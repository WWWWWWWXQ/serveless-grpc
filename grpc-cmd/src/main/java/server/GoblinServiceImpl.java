package server;

import goblin.GoblinServiceEntity;
import goblin.GoblinServiceGrpc;
import io.grpc.stub.StreamObserver;

public class GoblinServiceImpl extends GoblinServiceGrpc.GoblinServiceImplBase {
    @Override
    public void sayHello(GoblinServiceEntity.Request request, StreamObserver<GoblinServiceEntity.Response> responseObserver) {
        String name = request.getName();
        GoblinServiceEntity.Response resp = GoblinServiceEntity.Response.newBuilder().setMessage("Hello" + name + "!").build();
        responseObserver.onNext(resp);
        responseObserver.onCompleted();
    }
}
