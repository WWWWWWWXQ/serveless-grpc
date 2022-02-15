package server;

import java.io.IOException;

public class ServerApplication {
    public static void main(String[] args) throws IOException {
        int port = 8000;
        GrpcProvider server = new GrpcProvider(port);
        System.out.println("Server start!");
        server.start();
        System.in.read();
        server.shutdown();
        System.out.println("Server shutdown!");
    }
}
