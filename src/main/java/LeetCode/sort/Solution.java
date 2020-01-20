package LeetCode.sort;

import java.util.Arrays;

public class Solution {
    /**
     * 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] ret = new int[m + n];
        for (int i = 0, j = 0,k = 0; k < m+n; ) {
            if(nums1[i] == nums2[j]){
                ret[k++] = nums1[i];
                ret[k] = nums2[i];
                i++;
                j++;
                k++;
            } else if (nums1[i] < nums2[j]) {
                ret[k] = nums1[i];
                k++;
                i++;
            } else {
                ret[k] = nums1[j];
                k++;
                j++;
            }
        }
        System.out.println(Arrays.toString(ret));
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.merge(
                new int[]{1,2,3,0,0,0},
                3,
                new int[]{2,5,6},
                3
        );
    }

}
