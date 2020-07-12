import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceSpace_05Test {

    @Test
    public void replaceSpace() {
        assertEquals("", "");
        assertEquals("%20%20%20", ReplaceSpace_05.replaceSpace("   "));
        assertEquals("Kevin%20Durant", ReplaceSpace_05.replaceSpace("Kevin Durant"));
    }
}