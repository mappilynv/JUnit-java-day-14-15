import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivideMethodTest {

    @Test
    @DisplayName("Divide method of two numbers")
    void divide() {
        assertEquals(6.0, DivideMethod.divide(12.0, 2.0));
    }

    @Test
    @DisplayName("Divide method of two numbers with remainder")
    void divide2() {
        assertEquals(12.5, DivideMethod.divide(25.0, 2.0));
    }

}