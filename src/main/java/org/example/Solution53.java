package org.example;

import java.util.*;

class Solution53 {
    public static void main(String[] args) {
        new Solution53().maxSubArray(new int[]{8,-1,-1,-1,-1,4});
    }

    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int max = nums[0];
        int prefix = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix = Math.max(prefix + nums[i], nums[i]);
            max = Math.max(max, prefix);
        }
        return max;
    }
}