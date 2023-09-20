package com.avatar.test.controller;

import com.avatar.test.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/test/api")
public class ApiController {
    private final ApiService apiService;

    @Autowired
    public ApiController(ApiService apiService) {
        this.apiService = apiService;
    }

    @GetMapping("/getApiData")
    @CrossOrigin(origins = "http://localhost:3000")
    public  String getApiData() {
        String apiData = apiService.getApiData();
        return apiData;
    }
}
