package lanqiao.seventh;

import org.junit.Test;

public class GroupB {

    /**
     * @Description: 凑算式
     * @return:
     */
    @Test
    public void questionThree() {
        dfs(0);
        System.out.println(count);
    }

    static boolean b[] = new boolean[9];// 标记
    static int a[] = new int[9];// 记录数字
    static int count = 0;

    private void dfs(int x) {
        if (x == 9) {
            double x1, x2, x3;
            x1 = a[0];
            x2 = (a[1] * 1.00 / a[2]);
            x3 = ((a[3] * 100 + a[4] * 10 + a[5]) * 1.00 / (a[6] * 100 + a[7] * 10 + a[8]));
            if (x1 + x2 + x3 == 10) {
                count++;
            }
        }
        for (int i = 0; i < 9; i++) {
            if (!b[i]) {
                a[x] = i + 1;// 取值
                b[i] = true;// 标记
                dfs(x + 1);// 进入下一层
                b[i] = false;// 取消标记
            }
        }
    }

    /**
     * @Description: 生日蜡烛
     * <p>
     * 某君从某年开始每年都举办一次生日party，并且每次都要吹熄与年龄相同根数的蜡烛。
     * <p>
     * 现在算起来，他一共吹熄了236根蜡烛。
     * <p>
     * 请问，他从多少岁开始过生日party的？
     * <p>
     * 请填写他开始过生日party的年龄数。 注意：你提交的应该是一个整数，不要填写任何多余的内容或说明性文字。
     * @return: 26
     */
    @Test
    public void questionOne() {
        for (int i = 1; i < 100; i++) {
            int sum = 0;
            for (int j = i; j < 100; j++) {
                sum += j;
                if (sum == 236) {
                    System.out.println(i);
                    return;
                }
            }
        }
    }
}
