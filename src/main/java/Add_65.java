/**
 * @program: offer
 * @description: 不用加减乘除做加法
 * @author: Yin Cong
 * @created: 2020/07/19 19:24
 */
public class Add_65 {
    /**
     * 写一个函数，求两个整数之和，要求不得使用 +、-、*、/ 四则运算符号。
     */
    public static int add(int a, int b) {
        //a ^ b 表示没有考虑进位的情况下两数之和，(a & b) << 1 就是进位
        return b == 0 ? a : add(a ^ b, (a & b) << 1);
    }

    /**
     * 不使用新变量，交换两个变量的值
     */
    public static void swap(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
    }
}
