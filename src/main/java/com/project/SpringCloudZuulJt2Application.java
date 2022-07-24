package com.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringCloudZuulJt2Application {

    @GetMapping("/getDoctor")
    public String getDoctorService() {

        return "Doctor microservice called...";

    }

    @GetMapping("/welcome/{name}")
    public String wish(@PathVariable String name) {

        return "Hi "+ name +" Welcome to Doctor Service";

    }

    public static void main(String[] args) {

        SpringApplication.run(SpringCloudZuulJt2Application.class, args);

    }

}