import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class AverageMethodTest {

    @org.junit.jupiter.api.Test
    @DisplayName("Sum of three numbers")
    void sumMethod() {
        assertEquals(10, AverageMethod.sumMethod(2, 3, 5));
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Average of three numbers")
    void averageMethod() {
        assertEquals(12, AverageMethod.averageMethod(16, 15, 5));
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Average of three numbers with double results")
    void averageMethod2() {
        assertEquals(4.666666666666667, AverageMethod.averageMethod(7, 4, 3));
    }

}