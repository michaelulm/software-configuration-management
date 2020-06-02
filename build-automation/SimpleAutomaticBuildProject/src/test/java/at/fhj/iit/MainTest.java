package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;


@DisplayName("Testing Simple Automation Project")
public class MainTest {

	private Main m;

	@BeforeEach
	void setup() {
		// SETUP PHASE
		m = new Main();
	}

	@ParameterizedTest
	@CsvSource({ 
		"Mike, 11",
		"Christian, 16",
		"Harald, 13",

	})
	@DisplayName("Say Multiple Hello")
	void testSayHello(String name, int expected) {

		// EXERCISE PHASE
		int actual = m.sayHello(name);

		// VERIFY PHASE
		assertEquals(expected, actual);
	}

}
