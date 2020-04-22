package at.fhj.iit;

public class CalculatorImpl implements ICalculator {

    /**
     * Easy Calculator for first steps in test automation for Educational Usage
     */
    public CalculatorImpl() {

    }

    /*
     * (non-Javadoc)
     * 
     * @see at.fhj.itm.demo.Calculator#add(java.lang.double, java.lang.double)
     */
    @Override
    public double add(double number1, double number2) {
        return number1 + number2;
    }

    /*
     * (non-Javadoc)
     * 
     * @see at.fhj.itm.demo.Calculator#minus(java.lang.double, java.lang.double)
     */
    @Override
    public double minus(double number1, double number2) {
        return number1 - number2;
    }

    /*
     * (non-Javadoc)
     * 
     * @see at.fhj.itm.demo.Calculator#divide(java.lang.double, java.lang.double)
     */
    @Override
    public double divide(double number1, double number2) {
        double quotient = number1 / number2;
        if (Double.isNaN(quotient) || Double.isInfinite(quotient))
            throw new ArithmeticException("Division " + number1 + " / " + number2 + " isn't possible");
        return number1 / number2;
    }

    /*
     * (non-Javadoc)
     * 
     * @see at.fhj.itm.demo.Calculator#multiply(java.lang.double, java.lang.double)
     */
    @Override
    public double multiply(double number1, double number2) {
        return number1 * number2;
    }
}
