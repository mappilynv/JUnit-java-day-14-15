import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MethodReturnTypesTest {

    @Test
    void stringMethod() {
        assertEquals("String of text", MethodReturnTypes.stringMethod());
    }

    @Test
    void intMethod() {
        assertEquals(5, MethodReturnTypes.intMethod());
    }

    @Test
    void booleanMethod() {
        assertFalse(MethodReturnTypes.booleanMethod());
    }
}