package org.example;

import java.util.Arrays;

class Solution52274 {
    public static void main(String[] args) {
        new Solution52274().maxConsecutive(6, 8, new int[]{6, 7, 8});
    }

    public int maxConsecutive(int bottom, int top, int[] special) {
        Arrays.sort(special);
        int sum = special[0] - bottom;
        for (int i = 1; i < special.length; i++) {
            sum = Math.max(sum, special[i] - special[i - 1] - 1);
        }
        sum = Math.max(sum, top - special[special.length - 1]);
        return sum;
    }
}