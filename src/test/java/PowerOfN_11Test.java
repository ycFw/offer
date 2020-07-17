import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOfN_11Test {

    @Test
    public void powerOfN() {
        assertEquals(32.0, PowerOfN_11.powerOfN(2, 5), 0.1);
        assertEquals(1.0, PowerOfN_11.powerOfN(2, 0), 0.1);
        assertEquals(0.25, PowerOfN_11.powerOfN(2, -2), 0.1);
        assertEquals(4, PowerOfN_11.powerOfN(-2, 2), 0.1);
        assertEquals(0.25, PowerOfN_11.powerOfN(-2, -2), 0.1);
    }
}