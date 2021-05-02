package at.fhj.iit;

/**
 * Calculator Interface, more Details see at Implementation
 *
 * @see at.fhj.iit.CalculatorImpl
 */
public interface Calculator {

	public abstract double add(double number1, double number2);

	public abstract double minus(double number1, double number2);

	public abstract double divide(double number1, double number2);

	public abstract double multiply(double number1, double number2);

	public abstract int faculty(int number);

	public abstract int sumOfNaturalNumbers(int n);

}