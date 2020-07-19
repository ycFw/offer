import org.junit.Test;

import static org.junit.Assert.*;

public class StrToInt_67Test {

    @Test
    public void strToInt() {
        assertEquals(21345, StrToInt_67.strToInt("+21345"));
        assertEquals(0, StrToInt_67.strToInt("+21a345"));
    }
}