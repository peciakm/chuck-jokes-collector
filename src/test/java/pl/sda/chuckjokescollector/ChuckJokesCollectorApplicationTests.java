package pl.sda.chuckjokescollector;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.sda.chuckjokescollector.polimorfizm.C;

@SpringBootTest
class ChuckJokesCollectorApplicationTests {



	@Autowired
	C a;

	@Test
	@DisplayName("Spring context verification test - positive")
	void contextLoadsTest() {
		//given( optional)

		//when
		String status = a.getStatus();
		//then
		Assertions.assertEquals("ACTIVE", status);
	}

}