package com.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorController {

    @GetMapping("/getDoctor")
    public String getDoctorService() {

        return "Doctor microservice called...";

    }

    @GetMapping("/welcome/{name}")
    public String wish(@PathVariable String name) {

        return "Hi "+ name +" Welcome to Doctor Service";

    }

}
