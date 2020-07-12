/**
 * @program: offer
 * @description: 数组中重复的数字
 * @author: Yin Cong
 * @created: 2020/07/12 14:23
 */
public class FindRepeatNumber_03 {
    /*
     * [2, 3, 1, 0, 2, 5, 3]  output:2 或 3  输出任意一个即可
     * */
    public static int findRepeatNumber(int[] array) {
        if (array == null || array.length == 0) return -1;
        for (int i = 0; i < array.length; i++) {
            //每次遍历把当前元素放到等于该元素值的下标位置上
            //比如第一个元素为2，就把2放到下标2的位置
            while (i != array[i]) {
                if (array[i] == array[array[i]]) {
                    return array[i];
                }
                int tmp = array[i];
                array[i] = array[array[i]];
                array[tmp] = tmp;
            }
        }
        return -1;
    }
}
