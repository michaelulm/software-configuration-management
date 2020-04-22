package at.fhj.iit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Testing Point2d implementation")
public class Point2dTest {
  private Point2d first;
  private Point2d second;

  /**
   * Set some Point2d for testing their functionality
   */
  @BeforeEach
  void setup() {
    first = new Point2d(-3, 5);
  }

  /**
   * Test the Setter of the x-coordinate 
   *   - set the coordinate 
   *   - get the value from the object 
   *   - try to compare your value with the return value of x
   */
  @Test
  @DisplayName("(re)-set X coordinate")
  void testSetX() {
    first.setX(5);
    double x = first.getX();

    assertEquals(5, x);
  }

  /**
   * Test the Setter of the y-coordinate 
   *   - set the coordinate 
   *   - get the value from the object 
   *   - try to compare your value with the return value of y
   */
  @Test
  @DisplayName("(re)-set Y coordinate")
  void testSetY() {
    fail("please implement me...");
  }

  /**
   * Test the distanceFrom() Method 
   *   - call the method distanceFrom and calculate the distance 
   *   - calculate the distance by your own implementation 
   *   - try to compare your result with the return value of distanceFrom()
   */
  @Test
  @DisplayName("Testing the distance between 2 Points")
  void testDistanceFrom() {
    fail("please implement me...");
  }

  /**
   * Test the distanceFromOrigin() Method 
   *   - call the method distanceFromOrigin and calculate the distance 
   *   - calculate the distance by your own implementation 
   *   - try to compare your result with the return value of distanceFromOrigin()
   */
  @Test
  @DisplayName("Testing the distance for a Point to the origin")
  void testDistanceFromOrigin() {
    fail("please implement me...");
  }

}