import java.io.IOException;

public class TestDemo {
    public static void main(String[] args) throws IOException {
        int port = 8000;
        GrpcProvider server = new GrpcProvider(port);
        server.start();
        GrpcConsumer client = new GrpcConsumer("127.0.0.1", port);
        String reply = client.sayHello("World");
        System.out.println(reply);
        server.shutdown();
    }
}
