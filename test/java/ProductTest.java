import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {


    Product kimchi = new Product("A jar of kimchi", 7.0, 50);
    @Test
    @DisplayName("Test the constructor of product")
    void productConstructorTest() {
        assertEquals("A jar of kimchi", kimchi.getProductName());
        assertEquals(7.0, kimchi.getProductCost());
        assertEquals(50, kimchi.getProductQuantity());
    }


    @Test
    void totalCost() {
        assertEquals(350.0, kimchi.totalCost());
    }

    @Test
    void printProduct() {
        assertEquals("A jar of kimchi costs 7.0 and 50 were purchased", kimchi.printProduct());
    }
}