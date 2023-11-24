package com.company.interview.arrays;

import java.util.HashMap;
import java.util.Map;

public class FirstDuplicate {

    // 2 ifs nu era suficient de rapida
    // asa ca
    /**
     * firstDuplicate
     *
     *
     * Given an array a that contains only numbers in the range from 1 to a.length, find the first duplicate number for which the second occurrence has the minimal index. In other words, if there are more than 1 duplicated numbers, return the number for which the second occurrence has a smaller index than the second occurrence of the other number does. If there are no such elements, return -1.
     *
     * Example
     *
     * For a = [2, 1, 3, 5, 3, 2], the output should be solution(a) = 3.
     *
     * There are 2 duplicates: numbers 2 and 3. The second occurrence of 3 has a smaller index than the second occurrence of 2 does, so the answer is 3.
     *
     * For a = [2, 2], the output should be solution(a) = 2;
     *
     * For a = [2, 4, 3, 5, 1], the output should be solution(a) = -1.
     *
     * Input/Output
     *
     * [execution time limit] 3 seconds (java)
     *
     * [memory limit] 1 GB
     *
     * [input] array.integer a
     *
     * Guaranteed constraints:
     * 1 ≤ a.length ≤ 105,
     * 1 ≤ a[i] ≤ a.length.
     *
     * [output] integer
     *
     * The element in a that occurs in the array more than once and has the minimal index for its second occurrence. If there are no such elements, return -1
     *
     *
     * am mai vazut o solutie cute cu cineva care crea un array de booleane
     * si dupa daca era true ii lua indexul
     *
     * */

    int solution(int[] a) {
        Map<Integer, Integer> indexMap;
        indexMap = new HashMap<>();

        int result = Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (indexMap.containsKey(a[i])) {
                if(i < result) result = i;
            } else {
                indexMap.put(a[i], i);
            }
        }

        return result != Integer.MAX_VALUE ? a[result] : -1;
    }

    // solutie similara care mi a placut mult
    /**
     *
     int solution(int[] a) {

     boolean arr[] = new boolean[a.length + 1];

     for (int i = 0; i < a.length; i++) {
     if (arr[a[i]]) {
     return a[i];
     } else {
     arr[a[i]] = true;
     }
     }

     return -1;
     }
     *
     *
     * */

    public static void main(String[] args) {

    }
}
