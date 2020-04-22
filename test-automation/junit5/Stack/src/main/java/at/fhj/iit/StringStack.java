package at.fhj.iit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Stack Implementation of <code>Stack</code> Interface.
 * supports String Values and can be initialized with a maximum number
 * of items.
 *
 * @author Michael Ulm
 * @version 1.0
 * @see IStack
 */
public class StringStack implements IStack {
  private static final Logger logger = LogManager.getLogger(StringStack.class);
  /**
   * stores the string values of this stack
   */
  private String[] elementData;

  /**
   * is the position counter of the top item
   */
  private int elementCount;


  /**
   * Constructor that initializes the stack with the given size.
   *
   * @param capacity the size of the initialized stack.
   *                 If the size is lower than 0,
   *                 the Constructor will throw an exception
   */
  public StringStack(int capacity) {
    logger.info("constructor with capacity " + capacity);
    if (capacity <= 0) {
      logger.error("throw IllegalArgumentException");
      throw new IllegalArgumentException("size <= 0");
    }
    elementData = new String[capacity];
    elementCount = 0;
  }

  @Override
  public boolean isEmpty() {
    logger.info("check if empty");
    // if the array is empty returns true, otherwise their are elements and returns false
    return (elementCount == 0);
  }

  @Override
  public void push(String item) {
    logger.info("push");
    if (elementCount == elementData.length) {
      logger.error("throw IllegalStateException");
      throw new IllegalStateException();
    }
    // add element to array and increment the counter
    elementData[elementCount++] = item;
  }

  @Override
  public String pop() {
    logger.info("pop");
    if (elementCount == 0) {
      logger.error("throw IllegalStateException");
      throw new IllegalStateException();
    }
    //returns the element and decrement the counter
    return elementData[--elementCount];
  }
}