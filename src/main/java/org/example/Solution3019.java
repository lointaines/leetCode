package org.example;

class Solution3019 {
    public static void main(String[] args) {
        new Solution3019().countKeyChanges("aAbBcC");
    }
    public int countKeyChanges(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        int sum = 0;
        char c = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (!(temp == c || temp - c == 32 || temp - c == -32)) {
                sum++;
                c = temp;
            }
        }
        return sum;
    }
}