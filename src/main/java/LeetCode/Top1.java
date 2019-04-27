package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class Top1 {

    /**
     * 9 回文数
     * @param x
     * @return
     */
    public boolean isPalindrome(int x ){
        char[] str = (x + "").toCharArray();
        for (int i = 0,j = str.length - 1; i < j; i++,j--) {
            if (str[i] != str[j]) {
                return false;
            }
        }
        return true;
    }


    /**
     * 13 罗马数字转整数
     * @param s
     * @return
     */
    public int romanToInTt(String s) {
        Map<String,Integer> mod = new HashMap<>();
        mod.put("I", 1);
        mod.put("V", 5);
        mod.put("X", 10);
        mod.put("L", 50);
        mod.put("C", 100);
        mod.put("D", 500);
        mod.put("M", 1000);
        char[] chars = s.toCharArray();
        int ret = 0;
        for (int i = 0; i < chars.length; i++) {
            ret += mod.get(chars[i]);
        }
        return ret;
    }
}
