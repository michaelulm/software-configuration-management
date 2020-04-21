package at.fhj.iit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Testing BubbleSort implementation")
public class BubbleSortTest {
    @Test
    @DisplayName("Sort positive numbers")
    void testPositive() {
        int[] unsorted = {3, 60, 35, 2, 45, 320, 5};
        int[] sorted = {2, 3, 5, 35, 45, 60, 320};

        BubbleSort.sort(unsorted);

        assertArrayEquals(sorted, unsorted);
    }
    
    @Test
    @DisplayName("Sort negative numbers")
    void testNegative() {
        fail("please implement me...");;
    }

    @Test
    @DisplayName("Test mixed numbers")
    void testMixed() {
        fail("please implement me...");
    }

    // ToDo: add your own tests
}
