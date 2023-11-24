package com.company.arcade.level2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AlmostIncreasingSequence {

    static boolean solution(int[] sequence) {
        int removalCount = 0;
        for (int i = 1; i < sequence.length; i++) {
            if (sequence[i] <= sequence[i - 1]) {
                removalCount++;
                if (removalCount > 1) {
                    return false;
                }
                // If the current element is smaller than or equal to the one before,
                // try removing the current element; otherwise, try removing the previous element.
                if (i == 1 || sequence[i] > sequence[i - 2]) {
                    sequence[i - 1] = sequence[i];
                } else {
                    sequence[i] = sequence[i - 1];
                }
            }
        }

        return true;
    }


    public static void main(String[] args) {
        int []list = {1, 2, 1, 2};
        System.out.println(solution(list));
    }

}
