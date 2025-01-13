package org.example;

import java.util.*;

class Solution283 {
    public static void main(String[] args) {
        new Solution283().moveZeroes(new int[]{0, 1, 0, 3, 12});
    }

    public void moveZeroes(int[] nums) {
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0 ) {
                nums[left] = nums[i];
                left++;
            }
        }
        while (left < nums.length) {
            nums[left++] = 0;
        }
    }
}