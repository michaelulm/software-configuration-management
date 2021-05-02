package at.fhj.iit;

/**
 * Calcuator Implementation of common mathematical operations
 */
public class CalculatorImpl implements Calculator {
	
	/**
	 * Easy Calculator for first steps in test automation for Educational Usage
	 */
	public CalculatorImpl(){
		
	}

	// TODO implement addition methods
	// TOOD test those new added implementations too (!)


	/**
	 * Calculates <b>Sum</b> of two numbers
	 * @param number1
	 * @param number2
	 * @return sum of number1 + number2
	 */
	@Override
	public double add(double number1, double number2){
		return number1 + number2;
	}

	/**
	 * Calculates <b>Difference</b> of two numbers
	 * @param number1
	 * @param number2
	 * @return diff of number1 - number2
	 */
	@Override
	public double minus(double number1, double number2){
		return number1 - number2;
	}

	/**
	 * Calculates <b>Quotient</b> of two numbers
	 * @param number1
	 * @param number2
	 * @return quotient of number1 / number2
	 */
	@Override
	public double divide(double number1, double number2){
		double quotient = number1 / number2;
		if(Double.isNaN(quotient) || Double.isInfinite(quotient))
			throw new ArithmeticException("Division " + number1 + " / " +number2 +" isn't possible");
		return number1 / number2;
	}

	/**
	 * Calculates <b>Product</b> of two numbers
	 * @param number1
	 * @param number2
	 * @return product of number1 x number2
	 */
	@Override
	public double multiply(double number1, double number2){
		return number1 * number2;
	}

	/**
	 * Calculates <b>faculty</b> of any number from 1 to n, e.g. 1 x 2 x 3 x 4 ... x n
	 *
	 * @param number
	 * @return
	 */
	public int faculty(int number){
		int f = 1;
		for(int i = number; i > 0; i--){
			f = f * i;
		}
		return f;
	}

	/**
	 * Calculates <b>sum of all natural numbers</b> from 1 to n by using Gauss' formula
	 *
	 * https://de.wikipedia.org/wiki/Gau%C3%9Fsche_Summenformel
	 * @param n least number of row from 1 to n
	 * @return sum of all numbers from 1 to n
	 */
	public int sumOfNaturalNumbers(int n){
		return (n * (n+1)) / 2;
	}

}
