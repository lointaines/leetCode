package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution438 {
    public static void main(String[] args) {
        new Solution438().findAnagrams("aaaabccccccccaaaaaaaab", "aaaab");
    }

    public List<Integer> findAnagrams(String s, String p) {
        int[] s1 = new int[26];
        int[] p1 = new int[26];
        for (int i = 0; i < p.length(); i++) {
            p1[p.charAt(i) - 'a']++;
        }
        List<Integer> res = new ArrayList<>();
        int l = 0;
        for (int r = 0; r < s.length(); r++) {
            int pos = s.charAt(r) - 'a';
            s1[pos]++;
            if (r - l + 1 > p.length()) {
                s1[s.charAt(l) - 'a']--;
                l++;
            }
            if (r - l + 1 == p.length()) {
                if (Arrays.equals(s1, p1)) {
                    res.add(l);
                }
            }
        }
        return res;
    }
}