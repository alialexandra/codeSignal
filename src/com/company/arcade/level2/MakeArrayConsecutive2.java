package com.company.arcade.level2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MakeArrayConsecutive2 {

    int solution(int[] statues) {

        List<Integer> statuesList = Arrays.stream(statues).boxed().collect(Collectors.toList());;

        Set<Integer> missingStatues =
                IntStream.range(Collections.min(statuesList), Collections.max(statuesList))
                        .filter(i -> !statuesList.contains(i))
                        .boxed().collect(Collectors.toSet());

        return missingStatues.size();
    }

}
