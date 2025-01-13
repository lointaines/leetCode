package org.example;

import java.util.HashMap;
import java.util.Map;

class Solution189 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6};
        new Solution189().rotate(nums, 4);

    }

    public void rotate(int[] nums, int k) {

        if (k > nums.length) {
            k = k % nums.length;
        }
        int length = nums.length;

        boolean flag = (nums.length + k) % k == 0 && k != 1;
        int count  = gcd(k, nums.length);
        int iCount = flag ? k : 1;
        for (int i = 0; i < count; i++) {
            int tempCount = 0;
            int j = i;
            int first = nums[i];
            do {
                int pos = (j + k) % length;
                int temp = nums[pos];
                nums[pos] = first;
                first = temp;
                j = pos;
                tempCount++;
            } while (i != j);
        }
    }

    public int gcd(int x, int y) {
        return y > 0 ? gcd(y, x % y) : x;
    }
}