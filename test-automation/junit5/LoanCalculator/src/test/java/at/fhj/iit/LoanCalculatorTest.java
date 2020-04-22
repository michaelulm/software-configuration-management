package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoanCalculatorTest {
  private LoanCalculator loan;

  /**
   * init a LoanCalculator instance
   */
  @BeforeEach
  void setUp() {
  }

  /**
   * tests LoanCalculator method monthlyPayment
   * use the method
   * use assertEquals to verify the result
   * may also be helpful:
   * https://onlinerechner.haude.at/Kreditrechner
   *
   * TODO: add a useful DisplayName
   */
  @Test
  @DisplayName("monthlyPayment")
  void monthlyPayment() {
    // TODO: fix me...
    double actual = loan.monthlyPayment();
    double expected = 0.0;

    assertEquals(expected, actual, 0.0001);
  }

  /**
   * tests LoanCalculator method totalAmountOwed
   * use the method
   * use assertEquals to verify the result
   * may also be helpful:
   * https://onlinerechner.haude.at/Kreditrechner
   *
   * TODO: add a useful DisplayName
   */
  @Test
  @DisplayName("totalAmountOwed")
  void totalAmountOwed() {
    fail("please implement me...");
  }

  /**
   * tests LoanCalculator method totalInterestOwed
   * use the method
   * use assertEquals to verify the result
   * may also be helpful:
   * https://onlinerechner.haude.at/Kreditrechner
   *
   * TODO: add a useful DisplayName
   */
  @Test
  @DisplayName("totalInterestOwed")
  void totalInterestOwed() {
    fail("please implement me...");
  }

  /**
   * tests LoanCalculator method toString
   * use the method
   * use assertEquals to verify the result
   * may also be helpful:
   * https://onlinerechner.haude.at/Kreditrechner
   *
   * TODO: add a useful DisplayName
   */
  @Test
  @DisplayName("toString")
  void getString() {
    fail("please implement me...");
  }

  /**
   * tests the edge case, when amount would be zero
   * what would be happen?
   * use the method
   * use assertThrows to verify the result
   * may also be helpful:
   * take a look on CalculatorImplTest
   */
  @Test
  @DisplayName("monthlyPayment with amount of zero")
  void monthlyPaymentZeroAmount() {
    fail("please implement me...");
  }
}