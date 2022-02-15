package client;

public class ClientApplication {
    public static void main(String[] args) {
        int port = 8000;
        String localhost = "127.0.0.1";
        GrpcConsumer client = new GrpcConsumer(localhost, port);
        String reply = client.sayHello(" World " + Thread.currentThread() + System.currentTimeMillis());
        System.out.println(reply);
    }
}
