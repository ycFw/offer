import org.junit.Test;

import static org.junit.Assert.*;

public class Multiply_66Test {

    @Test
    public void multiply() {
        assertArrayEquals(new int[]{120, 60, 40, 30, 24}, Multiply_66.multiply(new int[]{1, 2, 3, 4, 5}));
        assertArrayEquals(new int[]{120, 240, 48, 80, 30}, Multiply_66.multiply(new int[]{2, 1, 5, 3, 8}));
    }
}