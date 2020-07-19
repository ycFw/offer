/**
 * @program: offer
 * @description: 把字符串转换为整数
 * @author: Yin Cong
 * @created: 2020/07/19 19:04
 */
public class StrToInt_67 {
    /**
     * 将一个字符串转换成一个整数，字符串不是一个合法的数值则返回 0，要求不能使用字符串转换整数的库函数。
     */
    public static int strToInt(String str) {
        if (str.length() == 0 || str == null) {
            return 0;
        }
        //先判断正负号
        boolean isNegative = str.charAt(0) == '-';
        int res = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (i == 0 && (c == '+' || c == '-')) {
                continue;
            }
            //处理非法输入
            if (c < '0' || c > '9') {
                return 0;
            }
            res = res * 10 + (c - '0');
        }
        return isNegative ? -res : res;
    }
}
