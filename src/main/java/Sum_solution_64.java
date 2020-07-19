/**
 * @program: offer
 * @description: 求1+2+...+n
 * @author: Yin Cong
 * @created: 2020/07/19 19:46
 */
public class Sum_solution_64 {
    public static int sum_solution(int n) {
        int sum = n;
        boolean flag = (n > 0) && ((sum += sum_solution(n - 1)) > 0);
        return sum;
    }
}
