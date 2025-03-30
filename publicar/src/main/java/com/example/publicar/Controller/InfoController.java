package com.example.publicar.Controller;


import lombok.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
@RequestMapping("/info")
@CrossOrigin(origins = "*")
public class InfoController {

    @GetMapping
    public Map<String, Object> getInfo() {
        RestTemplate restTemplate = new RestTemplate();
        String apiUrl = "https://dog.ceo/api/breeds/image/random";
        return restTemplate.getForObject(apiUrl, Map.class);
    }
}
