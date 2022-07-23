package com.project.springcloudzuuljt2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringCloudZuulJt2Application {

    @GetMapping("/getDoctor")
    public String getDoctorService() {

        return "Doctor microservice called...";

    }

    public static void main(String[] args) {

        SpringApplication.run(SpringCloudZuulJt2Application.class, args);

    }

}
