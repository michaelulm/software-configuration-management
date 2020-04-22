package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Point3dTest {
  private Point3d first;
  private Point3d second;

  /**
   * Set some Point3d for testing their functionality
   */
  @BeforeEach
  void setup() {
    first = new Point3d(0, 1, -2);
    second = new Point3d(-8, 16, 7);
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
    fail("please implement me...");
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
   * Test the Setter of the z-coordinate
   *   - set the coordinate
   *   - get the value from the object
   *   - try to compare your value with the return value of z
   */
  @Test
  @DisplayName("(re)-set Z coordinate")
  void testSetZ() {
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