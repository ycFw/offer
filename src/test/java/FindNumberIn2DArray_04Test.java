import org.junit.Test;

import static org.junit.Assert.*;

public class FindNumberIn2DArray_04Test {

    @Test
    public void findNumberIn2DArray() {
        int[][] matrix = {{1, 2, 8}, {2, 4, 9}, {4, 7, 10}};
        assertEquals(true, FindNumberIn2DArray_04.findNumberIn2DArray(matrix, 10));
        assertEquals(false, FindNumberIn2DArray_04.findNumberIn2DArray(matrix, 6));
        assertEquals(false, FindNumberIn2DArray_04.findNumberIn2DArray(null, 4));
    }
}