package server;

import java.io.IOException;

public class ServerApplication {
    public static void main(String[] args) throws IOException {
        int port = 8000;
        ServerRPCRuntime runtime = new ServerRPCRuntime(port);
        System.out.println("Server start!");
        runtime.start();
        System.in.read();
        runtime.shutdown();
        System.out.println("Server shutdown!");
    }
}
