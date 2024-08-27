/*package com.example.google.controller;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/")
public class GoogleController {
    @GetMapping

    public Map<String, Object> currentUser(OAuth2AuthenticationToken OAuth2AuthenticationToken) {
        return OAuth2AuthenticationToken.getPrincipal().getAttributes();
    }

}*/



package com.example.google.controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class GoogleController {

    /*@GetMapping("/")
    public String home(){
       return "Hello, home!";
    }*/

    @GetMapping("/secured")
    public String secured(){
        return "Hello, Secured!";
    }

}


