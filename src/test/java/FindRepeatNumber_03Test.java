import org.junit.Test;

import static org.junit.Assert.*;

public class FindRepeatNumber_03Test {

    @Test
    public void findRepeatNumber() {
        assertEquals(2, FindRepeatNumber_03.findRepeatNumber(new int[]{2, 3, 1, 0, 2, 5}));
    }
}