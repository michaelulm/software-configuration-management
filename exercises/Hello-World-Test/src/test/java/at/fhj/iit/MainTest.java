package at.fhj.iit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
	public void testHello(){
	   Main m = new Main();
	   assertEquals(11, m.sayHello("test"));
	}

}