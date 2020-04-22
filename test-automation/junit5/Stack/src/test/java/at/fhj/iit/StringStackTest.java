package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public class StringStackTest {
  public IStack sut;

  @BeforeEach
  void setup() {
    sut = new StringStack(5); // keep size of 5 !!
  }

  /**
   * tests if stack is empty after initialization
   * use assert
   * - assertTrue to check it's empty
   * TODO: add useful DisplayName
   */
  @Test
  @DisplayName("testIsEmpty")
  public void testIsEmpty() {
    assertTrue(sut.isEmpty());
  }

  /**
   * tests if stack is empty after pushing
   * use assert
   * - assertFalse to check it's not empty
   * TODO: add useful DisplayName
   */
  @Test
  public void testIsNotEmpty() {
    fail("please implement me...");
  }

  /**
   * tests push and pop method
   * do following test
   * - use push, 1 or x times
   * - use pop, as often as you use push
   * - use isEmpty to check that's empty again
   * - assert every content of the stack in the correct ordering
   *
   * TODO: add useful DisplayName
   */
  @Test
  public void testPushPop() {
    fail("please implement me...");
  }

  /**
   * tests push throwing exception
   * do following test
   * - use push, as many times that it should throw an exception
   * - assert thrown exception
   *
   * TODO: add useful DisplayName
   */
  @Test
  public void testPushException() {
    fail("please implement me...");
  }

  /**
   * tests pop throwing exception
   * do following test
   * - use pop, as many times that it should throw an exception
   * - assert thrown exception
   *
   * TODO: add useful DisplayName
   */
  @Test
  public void testPopException() {
    fail("please implement me...");
  }

  // TODO: Feel Free to insert other test cases for the String Stack Implementation !!!

}
