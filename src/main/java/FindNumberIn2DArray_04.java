/**
 * @program: offer
 * @description: 二维数组中的查找
 * @author: Yin Cong
 * @created: 2020/07/12 14:40
 */
public class FindNumberIn2DArray_04 {
    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
        int r = 0, c = matrix[0].length - 1;
        while (r < matrix.length && c >= 0) {
            int tmp = matrix[r][c];
            if (tmp == target) return true;
            else if (tmp < target) r++;
            else c--;
        }
        return false;
    }
}
