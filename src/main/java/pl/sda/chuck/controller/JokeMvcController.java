package pl.sda.chuck.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class JokeMvcController {

    @GetMapping("/view/joke")
    public String showJoke() {
        return "joke";
    }
}