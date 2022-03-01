package user;

import goblin.GoblinServiceEntity;
import goblin.GoblinServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class User {
    // User-stub
    private final GoblinServiceGrpc.GoblinServiceBlockingStub blockingStub;

    public User(String host, int port) {
        // UserRPCRuntime
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
        this.blockingStub = GoblinServiceGrpc.newBlockingStub(managedChannel);
    }

    public String sayHello(String name) {
        GoblinServiceEntity.Request greeting = GoblinServiceEntity.Request.newBuilder().setName(name).build();
        GoblinServiceEntity.Response response = blockingStub.sayHello(greeting);
        return response.getMessage();
    }
}
