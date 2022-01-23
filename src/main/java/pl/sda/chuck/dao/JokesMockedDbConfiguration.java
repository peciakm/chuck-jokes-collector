package pl.sda.chuck.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("mocked-db")
public class JokesMockedDbConfiguration {

    @Bean
    JokesMockedDb jokesMockedDb() {
        return new JokesMockedDb();
    }
}
