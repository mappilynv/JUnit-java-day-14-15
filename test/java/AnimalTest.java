import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void getName() {
        Animal dog = new Animal("Mac");
        assertEquals("Mac", dog.getName());
    }

    @Test
    void getDog() {
        Animal notDog = new Animal("False");
        assertFalse(notDog.dogOrNot);
    }

}