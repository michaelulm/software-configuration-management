package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testing Calculator implementation")
public class CalculatorImplTest {
	private ICalculator calc;

	/**
	 * inits Calculator with CalculatorImpl for EACH test
	 */
	@BeforeEach
	void setup() {
		// SETUP PHASE
		calc = new CalculatorImpl();
	}

	@ParameterizedTest
	@CsvSource({ 
		" 1,  2,  3", 
		" 0,  0,  0", 
		" 3,  4,  7", 
		"-2,  2,  0", 
		"-8,  3, -5", 
		"-4,  6,  2", 
		"-2, -2, -4" 
	})
	@DisplayName("Testing addition")
	void testAdd(double addend1, double addend2, double expected) {
		// EXERCISE PHASE
		double actual = calc.add(addend1, addend2);

		// VERIFY PHASE
		assertEquals(expected, actual, 0.001);
	}

	@Test
	@DisplayName("Testing subtraction")
	public void testMinus() {
		// EXERCISE PHASE
		double actual = calc.minus(5, 2);

		// VERIFY PHASE
		assertEquals(3, actual, 0.001);
	}

	@ParameterizedTest
	@DisplayName("Testing multiplication")
	public void testMultiply() {
		fail("please implement me...");
	}

	@ParameterizedTest
	@DisplayName("Testing divide")
	public void testDivide() {
		fail("please implement me...");
	}

	@Test
	@DisplayName("Testing divide by zero")
	public void testDivideWithZero() {
		assertThrows(ArithmeticException.class, () -> {
			calc.divide(5, 0);
		});
	}

	// ToDo: add your own tests

}
