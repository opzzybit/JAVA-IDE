
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyqueueTest {

    private Myqueue storage;

   @BeforeEach
    public void setUp() {

        storage = new Myqueue(6);
    }
    @Test
    public void testThatYourStorageIsEmpty() {

        assertTrue(storage.isEmpty());
    }
    @Test
    public void testThatYourStorageIsSizeI() {
        assertEquals(6,storage.getNumberOfElements());
    }
    @Test
    public void testThatElementCanBeEnqueuedToTheStorage() {
       storage.enqueue("boot");
        storage.enqueue("Assets");
          storage.enqueue("Welthy");
        assertEquals(3,storage.getNumberOfElements());
    }
}
