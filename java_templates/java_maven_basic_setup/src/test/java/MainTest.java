import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    @DisplayName("Very simple test")
    void simpleTest() {
        assertEquals(42, 42);
        assertNotEquals(42, 4587);
    }

    @Test
    @DisplayName("Another very simple test")
    void anotherSimpleTest() {
        assertEquals("Hello World!", "Hello World!");
    }
}
