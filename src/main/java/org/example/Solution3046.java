package org.example;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

class Solution3046 {
    public static void main(String[] args) {

    }


    public boolean isPossibleToSplit(int[] nums) {
        int[] a = new int[1000];
        for (int num : nums) {
            a[num]++;
            if (a[num] > 2) {
                return false;
            }
        }
        return true;


    }

}