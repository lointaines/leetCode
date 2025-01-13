package org.example;

import java.util.*;

class Solution {
    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 4));
    }

    public static String convert(String s, int numRows) {
        char[] charArray = s.toCharArray();
        if (numRows == 1) {
            return s;
        }
        List<StringBuilder> list = new ArrayList<>();
        int pos = 0;
        for (int i = 0; i < numRows; i++) {
            StringBuilder sb = new StringBuilder();
            list.add(sb);
        }
        int a = numRows - 1;
        for (int i = 0; pos < charArray.length; i++) {
            if (a == 1 || i % a == 0) {
                for (int j = 0; j < numRows; j++) {
                    if (pos == charArray.length) {
                        break;
                    }
                    StringBuilder sb = list.get(j);
                    sb.append(charArray[pos++]);
                }
            } else {
                list.get(a - i % a).append(charArray[pos++]);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            StringBuilder stringBuilder = list.get(i);
            sb.append(stringBuilder);
        }
        return sb.toString();
    }
}