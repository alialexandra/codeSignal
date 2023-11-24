package com.company.interview.arrays;

import java.util.HashMap;
import java.util.Map;

public class FirstNotRepeatingCharcater {

    char solution(String s) {
        // very cute solution with last idex of
        char[] c=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(s.indexOf(c[i])==s.lastIndexOf(c[i]))
                return c[i];
        }
        return '_';
    }

    char solution2(String s) {
        int[] chars = new int[26];
        int[] pos = new int[26];
        int lowestIndex = Integer.MAX_VALUE;

        for (int i = 0; i < s.length(); i++) {
            int n = s.charAt(i) - 'a';
            if (pos[n] == 0) pos[n] = i + 1;

            chars[n]++;
        }

        for (int i = 0; i < 26; i++) {
            if (chars[i] == 1 && pos[i] < lowestIndex)
                lowestIndex = pos[i];
        }

        if (lowestIndex == Integer.MAX_VALUE) return '_';
        return s.charAt(lowestIndex - 1);
    }

    // personal solution
    char solution3(String s) {

        // return the first non repeating character in a string
    /* first try
    int stringLength = s.length();
    Map<Character, Integer> map =  new HashMap<>();

    for (int i = 0; i < stringLength; i++) {

        if(map.containsKey(s.charAt(i)))
            map.put(s.charAt(i), stringLength);
        else
            map.put(s.charAt(i), i);

    }


    Map<Character, Integer> filteredMap = map
                .entrySet()
                .stream()
                .filter(c -> c.getValue() != Integer.valueOf(stringLength))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

     Map<Character, Integer> sortedMap = new HashMap<>();
    if(filteredMap.size() != 0)
        {
            sortedMap = filteredMap
                .entrySet()
                .stream()
                .filter(c -> c.getValue() != Integer.valueOf(stringLength))
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1, // Merge function to handle duplicates
                        LinkedHashMap::new
                ));

            return sortedMap.entrySet().iterator().next().getKey();
        }


    return '_';
    */

        Map<Character, Integer> charCount = new HashMap<>();

        // Iterate through the string to count character occurrences
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Iterate through the string to find the first non-repeating character
        for (char c : s.toCharArray()) {
            if (charCount.get(c) == 1) {
                return c;
            }
        }

        // If no non-repeating character is found, return '_'
        return '_';
    }

    public static void main(String[] args) {

    }
}
