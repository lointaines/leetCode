package org.example;

class Solution11 {
    public static void main(String[] args) {
        new Solution11().maxArea(new int[]{0, 1, 0, 3, 12});
    }

    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int max = 0;
        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            max = Math.max(max, area);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}