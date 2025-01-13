package org.example;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

class Solution128 {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        System.out.println(new Solution128().longestConsecutive(nums));

    }


    public int longestConsecutive(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int num : nums) {
            if (map.containsKey(num)) {
                continue;
            }
            int left = 0;
            int right = 0;
            if (map.containsKey(num - 1)) {
                left = map.get(num - 1);
            }
            if (map.containsKey(num + 1)) {
                right = map.get(num + 1);
            }
            int length = right + left + 1;
            map.put(num - left, length);
            map.put(num + right, length);
            map.put(num, length);
        }

        return map.values().stream().max(Integer::compareTo).get();
    }

}