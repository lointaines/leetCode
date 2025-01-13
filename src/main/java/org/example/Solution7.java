package org.example;

import java.util.ArrayList;
import java.util.List;

class Solution7 {
    public static void main(String[] args) {

    }


    public int reverse(int x) {
        boolean flag = false;
        if (x < 0) {
            flag = true;
            x = -x;
        }
        StringBuilder sb = new StringBuilder();
        String string = sb.append(x).reverse().toString();
        try {
            int i = Integer.parseInt(string);
            return flag ? -i : i;
        } catch (Exception e) {
            return 0;
        }
    }

}