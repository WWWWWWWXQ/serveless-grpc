package com.example.consumer;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConsumerApplicationTests {

    @Test
    void contextLoads() {
        int port = 8000;
        String localhost = "127.0.0.1";
        GrpcConsumer client = new GrpcConsumer(localhost, port);
        String reply = client.sayHello(" World " + Thread.currentThread() + System.currentTimeMillis());
        System.out.println(reply);
    }

}
