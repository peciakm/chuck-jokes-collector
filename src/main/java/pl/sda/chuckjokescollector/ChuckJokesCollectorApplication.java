package pl.sda.chuckjokescollector;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import pl.sda.chuckjokescollector.polimorfizm.A;
import pl.sda.chuckjokescollector.polimorfizm.B;
import pl.sda.chuckjokescollector.polimorfizm.C;


import java.util.Arrays;


@SpringBootApplication
@Slf4j
public class ChuckJokesCollectorApplication implements CommandLineRunner {

	@Autowired
	ApplicationContext context;

	@Autowired
	A a;

	@Autowired
	B b;

	@Autowired
	@Qualifier("d")
	C c;



	public static void main(String[] args) {
		SpringApplication.run(ChuckJokesCollectorApplication.class, args);
	}

	@Override
	public void run(String ... args) throws Exception {
		log.info("Hello, run with  args: ()");
		Arrays.stream(context.getBeanDefinitionNames()).forEach(s -> log.info("Name: {}", s));
		a.printMyName();
		b.printMyName();
		log.trace("Before method on c object invocation");
		c.printMyName();
		log.trace("After method on c object invocation");
	}

}