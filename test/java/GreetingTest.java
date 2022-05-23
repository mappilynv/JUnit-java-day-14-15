import org.junit.jupiter.api.Test;


import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {

    @Test
    void greetingTest() {
        String name = "Hops and Meadow.";
        InputStream input = new ByteArrayInputStream(name.getBytes());
        System.setIn(input);
        assertEquals("Hi Hops and Meadow.", Greeting.greetingInput());
    }
}