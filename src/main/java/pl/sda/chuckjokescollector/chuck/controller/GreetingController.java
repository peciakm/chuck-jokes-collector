package pl.sda.chuckjokescollector.chuck.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.chuckjokescollector.dto.Greeting;

import java.awt.*;

@RestController
public class GreetingController {

    @GetMapping(path = "/hello")
    public String hello() {
        return "world";
    }

    @GetMapping(path = "/hello/json", produces = MediaType.APPLICATION_JSON_VALUE)
    public Greeting helloJson() {
        return new Greeting("world");
    }
}
