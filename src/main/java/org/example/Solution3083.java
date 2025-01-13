package org.example;

class Solution3083 {
    public static void main(String[] args) {
        new Solution3083().isSubstringPresent("abcd");

    }


    public boolean isSubstringPresent(String s) {
        StringBuilder sb = new StringBuilder(s);
        String s1 = sb.reverse().toString();
        for (int i = 0; i < s.length() - 1; i++) {
            String string = s1.substring(i, i + 2);
            if (s.contains(string)) {
                return true;
            }
        }
        return false;
    }

}