package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution56 {
    public static void main(String[] args) {
        int[][] ints = new int[5][2];
        ints[0][0] = 2;
        ints[0][1] = 3;
        ints[1][0] = 5;
        ints[1][1] = 5;
        ints[2][0] = 2;
        ints[2][1] = 2;
        ints[3][0] = 3;
        ints[3][1] = 4;
        ints[4][0] = 3;
        ints[4][1] = 4;
        new Solution56().merge(ints);
    }

    public int[][] merge(int[][] intervals) {
        int max = intervals[0][1];

        for (int[] interval : intervals) {
            int start = interval[0];
            int end = interval[1];
            max = Math.max(max, start);
            max = Math.max(max, end);
        }
        int[] area = new int[max + 1];

        for (int[] interval : intervals) {
            int start = interval[0];
            int end = interval[1];
            if (area[start] == 0) {
                area[start] = 1;
            } else if (area[start] == 2 && start != end) {
                area[start] = 3;
            }
            if (area[end] == 0) {
                area[end] = 2;
            } else if (area[end] == 1 && end != start) {
                area[end] = 3;
            }

            for (int i = start + 1; i < end; i++) {
                area[i] += 3;
            }
        }
        List<int[]> result = new ArrayList<>();
        int start = -1;
        int end = -1;
        if (area[0] != 0) {
            start = 0;
            if (area[1] == 1) {
                end = 0;
                result.add(new int[]{start, end});
            }
        }
        for (int i = 1; i < area.length; i++) {
            int temp = area[i];
            if (i == area.length - 1) {
                if (area[area.length - 1] == 1) {
                    start = i;
                    end = area.length - 1;
                    result.add(new int[]{start, end});
                    break;
                }
            }
            if (temp == 1) {
                if(area[i+1] == 1)result.add(new int[]{i, i});
                start = i;
            } else if (temp == 2) {
                end = i;
                result.add(new int[]{start, end});
            }
        }

        int[][] res = new int[result.size()][2];
        for (int i = 0; i < result.size(); i++) {
            res[i][0] = result.get(i)[0];
            res[i][1] = result.get(i)[1];
        }
        return res;
    }
}