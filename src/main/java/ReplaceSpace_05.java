/**
 * @program: offer
 * @description: 替换空格
 * @author: Yin Cong
 * @created: 2020/07/12 14:53
 */
public class ReplaceSpace_05 {
    public static String replaceSpace(String s) {
        if (s == null || s.length() == 0) return s;
        int len = s.length();
        //全是空格的情况，设置三倍容量
        int size = 0;
        char[] array = new char[len * 3];
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                array[size++] = '%';
                array[size++] = '2';
                array[size++] = '0';
            } else {
                array[size++] = c;
            }
        }
        String newStr = new String(array, 0, size);
        return newStr;
    }
}
