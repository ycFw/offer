/**
 * @program: offer
 * @description: 构建乘积数组
 * @author: Yin Cong
 * @created: 2020/07/19 19:15
 */
public class Multiply_66 {
    /**
     * 给定一个数组 A[0, 1,..., n-1]，请构建一个数组 B[0, 1,..., n-1]，
     * 其中 B 中的元素 B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。要求不能使用除法。
     */
    public static int[] multiply(int[] arr) {
        int len = arr.length;
        int[] res = new int[len];
        //从左往右累乘
        for (int i = 0, product = 1; i < len; i++) {
            res[i] = product;
            product *= arr[i];
        }

        //从右往左累乘
        for (int i = len - 1, product = 1; i >= 0; i--) {
            res[i] *= product;
            product *= arr[i];
        }
        return res;
    }
}
