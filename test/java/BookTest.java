import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    Book theLittlePrince = new Book("The Little Prince", 200, 1943);

    @Test
    void getBookTitle() {
        assertEquals("The Little Prince", theLittlePrince.getBookTitle());
    }

    @Test
    void getPageNum() {
        assertEquals(200, theLittlePrince.getPageNum());
    }

    @Test
    void getPublicationYear() {
        assertEquals(1943, theLittlePrince.getPublicationYear());
    }
}