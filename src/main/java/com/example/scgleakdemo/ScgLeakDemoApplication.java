 package com.example.scgleakdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScgLeakDemoApplication {

    public static void main(String[] args) {
        DirectMemoryReporter.startReport();
        SpringApplication.run(ScgLeakDemoApplication.class, args);
    }

}
