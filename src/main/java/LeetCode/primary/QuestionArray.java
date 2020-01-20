package LeetCode.primary;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class QuestionArray {

    /**
     * 删除数组重复元素
     *
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[j]) {
                continue;
            } else {
                nums[++j] = nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
        return j + 1;
    }


    /**
     * 买卖股票的最佳时机 II
     *
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        int result = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                result += prices[i] - prices[i - 1];
                System.out.println(prices[i - 1] + "---" + prices[i]);
            }

        }
        return result;
    }

    /**
     * 旋转数组
     * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
     * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/23/
     *
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
        for (int x : nums) {
            if (set.contains(x)) return true;
            set.add(x);
        }
        return false;

    }

    /**
     * 只出现一次的数字
     * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
     *
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            num = num ^ nums[i];
        }
        return num;
    }

    /**
     * 两个数组的交集 II
     * 给定两个数组，编写一个函数来计算它们的交集。
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0) {
            return new int[]{};
        }


        return nums1;
    }


    /**
     * 加1
     * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/27/
     *
     * @param digits
     * @return
     */
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i] = digits[i] + 1;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        System.arraycopy(digits, 0, result, 1, digits.length);
        return result;

    }

    /**
     * 移动0
     *
     * @param nums
     */
    public void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }
        for (int i = j + 1; i < nums.length; i++) {

        }
    }

    /**
     * 旋转图像
     * 给定一个 n × n 的二维矩阵表示一个图像。
     * <p>
     * 将图像顺时针旋转 90 度。
     *
     * @param matrix
     */
    public void rotate(int[][] matrix) {

        //矩阵转置
        int n = matrix.length;

        // transpose matrix
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int tmp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = tmp;
            }
        }
        // reverse each row
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][n - j - 1];
                matrix[i][n - j - 1] = tmp;
            }
        }


        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }


    public static void main(String[] args) {
        QuestionArray questionArray = new QuestionArray();

//        System.out.println(questionArray.removeDuplicates(new int[]{0,0,1,2,3}));
//        System.out.println(questionArray.removeDuplicates(new int[]{1,1,2}));
//        System.out.println(questionArray.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
//        System.out.println(questionArray.maxProfit(new int[]{7,1,5,3,6,4}));
//        System.out.println(questionArray.maxProfit(new int[]{1,2,3,4,5}));
//        questionArray.rotate(new int[]{1,2,3,4,5,6,7}, 3);
//        questionArray.singleNumber(new int[]{1,2,1 });
//        System.out.println(Arrays.toString(questionArray.plusOne(new int[]{9})));
//        questionArray.moveZeroes(new int[]{0, 0, 1, 3, 12});

        questionArray.rotate(new int[][]{
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                }
        );

    }


}
