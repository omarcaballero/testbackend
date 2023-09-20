package com.avatar.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ApiService {
    private final String apiUrl= "https://swapi.dev/api/films/ ";

    @Autowired
    private RestTemplate restTemplate;

    public String  getApiData() {
        String result = restTemplate.getForObject(apiUrl,  String.class);
        return result;
    }
}
