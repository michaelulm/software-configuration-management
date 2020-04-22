package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * Unit test for simple App.
 */
public class TickVaccinationAdviserTest {
  private TickVaccinationAdviser vac30, vac60;
  private String[] allergicReactions;

  /**
   * init a TickVaccinationAdviser instance
   */
  @BeforeEach
  public void setUp() {
    vac30 = new TickVaccinationAdviser(30);
    vac60 = new TickVaccinationAdviser(60);
  }

  /**
   * tests TickVaccinationAdviser function allergicReactionPossible
   * use the function
   * use assertEquals to verify the result
   * TODO: add useful DisplayName
   */
  @Test
  public void allergicReactionPossible() {
    fail("please implement me...");
  }

  /**
   * tests TickVaccinationAdviser function getPrimaryImmunizationDates
   * use the function
   * use assertEqualsArray to verify the result
   * TODO: add useful DisplayName
   */
  @Test
  public void getPrimaryImmunizationDates() {
    LocalDate[] expected = {
        LocalDate.of(2020, 4, 16),
        LocalDate.of(2020, 5, 16),
        LocalDate.of(2021, 5, 16)
    };

    fail("please implement me...");
  }

  /**
   * tests TickVaccinationAdviser method getNextVaccinationDate
   * use the method
   * use assertEquals to verify the result
   * TODO: add useful DisplayName
   */
  @ParameterizedTest
  @CsvSource({
      "2017, true, 2020, 2020",
      // TODO: add more Test sources...
  })
  public void getNextVaccinationDate(int lastVacYear, boolean firstRefreshmentVac, int expected30, int expected60) {
    int actual30 = vac30.getNextVaccinationDate(lastVacYear, firstRefreshmentVac);
    int actual60 = vac60.getNextVaccinationDate(lastVacYear, firstRefreshmentVac);

    assertEquals(expected30, actual30);
    assertEquals(expected60, actual60);
  }

  // TODO: Feel Free to insert other test cases for the String Stack Implementation !!!

}
