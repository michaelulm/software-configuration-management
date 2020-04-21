package at.fhj.iit;

public class LoanCalculator {
    /**
     * Loan amount
     */
    private double amount;
    /**
     * Interest rate interpreted as as percentage (5 = 5%)
     */
    private double interestRate;
    /**
     * Loan time in years
     */
    private int years;

     /**
     * Creates a LoanCalculator object with given loan parameters.
     * @param am loan amount
     * @param y years how long loan is taken
     * @param interestR fixed yearly interest rate in percent
     */
    public LoanCalculator(double am, int y, double interestR)
    {
        amount = am;
        interestRate = interestR;
        years = y;
    }

    /**
     * Calculate the monthly necessary repayment amount
     * Calculation see https://en.wikipedia.org/wiki/Mortgage_calculator
     * @return repayment amount
     */
    public double monthlyPayment()
    {
        double monthlyInterest = (interestRate / 12) / 100;
        int nrMonthlyPayments = years * 12;

        double monthlyPayment = (monthlyInterest) / (1 - Math.pow(1 + monthlyInterest, -nrMonthlyPayments)) * amount;

        return Math.rint( monthlyPayment * 100 ) / 100.;
    }

    /**
     * Total amount that has to be repayed to bank
     * @return total loan amount
     */
    public double totalAmountOwed()
    {
        return monthlyPayment() * years * 12;

    }

    /**
     * Total amount of interest due to loan
     * @return interest amount
     */
    public double totalInterestOwed()
    {
        double totalInterest = totalAmountOwed() - amount;
        return Math.rint( totalInterest * 100 ) / 100.;
    }

    /**
     * Builds String represenation
     * @return String representation of object
     */
    @Override
    public String toString() {
        return "Amount:" + amount + ", Interest rate:" + interestRate + ", " + "Years:" + years;
    }

    public double getAmount() {
        return amount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public int getYears() {
        return years;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void setYears(int years) {
        this.years = years;
    }


}
