package com.example.mychat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.mychat"})
public class MychatApplication {

    public static void main(String[] args) {
        SpringApplication.run(MychatApplication.class, args);
    }

}

