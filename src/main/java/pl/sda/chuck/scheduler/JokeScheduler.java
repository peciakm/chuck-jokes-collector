package pl.sda.chuck.scheduler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import pl.sda.chuck.dto.Joke;
import pl.sda.chuck.exception.ExternalTechnicalException;
import pl.sda.chuck.service.JokeService;

import java.util.Optional;

@Component
@Slf4j
public class JokeScheduler {

    @Autowired
    JokeService jokeService;

    // https://www.freeformatter.com/cron-expression-generator-quartz.html
    @Scheduled(cron = "* * * * * *") //TODO extract to configuration
    public void schedule() {
        log.info("Scheduler invoked");
        //1.GetJoke
        Optional<Joke> randomJoke = jokeService.getRandomJoke();
        randomJoke.ifPresent(joke -> jokeService.save(joke));
        //2.SaveJoke
        //3.Be sure that has been logged
    }

}