package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution49 {
    public static void main(String[] args) {
        String[] strings = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        new Solution49().groupAnagrams(strings);

    }


    public List<List<String>> groupAnagrams(String[] strs) {
        new ArrayList<>(Arrays.stream(strs).collect(Collectors.groupingBy(s -> Arrays.toString(s.codePoints().sorted().toArray()))).values());
        List<String>[] result = new ArrayList[strs.length];
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String sort = sort(strs[i]);
            if (map.containsKey(sort)) {
                result[map.get(sort)].add(strs[i]);
            } else {
                map.put(sort, i);
                result[i] = new ArrayList<>();
                result[i].add(strs[i]);
            }

        }
        List<List<String>> realResult = new ArrayList<>();
        for (List<String> strings : result) {
            if (strings == null) {
                continue;
            }
            realResult.add(strings);
        }
        return realResult;
    }

    public String sort(String s) {
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

}