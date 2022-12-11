package com.example.domasna2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;


@SpringBootApplication
@ServletComponentScan
public class Domasna2Application {

    public static void main(String[] args) {
        SpringApplication.run(Domasna2Application.class, args);
    }

}
