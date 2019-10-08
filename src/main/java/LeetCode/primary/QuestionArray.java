package LeetCode.primary;

import java.util.Arrays;

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

    public static void main(String[] args) {
        QuestionArray questionArray = new QuestionArray();

//        System.out.println(questionArray.removeDuplicates(new int[]{0,0,1,2,3}));
//        System.out.println(questionArray.removeDuplicates(new int[]{1,1,2}));
        System.out.println(questionArray.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }
}
