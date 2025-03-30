package com.example.publicar.Controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@CrossOrigin(origins = "*")
public class InfoController {
    @GetMapping("/info")
    public String getInfo() {
        RestTemplate restTemplate = new RestTemplate();
        String apiUrl = "https://dog.ceo/api/breeds/image/random";
        String response = restTemplate.getForObject(apiUrl, String.class);
        return response;
    }
}
