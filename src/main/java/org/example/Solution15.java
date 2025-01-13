package org.example;

import java.util.*;

class Solution15 {
    public static void main(String[] args) {
        new Solution15().threeSum(new int[]{0, 0, 0, 0});
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        Set<String> set = new HashSet<>();
        for (int i = 0; i < nums.length - 2; i++) {
            int a = nums[i];
            if (a > 0) {
                break;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int b = nums[left];
                int c = nums[right];
                int sum = a + nums[left] + nums[right];
                if (sum == 0) {
                    List<Integer> list = Arrays.asList(a, b, c);
                    res.add(list);
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;
                } else if (a + b + c > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return res;
    }
}