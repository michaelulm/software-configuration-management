package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Testing CalculatorImpl to complete High Test Coverage
 */
@DisplayName("Testing Calculator implementation")
public class CalculatorImplTest {
	private Calculator calc;

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
	/**
	 * is testing addition of two numbers
	 */
	void testAdd(double addend1, double addend2, double expected) {
		// EXERCISE PHASE
		double actual = calc.add(addend1, addend2);

		// VERIFY PHASE
		assertEquals(expected, actual, 0.001);
	}

	@Test
	@DisplayName("Testing subtraction")
	/**
	 * is testing difference of two numbers
	 */
	public void testMinus() {
		// EXERCISE PHASE
		double actual = calc.minus(5, 2);

		// VERIFY PHASE
		assertEquals(3, actual, 0.001);
	}

	@Test
	@DisplayName("Testing multiplication")
	/**
	 * is testing multiplication of two numbers
	 */
	public void testMultiply() {
		double actual = calc.multiply(5, 2);
		assertEquals(10, actual, 0.001);
	}

	@Test
	@DisplayName("Testing divide")
	/**
	 * is testing division of two numbers
	 */
	public void testDivide() {
		double actual = calc.divide(5, 2);
		assertEquals(2.5, actual, 0.001);
	}

	@Test
	@DisplayName("Testing divide by zero")
	/**
	 * is testing division by zero, which has to throw Exception
	 */
	public void testDivideWithZero() {
		assertThrows(ArithmeticException.class, () -> {
			calc.divide(5, 0);
		});
	}

	@ParameterizedTest
	@CsvSource({
			"0, 1",
			"1, 1",
			"2, 2 ",
			"3, 6",
			"4, 24",
			"5, 120",
			"6, 720",
			"7, 5040"
	})
	@DisplayName("Testing faculty")
	/**
	 * is testing faculty calculation by a couple of numbers
	 */
	void testFaculty(int number, int expected) {
		assertEquals(expected, calc.faculty(number));
	}


	@Test
	@DisplayName("Testing sum from 1 to n")
	/**
	 * is testing sum of natural numbers between 1 and 5
	 */
	void testSumOfNaturalNumbers() {
		assertEquals(calc.sumOfNaturalNumbers(5), (1+2+3+4+5));
	}


}
