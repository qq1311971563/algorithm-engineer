package LeetCode;

public class Top3 {

    /**
     * 319 灯泡开关
     * @param n
     * @return
     */
    public int bulbSwitch(int n) {
        /*
        //极其蠢笨的方法...
        boolean[] bulbs =new boolean[n];//false开启,true关闭
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(j %i ==0){
                    bulbs[j - 1] = !bulbs[j - 1];
                }
            }
        }
        int ret = 0;
        for (int i = 0; i < n; i++) {
            if (!bulbs[i]) {
                ret++;
            }
        }
        return ret;*/
        //感觉到了来自学霸的蔑视
        //第i个灯泡的反转次数等于它所有因子（包括1和i）的个数，
        // 一开始的状态的灭的，只有反转奇数次才会变成亮的，
        // 所以只有因子个数为奇数的灯泡序号才会亮，
        // 只有平方数的因子数为奇数（比如6=1*6,2*3，
        // 它们的因子总是成对出现的，而4=1*4,2*2，
        // 只有平方数的平方根因子会只出现1次），
        // 所以最终答案等于n以内（包括n和1）的平方数数量，
        // 只要计算sqrt(n)即可
        return (int) Math.floor(Math.sqrt(n));
    }
}
