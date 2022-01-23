package pl.sda.chuck.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.sda.chuck.dto.CountResponse;
import pl.sda.chuck.dto.Joke;
import pl.sda.chuck.exception.ExternalTechnicalException;
import pl.sda.chuck.service.JokeService;

@RestController
@Slf4j
public class JokeController {

    @Autowired
    JokeService jokeService;

    @GetMapping("/jokes/random")
    public Joke getRandomJoke() {
        return jokeService.getRandomJoke().orElseThrow(() -> new ExternalTechnicalException("oh nein!"));
        //TODO implement proper error handling and diff exceptions
    }

    @GetMapping("/joke/{id}")
    public Joke getJoke(@PathVariable Integer id) {
        log.info("Get joke with id: {}", id);
        return jokeService.getJoke(id).orElseThrow(() -> new ExternalTechnicalException("oh nein!"));
    }

    @GetMapping("/joke/count")
    public CountResponse getCountJoke() {
        log.info("Get count Jokes {}");
        return jokeService.getCountJoke().orElseThrow(() -> new ExternalTechnicalException("oh nein!"));

    }

    @PostMapping("/joke/add")
    public void saveJoke(@RequestBody Joke joke) {
        log.info("Joke to be saved: {}", joke);
    }


}