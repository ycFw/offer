
/**
 * @program: offer
 * @description: 数值的整数次方
 * @author: Yin Cong
 * @created: 2020/07/17 22:33
 */
public class PowerOfN_11 {
    public static double powerOfN(double base, int exponent) {
        if (exponent < 0) {
            base = 1 / base;
            exponent = -exponent;
        }
        return power(base, exponent);
    }

    private static double power(double base, int exponent) {
        if (exponent == 0) {
            return 1.0;
        }
        double half = power(base, exponent / 2);
        return (exponent & 1) == 0 ? half * half : half * half * base;
    }
}
