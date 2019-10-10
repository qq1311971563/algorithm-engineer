package LeetCode.primary;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class QuestionArray {

    /**
     * 删除数组重复元素
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[j]){
                continue;
            }else {
                nums[++j] = nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
        return j+1;
    }


    /**
     * 买卖股票的最佳时机 II
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        int result = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                result += prices[i] - prices[i-1];
                System.out.println(prices[i - 1] + "---" + prices[i]);
            }

        }
        return result;
    }

    /**
     * 旋转数组
     * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
     * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/23/
     * @param nums
     * @param k
     */
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }
    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }


    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length);
        for (int x: nums) {
            if (set.contains(x)) return true;
            set.add(x);
        }
        return false;

    }


    public static void main(String[] args) {
        QuestionArray questionArray = new QuestionArray();

//        System.out.println(questionArray.removeDuplicates(new int[]{0,0,1,2,3}));
//        System.out.println(questionArray.removeDuplicates(new int[]{1,1,2}));
//        System.out.println(questionArray.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
//        System.out.println(questionArray.maxProfit(new int[]{7,1,5,3,6,4}));
//        System.out.println(questionArray.maxProfit(new int[]{1,2,3,4,5}));
        questionArray.rotate(new int[]{1,2,3,4,5,6,7}, 3);
    }
}
